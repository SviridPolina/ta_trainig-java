package com.epam.rd.autotasks;

import java.util.LinkedList;
import java.util.Queue;

public class TaskCarousel {

    private Queue<Task> q;
    private int maxcapacity;

    public TaskCarousel(int capacity) {
        Queue <Task> s = new LinkedList<>();

        this.q = s;
        this.maxcapacity = capacity;
    }

    public boolean addTask(Task task) {
        if (task.isFinished() || q.size() == maxcapacity){
            return false;
        }
        else{
            q.offer(task);
            return true;
        }
    }

    public boolean execute() {

        if (q.isEmpty()){
            return false;
        }
        else{
            Task t = q.element();
            q.remove();
            if(t.isFinished()){
                return true;
            }
            t.execute();
            if(t.isFinished()){
                return true;
            }
            else{
                q.offer(t);
                return true;
            }
        }
    }

    public boolean isFull() {
        if (q.size() == maxcapacity){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty() {
        if (q.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

}
