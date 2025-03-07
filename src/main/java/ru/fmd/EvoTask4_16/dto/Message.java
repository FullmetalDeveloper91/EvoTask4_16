package ru.fmd.EvoTask4_16.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private  int id;
    private String title;
    private String text;
    private LocalDateTime time;
}
