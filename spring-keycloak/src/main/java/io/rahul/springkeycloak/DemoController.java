package io.rahul.springkeycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class DemoController {

    @GetMapping("/api/admin")
    public String admin() {
        return "hello admin";
    }

    @GetMapping("/api/manager")
    public String manager() {
        return "hello manager";
    }

}
