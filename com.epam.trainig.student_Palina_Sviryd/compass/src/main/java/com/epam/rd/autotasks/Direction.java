package com.epam.rd.autotasks;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {
        if(degrees % 45 != 0){
            return null;
        }
        if(degrees < 0){
            return Direction.values()[(360 -(Math.abs(degrees)) % 360) / 45];
        }
        else {
            return Direction.values()[(Math.abs(degrees) % 360) / 45];
        }
    }

    public static Direction closestToDegrees(int degrees) {
        int n = degrees / 360;
        degrees = degrees - n * 360;

        if(degrees < 0){
            degrees = 360 + degrees;
        }

        if(degrees >= 0 && degrees <= 22){
            return Direction.ofDegrees(0);
        }
        if(degrees >= 23 && degrees <= 67){
            return Direction.ofDegrees(45);
        }
        if(degrees >= 68 && degrees <= 112){
            return Direction.ofDegrees(90);
        }
        if(degrees >= 113 && degrees <= 157){
            return Direction.ofDegrees(135);
        }
        if(degrees >= 158 && degrees <= 202){
            return Direction.ofDegrees(180);
        }
        if(degrees >= 203 && degrees <= 245){
            return Direction.ofDegrees(225);
        }
        if(degrees >= 246 && degrees <= 292){
            return Direction.ofDegrees(270);
        }
        if(degrees >= 293 && degrees <= 337) {
            return Direction.ofDegrees(315);
        }
        else{
            return Direction.ofDegrees(0);
        }
    }

    public Direction opposite() {
        return Direction.values()[((this.degrees + 180) % 360)/45];
    }

    public int differenceDegreesTo(Direction direction) {
        return Math.min(Math.abs((this.degrees - direction.degrees)), (360 - Math.abs(direction.degrees - this.degrees)));
    }

    public static Direction[] arr = new Direction[] { N, NE, E, SE, S, SW, W, NW };
}
