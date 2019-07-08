package com.ruoyi.wechats.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: Cosmetologys-master
 * @Package: com.yss.cmlweb.web
 * @ClassName: IndexController
 * @Author: 760599245
 * @Description: ${description}
 * @Date: 2019/6/24 13:48
 * @Version: 1.0
 */
@Controller
public class IndexController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello Springboot01";
    }
}
