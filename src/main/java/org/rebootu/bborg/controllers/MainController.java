package org.rebootu.bborg.controllers;

import org.rebootu.bborg.models.dao.MarketDao;
import org.rebootu.bborg.models.dao.StockDao;
import org.rebootu.bborg.models.dao.TemperatureDao;
import org.rebootu.bborg.models.util.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Brett on 6/8/2015.
 */
@Controller
public class MainController {

    @Autowired
    MarketDao marketDao;

    @Autowired
    StockDao stockDao;

    @Autowired
    TemperatureDao temperatureDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String stockHome(Model model) {

        // pass data to template
        model.addAttribute("title", "StockHome");
        model.addAttribute("stockNavClass", "active");
        return "stock_home";
    }

    @RequestMapping(value = "/tempForm", method = RequestMethod.POST)
    public String tempForm(Model model) {

        // pass data to template
        model.addAttribute("title", "TempForm");
        model.addAttribute("tempNavClass", "active");
        return "temp_form";
    }

    @RequestMapping(value = "/tempDisplay", method = RequestMethod.POST)
    public String temp(String symbol, Model model) {

        // pass data to template
        model.addAttribute("title", "TempDisplay");
        model.addAttribute("tempNavClass", "active");
        return "temp_display";
    }

    @RequestMapping(value = "/foreignForm", method = RequestMethod.POST)
    public String foreignForm(Model model) {

        // pass data to template
        model.addAttribute("title", "ForeignForm");
        model.addAttribute("foreignNavClass", "active");
        return "foreign_form";
    }

    @RequestMapping(value = "/foreignDisplay", method = RequestMethod.POST)
    public String foreign(String symbol, Model model) {

        // pass data to template
        model.addAttribute("title", "ForeignDisplay");
        model.addAttribute("foreignNavClass", "active");
        return "foreign_display";
    }

    @RequestMapping(value = "/gainsForm", method = RequestMethod.POST)
    public String gainsForm(Model model) {

        // pass data to template
        model.addAttribute("title", "GainsForm");
        model.addAttribute("gainsNavClass", "active");
        return "gains_form";
    }

    @RequestMapping(value = "/gainsDisplay", method = RequestMethod.POST)
    public String gains(String symbol, Model model) {

        // pass data to template
        model.addAttribute("title", "GainsDisplay");
        model.addAttribute("gainsNavClass", "active");
        return "gains_display";
    }

    @RequestMapping(value = "/lossesForm", method = RequestMethod.POST)
    public String lossesForm(Model model) {

        // pass data to template
        model.addAttribute("title", "LossesForm");
        model.addAttribute("lossesNavClass", "active");
        return "losses_form";
    }

    @RequestMapping(value = "/lossesDisplay", method = RequestMethod.POST)
    public String losses(String symbol, Model model) {

        // pass data to template
        model.addAttribute("title", "LossesDisplay");
        model.addAttribute("lossesNavClass", "active");
        return "losses_display";
    }

    @RequestMapping(value = "/openingForm", method = RequestMethod.POST)
    public String openingForm(Model model) {

        // pass data to template
        model.addAttribute("title", "OpeningForm");
        model.addAttribute("openingNavClass", "active");
        return "opening_form";
    }

    @RequestMapping(value = "/openingDisplay", method = RequestMethod.POST)
    public String opening(String symbol, Model model) {

        // pass data to template
        model.addAttribute("title", "OpeningDisplay");
        model.addAttribute("openingNavClass", "active");
        return "opening_display";
    }

    @RequestMapping(value = "/closingForm", method = RequestMethod.POST)
    public String closingForm(Model model) {

        // pass data to template
        model.addAttribute("title", "ClosingForm");
        model.addAttribute("closingNavClass", "active");
        return "closing_form";
    }

    @RequestMapping(value = "/closingDisplay", method = RequestMethod.POST)
    public String closing(String symbol, Model model) {

        // pass data to template
        model.addAttribute("title", "ClosingDisplay");
        model.addAttribute("closingNavClass", "active");
        return "closing_display";
    }

    @RequestMapping(value = "/foreignOpenForm", method = RequestMethod.POST)
    public String foreignOpenForm(Model model) {

        // pass data to template
        model.addAttribute("title", "ForeignOpenForm");
        model.addAttribute("foreignOpenNavClass", "active");
        return "foreign_open_form";
    }

    @RequestMapping(value = "/foreignOpenDisplay", method = RequestMethod.POST)
    public String foreignOpen(String symbol, Model model) {

        // pass data to template
        model.addAttribute("title", "ForeignOpenDisplay");
        model.addAttribute("foreignOpenNavClass", "active");
        return "foreign_open_display";
    }

    @RequestMapping(value = "/foreignCloseForm", method = RequestMethod.POST)
    public String foreignCloseForm(Model model) {

        // pass data to template
        model.addAttribute("title", "ForeignCloseForm");
        model.addAttribute("foreignCloseNavClass", "active");
        return "foreign_close_form";
    }

    @RequestMapping(value = "/foreignCloseDisplay", method = RequestMethod.POST)
    public String foreignClose(String symbol, Model model) {

        // pass data to template
        model.addAttribute("title", "ForeignCloseDisplay");
        model.addAttribute("foreignCloseNavClass", "active");
        return "foreign_close_display";
    }

}
