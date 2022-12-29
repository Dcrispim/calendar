package br.com.calendar.invite;

import br.com.calendar.user.User;

public class Invite {
    private User sender;
    private User receiver;
    private Double eventID;
    private InviteResponse response;

    public Invite(User sender, User receiver, Double eventID) {
        this.sender = sender;
        this.receiver = receiver;
        this.eventID = eventID;
    }

    public void respond(User user, InviteResponse response){
        if(user.getEmail().equals(this.receiver.getEmail())){
            this.response = response;
        }


    };

}
