package com.holidayzer.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/feriados")
public class HolidayControler {

    @GetMapping
    public List<Holiday> hollidays() {
        holliday
        return "Olá Spring!";
    }
}
