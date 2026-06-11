//package com.rockfit.rockfit.controller;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class LoginController {
//    @GetMapping("/")
//    public String loginPage() {
//        return "login";
//    }
//}
package com.rockfit.rockfit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }


}
