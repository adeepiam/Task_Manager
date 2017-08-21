package com.example.user.task_manager.Data;

import java.util.HashMap;

/**
 * Created by user on 13/07/2017.
 */

public class MyUser {
    private String name;
    private  String uKey_email; // key
    private  String phone; // phone number
    private HashMap<String,Object> groupsKeys =new HashMap<>();
    private HashMap<String,Object> taskKeys=new HashMap<>();

    public void addTasksKey (String taskKey){
        this.taskKeys.put(taskKey,true);
    }

    public void addGroupsKey (String groupsKey){
        this.taskKeys.put(groupsKey,true);
    }
    public void setName(String name) {
        this.name = name;    }

    public void setuKey_email(String uKey_email) {
        this.uKey_email = uKey_email;    }

    public void setPhone(String phone) {
        this.phone = phone;    }

    public void setGroupsKeys(HashMap<String, Object> groupsKeys) {
        this.groupsKeys = groupsKeys;    }

    public void setTaskKeys(HashMap<String, Object> taskKeys) {
        this.taskKeys = taskKeys;    }

    public String getName() {
        return name;    }

    public String getuKey_email() {
        return uKey_email.replace('.','*');    }

    public String getPhone() {
        return phone;    }

    public HashMap<String, Object> getGroupsKeys() {
        return groupsKeys;    }

    public HashMap<String, Object> getTaskKeys() {
        return taskKeys;    }


    public MyUser()
    {


    }
}
