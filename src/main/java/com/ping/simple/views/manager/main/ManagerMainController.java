package com.ping.simple.views.manager.main;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
@RequestMapping(value = "/manager")
@Slf4j
@RequiredArgsConstructor
public class ManagerMainController {

    private final ManagerMainService managerMainService;

    @GetMapping(value="/main")
    public ModelAndView MainPage(@RequestParam Map<String, Object> params) {
        return new ModelAndView("/manager/main/main");
    }

}

