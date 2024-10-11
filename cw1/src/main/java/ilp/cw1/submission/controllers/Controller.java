package ilp.cw1.submission.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/isAlive")
    public boolean isAlive(){
        return true;
    }
}
