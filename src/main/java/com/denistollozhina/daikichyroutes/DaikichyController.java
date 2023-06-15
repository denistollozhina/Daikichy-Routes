package com.denistollozhina.daikichyroutes;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichyController {
    @GetMapping(value = "/daikichy", produces = MediaType.TEXT_PLAIN_VALUE)
    public String welcome() {
        return "Welcome!";
    }
    @GetMapping(value = "/daikichy/today", produces = MediaType.TEXT_PLAIN_VALUE)
    public String today() {
        return "Today you will find luck in all your endeavors!";
}
    @GetMapping(value = "/daikichy/tomorrow", produces = MediaType.TEXT_PLAIN_VALUE)
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
}}
