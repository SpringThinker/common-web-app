package org.xlys.commonweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Aim: to provide some functionalities for other repos
 * */
@SpringBootApplication
@Slf4j
public class CommonWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonWebApplication.class, args);
    }
}
