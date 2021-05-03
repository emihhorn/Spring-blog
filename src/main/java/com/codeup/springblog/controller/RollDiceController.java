package com.codeup.springblog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String showRoll() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String guess(@PathVariable int n, Model model){
        int randomNum = (int)(Math.random() * (7-1) +1);
        model.addAttribute("randomNum", "The dice roll is: " + randomNum);
        model.addAttribute("userGuess", "Your guess was: " + n);
        boolean correctGuess = randomNum == n;
        boolean incorrectGuess = randomNum != n;
        model.addAttribute("correctGuess", correctGuess);
        model.addAttribute("incorrectGuess", incorrectGuess);
        return "/roll-dice";
    }

}
