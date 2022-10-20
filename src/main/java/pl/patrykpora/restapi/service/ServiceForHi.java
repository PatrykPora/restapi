package pl.patrykpora.restapi.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope
public class ServiceForHi {


    public String hi() {
        return "hi";
    }

}
