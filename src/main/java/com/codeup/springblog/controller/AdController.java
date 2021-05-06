package com.codeup.springblog.controller;

import com.codeup.springblog.models.Ad;
import com.codeup.springblog.repositories.AdsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class AdController {

    private final AdsRepository adsDao;

    public AdController(AdsRepository adsDao) {
       this.adsDao = adsDao;
    }

    @GetMapping("/ads")
    @ResponseBody
    public List<Ad> getAllAds() {
        return adsDao.findAll();
    }

    @GetMapping("/ads{id}")
    public List<Ad> getOneAd(@PathVariable long id, Model vModel) {
        Ad ad = adsDao.getOne(id);
        vModel.addAttribute("ad", ad);
        return adsDao.findAll();
    }

    @GetMapping("/ads/delete")
    public String deleteAd() {
        adsDao.deleteById(4L);
        return "redirect:/ads";
    }

    @GetMapping("/ads/create")
    public String createAd() {
        Ad ad = new Ad(
                "Unicorn",
                "Very Beautiful",
                5000
        );
        adsDao.save(ad);
        return "redirect:/ads";
    }

    @GetMapping("/ads/update")
    public String updateAd() {
        Ad updatedAd = new Ad(
                101,
                "Dragon",
                "It is a dragon.",
                200
        );
        adsDao.save(updatedAd);
        return "redirect:/ads";
    }

}
