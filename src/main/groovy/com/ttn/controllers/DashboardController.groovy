package com.ttn.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


/**
 * Created by ttnd on 6/4/16.
 */

@Controller
class DashboardController {

    @RequestMapping("/")
    String home() {
        return "home";
    }
}
