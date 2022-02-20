package com.crudservice.domain;

import lombok.Data;

import java.util.Date;

@Data
public class UserData {

    private String id;

    private String work;

    private String training;

    private String social;

    private String walking;

    private String sex;

    private String fap;

    private String joy;

    private String focus;

    private String homeDuties;

    private String foodAlcohol;

    private Date nightSleepTime;

    private Date awakeTime;

    private Date daySleepTime;

    private Date assignmentTime;

    private String dayNotes;
}
