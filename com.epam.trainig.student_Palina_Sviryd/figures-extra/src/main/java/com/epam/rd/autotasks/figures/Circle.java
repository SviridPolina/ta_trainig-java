package com.epam.rd.autotasks.figures;

class Circle extends Figure {

    private Point center;
    private double r;

    public Circle(Point p, double Rad){
        this.center = p;
        this.r = Rad;

        if (area() == 0 || r < 0 || center == null) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Point centroid() {
        if(center == null){
            return null;
        }
        return center;
    }


    @Override
    public boolean isTheSame(Triangle figure) {
        return false;
    }

    public boolean isTheSame(Circle figure) {
        if(Math.abs(this.center.getX() - figure.center.getX()) < 0.01 && Math.abs(this.r - figure.r) < 0.01 && Math.abs(this.center.getY() - figure.center.getY()) < 0.01){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isTheSame(Quadrilateral figure) {
        return false;
    }

    public double area(){
        return Math.PI * r * r;
    }


}
