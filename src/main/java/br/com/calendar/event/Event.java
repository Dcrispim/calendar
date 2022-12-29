package br.com.calendar.event;

import br.com.calendar.user.User;

import java.time.LocalDateTime;
import java.util.List;

public class Event {
    private LocalDateTime date;
    private String name;
    private String description;
    private String host;
    private String local;
    private List<User> guestList;


}
