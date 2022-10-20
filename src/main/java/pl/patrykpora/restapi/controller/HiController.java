package pl.patrykpora.restapi.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykpora.restapi.service.ServiceForHi;

@RequiredArgsConstructor
@RestController
public class HiController {

    private final ServiceForHi serviceForHi;


    @GetMapping("/")
    public String hi() {
       return serviceForHi.hi();
    }

}
