package com.example.ExamenSemanaTres.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter @Setter
public class Cd {

    private int id;
    private String nombre;

    public void getDiasDevolocion(){
        LocalDateTime myDate = LocalDateTime.now();
        System.out.println("fecha anterior: "+ myDate);
        LocalDateTime fechaEntrega = myDate.plusDays(7);

        DateTimeFormatter MiFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDay = myDate.format(MiFormat);
        System.out.println("After formatting: " + formatDay);

    }
}
