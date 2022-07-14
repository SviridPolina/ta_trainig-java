package com.epam.rd.autotasks;


public class CompleteByRequestTask implements Task {

    private Boolean close = false;
    private Boolean flag = false;

    public void CompliteByRequestTask(){
        this.flag = false;
        this.close = false;
    }

    @Override
    public void execute() {
        if (close == true){
            flag = true;
            close = false;
        }
    }

    @Override
    public boolean isFinished() {
        return flag;
    }

    public void complete() {
        close = true;
    }
}
