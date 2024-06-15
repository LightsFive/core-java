package com.lella.java.core.basic;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/*
write a Immutable class  having date map as class variable
we need to handle the mutable objects efficiently
 */
public final class ImmutableClass {
    private final int id;
    private final String name;

    private final Date date;
    private final Map<String, String> projects;

    public ImmutableClass(int id, String name, Date date, Map<String, String> projects) {
        this.id = id;
        this.name = name;
        this.date = new Date(date.getTime());
        this.projects = new HashMap<>();

        for (Map.Entry<String, String> entry : projects.entrySet()) {
            this.projects.put(entry.getKey(), entry.getValue());
        }

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return (Date) date.clone();
        //returning a clone object instead of original object as date is immutable
    }

    public Map<String, String> getProject() {
        return new HashMap<>(projects);
    }


}
