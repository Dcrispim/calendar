package br.com.calendar.user;

import br.com.calendar.event.Event;

import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Event> eventList;


    private String password;

    public User() {

    }

    public User(String name, String email, List<Event> eventList, String password) {
        this.name = name;
        this.email = email;
        this.eventList = eventList;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validatePassword(String password) {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }


}
