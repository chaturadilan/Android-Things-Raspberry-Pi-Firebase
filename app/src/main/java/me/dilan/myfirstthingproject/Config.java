/**
 * Created by Chatura Dilan Perera on 16/12/2016.
 */
package me.dilan.myfirstthingproject;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Config {

    private int delay;

    public Config() {

    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
