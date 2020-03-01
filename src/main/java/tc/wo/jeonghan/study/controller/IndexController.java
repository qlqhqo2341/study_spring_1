package tc.wo.jeonghan.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tc.wo.jeonghan.study.service.UserService;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public Object getIndex() {
        return userService.getUser("");
    }
}
