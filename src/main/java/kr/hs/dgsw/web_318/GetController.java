package kr.hs.dgsw.web_318;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class GetController {


    @GetMapping("/greeting")
    public String sayHi(@RequestParam String name){
        return "Hello " + name;
    }

    @GetMapping("/greeting/{name}")
    public String sayHi2(@PathVariable String name) {
        return "Hello " + name;
    }
}
