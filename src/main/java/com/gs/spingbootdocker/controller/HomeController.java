package com.gs.spingbootdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO:
 *
 * @author WangLonglong
 * @email caption1215@gmail.com
 * @date 2019/3/21 14:52
 */
@RestController
public class HomeController {

    @RequestMapping({"", "index"})
    public String index() {
        return "Hello docker world!";
    }
}
