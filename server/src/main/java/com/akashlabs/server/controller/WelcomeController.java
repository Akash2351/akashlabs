package com.akashlabs.server.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * User: anjana
 */
@Controller
public class WelcomeController {

    private static final Log logger = LogFactory.getLog(WelcomeController.class);

    @Autowired
    private ApplicationContext applicationContext;

/*    @RequestMapping(value = {"/ecat/", "/ecat*//**"})
    public String index() {
        return "forward:/index.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public AuthSession doLogin(@RequestParam String username, @RequestParam String password, @RequestParam(required = false) String restServer, HttpServletRequest request) {
        User user= new User();
        user.setUsername(username);
        user.setPassword(password);
        if (restServer != null && ! StringUtils.isEmpty(restServer.trim())) {
            user.setRestServer(restServer);
        }
        request.getSession().invalidate(); // invalidate any old session
        return loginService.authenticate(user, request);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    @ResponseBody
    public void doLogout(HttpServletRequest request) {
        loginService.logout();
        request.getSession().invalidate();

    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public AuthSession getUser() {
        return applicationContext.getBean(AuthSession.class);
    }*/

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String doLogin(HttpServletRequest request) {
        return "Welcome to test controller!";
    }
}
