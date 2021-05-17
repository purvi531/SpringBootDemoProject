package com.demoproject.purvi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("home")
    public String fun()
    {
        return "<h1> hello</h1>" +
                "<p>Thus is My first web application";
    }
}
