package com.example.admin.heartmonitor;

/**
 * Created by admin on 23/02/17.
 */

public class UserInformation {

    public int heartbeat;
    public int bloodPressure;

    public UserInformation(){


    }

    public UserInformation(int heartbeat, int bloodPressure) {
        this.heartbeat = heartbeat;
        this.bloodPressure = bloodPressure;
    }
}
