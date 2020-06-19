package sun.sundy.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {

    @RequestMapping("/hello")
    public String say(){
        return "Hello Llaria！";
    }
}
