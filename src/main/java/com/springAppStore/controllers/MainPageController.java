package com.springAppStore.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainPageController {
    private final static Logger LOGGER = LoggerFactory.getLogger(MainPageController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/mainPage")
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.info("First Input");
        ModelAndView model = new ModelAndView("mainPage");
        final String test = "Test Data !!!";
        model.addObject("testData",test);
        return model;
    }
}
