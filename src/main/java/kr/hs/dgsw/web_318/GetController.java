package kr.hs.dgsw.web_318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class GetController {

    @Autowired
    private GreetingService gs;

    @GetMapping("/greeting")
    public String sayHi(@RequestParam String name){
        return gs.sayHi(name);
    }

    @GetMapping("/greeting/{name}")
    public String sayHi2(@PathVariable String name) {
        return gs.sayHi(name);
    }
}
