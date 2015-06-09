package org.rebootu.bborg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Brett on 6/8/2015.
 */
@Controller
public class MainController {
    @RequestMapping(value="/")
    public String index(Model model) {
        return "stock_main";
    }
}
