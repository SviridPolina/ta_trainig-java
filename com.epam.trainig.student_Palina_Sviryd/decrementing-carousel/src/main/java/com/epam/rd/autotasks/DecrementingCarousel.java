package com.epam.rd.autotasks;

public class DecrementingCarousel {
    static int capacity;
    int counter = 0;
    Boolean flag = true;
    //static List <Integer> elements = new ArrayList<>();
    static int [] arr ;


    public DecrementingCarousel(int capacity) {
        DecrementingCarousel.capacity = capacity;
        arr = new int[capacity];

    }



    public boolean addElement(int element){
        if (counter < capacity && element > 0 && flag) {
            arr[counter] = element;
            counter++;
            return true;
        }
        return false;



    }

    public CarouselRun run(){
        if (flag) {
            flag = false;
            return new CarouselRun();
        }
        else{
            return null;
        }
    }
}