package com.holidayzer.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.holidayzer.api.Holiday;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/holidays")
public class HolidayController {

		// Criação da variável de lista de feriados
    List<Holiday> holidays = new ArrayList<>();

		// Construtor: assim que cria o controller, preenche a lista de feriados
    HolidayController() throws Exception {
        fillHolidaysList();
    }

		// Get apenas retorna a lista completa (não é mais um println)
    @GetMapping
    public List<Holiday> getHolidays() {
        return holidays;
    }

		// Ao invés de println, retorna string com mensagem
    @GetMapping("/{date}")
    public String getHolidayByDate(@PathVariable String date) {
        for (Holiday h : holidays) {
            if (h.getData().equals(date)) {
                return "Dia " + h.getData() + " é " + h.getNome() + "! 🎉";
            }
        }
        return "Dia " + date + " não é feriado 🥲";
    }

		// Função que preenche o array de feriados
    public void fillHolidaysList() throws Exception  {
        holidays.clear();
        holidays.add(new Holiday("Confraternização Mundial", "01-01-2024"));
        holidays.add(new Holiday("Carnaval", "12-02-2024"));
        holidays.add(new Holiday("Carnaval", "13-02-2024"));
        holidays.add(new Holiday("Sexta-feira Santa", "29-03-2024"));
        holidays.add(new Holiday("Tiradentes", "21-04-2024"));
        holidays.add(new Holiday("Dia do Trabalho", "01-05-2024"));
        holidays.add(new Holiday("Corpus Christi", "30-05-2024"));
        holidays.add(new Holiday("Independência do Brasil", "07-09-2024"));
        holidays.add(new Holiday("Nossa Senhora Aparecida", "12-10-2024"));
        holidays.add(new Holiday("Finados", "02-11-2024"));
        holidays.add(new Holiday("Proclamação da República", "15-11-2024"));
        holidays.add(new Holiday("Dia Nacional de Zumbi e da Consciência Negra", "20-11-2024"));
        holidays.add(new Holiday("Natal", "25-12-2024"));
    }
}