package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{x}/and/{y}", method = RequestMethod.GET)
    @ResponseBody
    public int addXAndY(@PathVariable int x, @PathVariable int y) {

        return x + y;
    }

    @RequestMapping(path = "/subtract/{x}/from/{y}", method = RequestMethod.GET)
    @ResponseBody
    public int subtractXFromY(@PathVariable int x, @PathVariable int y) {

        return y - x;
    }

    @RequestMapping(path = "multiply/{x}/and/{y}", method = RequestMethod.GET)
    @ResponseBody
    public int multiplyXAndY(@PathVariable int x, @PathVariable int y) {

        return x * y;
    }

    @RequestMapping(path = "divide/{x}/by/{y}", method = RequestMethod.GET)
    @ResponseBody
    public int divideXByY(@PathVariable int x, @PathVariable int y) {

        return x / y;
    }

}

