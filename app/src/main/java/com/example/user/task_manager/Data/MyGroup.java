package com.example.user.task_manager.Data;

import java.util.HashMap;

/**
 * Created by user on 13/07/2017.
 */

public class MyGroup {

    private String gKey;
    private String mngrUkey;
    private String name;
    private HashMap<String, Object> usersKeys=new HashMap<>();
    private HashMap<String, Object> tasksKeys=new HashMap<>();

    public MyGroup() {
    }

    public String getgKey() {
        return gKey;    }

    public String getMngrUkey() {
        return mngrUkey;    }

    public String getName() {
        return name;    }

    public HashMap<String, Object> getUsersKeys() {
        return usersKeys;    }

    public HashMap<String, Object> getTasksKeys() {
        return tasksKeys;    }

    public void setgKey(String gKey) {
        this.gKey = gKey;    }

    public void setMngrUkey(String mngrUkey) {
        this.mngrUkey = mngrUkey;    }

    public void setName(String name) {
        this.name = name;    }

    public void setUsersKeys(HashMap<String, Object> usersKeys) {
        this.usersKeys = usersKeys;    }

    public void setTasksKeys(HashMap<String, Object> tasksKeys) {
        this.tasksKeys = tasksKeys;    }



    public void  addTaskKey (String taskKey) // adding Task ID to task keys group
    {
        this.tasksKeys.put(taskKey, true);
    }
}

