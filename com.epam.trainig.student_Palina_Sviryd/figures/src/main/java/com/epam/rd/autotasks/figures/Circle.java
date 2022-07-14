package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    private Point center;
    private double r;

    public Circle(Point p, double Rad){
        this.center = p;
        this.r = Rad;
    }

    public double area(){
        return Math.PI * r * r;
    }

    public String pointsToString1() {
        return String.format("(%s,%s)%s", center.getX(), center.getY(), r);
    }

    public String pointsToString() {
        return String.format("(%s,%s)", center.getX(), center.getY());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString1() + "]";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(center.getX() - r, center.getY());
    }
}
