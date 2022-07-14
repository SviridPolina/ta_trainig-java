package com.epam.rd.autotasks.house;

import java.util.ArrayList;
import java.util.List;

public class House <T> {

    private List<T> residents = new ArrayList();

    public void enter(T resident) {
        residents.add(resident);
//        checkConflicts();
    }

    public void leave(T resident) {
        residents.remove(resident);
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("There are following residents in the house:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }
}