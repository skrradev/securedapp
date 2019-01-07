package kz.whatevertest.securedapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {


    @GetMapping("/darkness")
    public String getDarkness() {

        return "darkness";


    }


    @GetMapping("/main")
    public String mainPage() {
       return "MAIN PAGE GO";
    }

}
