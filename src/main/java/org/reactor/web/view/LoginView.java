package org.reactor.web.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginView {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(){
        return ViewConstant.LOGIN;
    }
}
