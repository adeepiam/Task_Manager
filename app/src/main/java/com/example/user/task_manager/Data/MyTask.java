package com.example.user.task_manager.Data;

/**
 * Created by user on 13/07/2017.
 */

public class MyTask {
    private  String tKey;
    private String text;
    private boolean isCompleted;
    private long createdAt;
    private double loc_lat, loc_lng;
    private String address;
    private String gKey, uKey; //users and group IDees

    public MyTask() {
    }

    public String gettKey() {
        return tKey;    }

    public String getText() {
        return text;    }

    public boolean isCompleted() {
        return isCompleted;    }

    public long getCreatedAt() {
        return createdAt;    }

    public double getLoc_lat() {
        return loc_lat;    }

    public double getLoc_lng() {
        return loc_lng;    }

    public String getAddress() {
        return address;    }

    public String getgKey() {
        return gKey;    }

    public String getuKey() {
        return uKey;    }

    public void settKey(String tKey) {
        this.tKey = tKey;    }

    public void setText(String text) {
        this.text = text;    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;    }

    public void setLoc_lat(double loc_lat) {
        this.loc_lat = loc_lat;    }

    public void setLoc_lng(double loc_lng) {
        this.loc_lng = loc_lng;    }

    public void setAddress(String address) {
        this.address = address;    }

    public void setgKey(String gKey) {
        this.gKey = gKey;    }

    public void setuKey(String uKey) {
        this.uKey = uKey;    }
}
