package com.example.demo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;

@Controller
public class TestController {

        @RequestMapping("/a")
        @ResponseBody
        public String login(HttpSession session){
            session.setAttribute("username","admin");
            session.setAttribute("password","123456");
            return "success";
        }
        @RequestMapping("/b")
        @ResponseBody
        public String loginout(HttpSession session){
            session.invalidate();
            return"success";
        }
        @RequestMapping("/c")
        @ResponseBody
        public String loginin(HttpSession session) {
            return session.getAttribute("username").toString();
        }
        @RequestMapping("/d")
        @ResponseBody
        public String loginIn(HttpSession session){
            return session.getAttribute("password").toString();
    }
}


