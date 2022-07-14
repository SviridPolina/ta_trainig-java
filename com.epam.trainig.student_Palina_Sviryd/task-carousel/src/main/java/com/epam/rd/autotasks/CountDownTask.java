package com.epam.rd.autotasks;

public class CountDownTask implements Task{

    private Boolean flag;
    private int count;

    public CountDownTask(int value){
        if (value <= 0){
            this.count = 0;
            this.flag = true;
        }
        else {
            this.count = value;
            this.flag = false;
        }
    }

    public int getValue(){
        return count;
    }


    @Override
    public void execute(){
        if (count > 0){
            count--;
            if (count == 0){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        else{
            flag = true;
        }
    }

    @Override
    public boolean isFinished(){
        return flag;
    }
}
