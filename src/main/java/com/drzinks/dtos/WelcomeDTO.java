package com.drzinks.dtos;

/**
 * Created by golebiow on 2016-03-10.
 */
public class WelcomeDTO {

    private String title;
    private String welcomeMessage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
