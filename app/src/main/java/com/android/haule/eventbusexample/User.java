package com.android.haule.eventbusexample;

import java.io.Serializable;

/**
 * Created by Hau Le on 2018-10-18.
 */
public class User implements Serializable {
    public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
