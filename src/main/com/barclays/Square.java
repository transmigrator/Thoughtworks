package com.barclays;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double perimeter(){
        return 4*(side);
    }

    public double area(){
        return side*side;
    }

}
