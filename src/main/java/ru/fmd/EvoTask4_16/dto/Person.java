package ru.fmd.EvoTask4_16.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    private String firstname;
    private String surname;
    private String lastname;
    private LocalDate birthday;
}
