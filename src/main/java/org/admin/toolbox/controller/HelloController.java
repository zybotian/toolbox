package org.admin.toolbox.controller;

import org.admin.toolbox.biz.HelloBiz;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloBiz helloBiz;

    @ResponseBody
    @RequestMapping("/hello")
    public Object hello(@RequestParam("msg") String msg) {
        return helloBiz.hello(msg);
    }
}
