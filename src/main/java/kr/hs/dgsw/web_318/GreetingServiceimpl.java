package kr.hs.dgsw.web_318;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceimpl  implements GreetingService{
    @Override
    public String sayHi(String name) {
        return "Service: Hello " + name;
    }
}
