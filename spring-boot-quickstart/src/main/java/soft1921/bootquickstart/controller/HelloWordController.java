package soft1921.bootquickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @authoradmin
 * @date 2021/3/23 8:40
 * @description HelloWordController
 */
@RestController
@RequestMapping("api")
public class HelloWordController {
    @GetMapping(value = "hello")
    public String hello() {
        return "Hello World";
    }
}



