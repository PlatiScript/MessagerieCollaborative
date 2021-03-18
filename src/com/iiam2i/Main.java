package com.iiam2i;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Message m1 = new Message();
        m1.setContent("coucou");
        m1.setDate_sent(LocalDateTime.now());

        User yanning = new User();
        yanning.setUsername("Yanning");
        m1.setSender(yanning);

        User jerem = new User();
        jerem.setUsername("Jerem");
        m1.setReceiver(jerem);


	    System.out.println(m1.toString());
    }
}
