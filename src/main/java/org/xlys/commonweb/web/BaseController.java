package org.xlys.commonweb.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/cwa")
public class BaseController {

    private static final String COMMON_RESULT = "pong";

    @GetMapping("/ping")
    public String ping() {
        return COMMON_RESULT;
    }

}
