package com.epam.rd.autotasks.intersection;

public class Line {

    private int kof;
    private int bof;


    public Line(int k, int b) {
        this.kof = k;
        this.bof = b;
    }

    public Point intersection(Line other) {
        if (other.bof == this.bof && other.kof == this.kof){
            Point p = null;
            return p;
        }

        if (other.bof != this.bof && other.kof == this.kof){
            Point p = null;
            return p;
        }

        int x = (other.bof - this.bof) / (this.kof - other.kof);
        int y = this.kof * x + this.bof;

        Point p = new Point(x, y);
        return p;
    }

}
