package pl.patrykpora.restapi.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykpora.restapi.service.ServiceForHi;

@RequiredArgsConstructor
@RestController
@Log4j2
public class HiController {


    private final ServiceForHi serviceForHi;


    @GetMapping("/")
    public String hi() {
        log.info("it is test log !!!! health check");
        return serviceForHi.hi();
    }

}
