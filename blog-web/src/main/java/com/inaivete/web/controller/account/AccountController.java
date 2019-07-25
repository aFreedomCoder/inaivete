package com.inaivete.web.controller.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
@RequestMapping(value = "/api/v1/vote")
public class AccountController {

    @RequestMapping("/name")
    @ResponseBody
    public String getMemberSelect(String name){
        return name;
    }
}
