package com.epam.rd.autotasks.figures;

abstract class Figure{

    public abstract Point centroid();
    public abstract boolean isTheSame(Triangle figure);
    public abstract boolean isTheSame(Circle figure);
    public abstract boolean isTheSame(Quadrilateral figure);
    public abstract double area();

}
