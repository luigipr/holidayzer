package com.holidayzer.api;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Holiday {
    private String data;
    private String nome;

    public Holiday (String data, String nome) throws Exception {
        
        this.data = data;
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<Holiday> getHolidaysFromFile(String filePath) throws Exception {
        List<Holiday> holidays = new ArrayList<>();

        List<String> lines = Files.readAllLines(Paths.get(filePath));

        for (String line : lines) {
            String[] parts = line.split(" => ");
            if (parts.length == 2) {
                String data = parts[0].replace("\"", "").trim();
                String nome = parts[1].replace("\"", "").trim();
                holidays.add(new Holiday(data, nome));
            }
        }

        return holidays;
    }

    public static void getHolidays(List<Holiday> holidays) {
        
        for (Holiday Holiday : holidays) {
            String dataString = Holiday.getData();
            System.out.println(dataString + " - " + Holiday.getNome());
        }
    }

    public static String checkHoliday(String data, List<Holiday> holidays) {
        String dataString = data;

        for (Holiday holiday : holidays) {
            String holidayDataString = holiday.getData();
            
            if (holidayDataString.equals(dataString)) {
                return "Dia " + dataString + " é " + holiday.getNome() + "! 🎉";
            }
        }
        return "Dia " + dataString + " não é Holiday 🥲";
    }
}
