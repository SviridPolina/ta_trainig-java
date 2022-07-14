package com.epam.rd.autotasks.segments;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    private double bof;
    private double kof;

    public Segment(Point start, Point end) {

        if (start.getX() == end.getX() && start.getY() == end.getY()) {

            throw new IllegalArgumentException();
        }
        if (start == null || start == null) {

            throw new IllegalArgumentException();
        }


        this.x1 = start.getX();
        this.x2 = end.getX();

        this.y1 = start.getY();
        this.y2 = end.getY();


        this.kof = (end.getY() - start.getY()) / (end.getX() - start.getX());
        this.bof = end.getY() - kof * end.getX();

    }

    double length() {

        double len = sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        return len;
    }

    Point middle(){

        return new Point((x1 + x2) / 2, (y1 + y2) / 2);
    }

    Point intersection(Segment other) {
        if (other.bof == this.bof && other.kof == this.kof){
            Point p = null;
            return p;
        }

        if (other.bof != this.bof && other.kof == this.kof){
            Point p = null;
            return p;
        }

        double x = (other.bof - this.bof) / (this.kof - other.kof);
        double y = this.kof * x + this.bof;

        if (x < Math.min(other.x1, other.x2) || y < Math.min(other.y1, other.y2) || x > Math.max(other.x1, other.x2) || y > Math.max(other.y1, other.y2)){
            Point p = null;
            return p;
        }

        if (x < Math.min(this.x1, this.x2) || y < Math.min(this.y1, this.y2) || x > Math.max(this.x1, this.x2) || y > Math.max(this.y1, this.y2)){
            Point p = null;
            return p;
        }

        Point p = new Point(x, y);
        return p;
    }

}
