package com.company;

public class Box {
    private double length = 1;
    private double height = 1;
    private double width = 1;
    private String colour;
    private String material;

    public Box(double length, double height, double width) {
        if (validateBoxSizeField(height)) {
            this.height = height;
        }

        if (validateBoxSizeField(width)) {
            this.width = width;
        }

        if (validateBoxSizeField(length)) {
            this.length = length;
        }
    }

    public Box(double length, double height, double width, String colour, String material) {
        this(length, height, width);
        this.colour = colour;
        this.material = material;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        if (validateBoxSizeField(length)) {
            this.length = length;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (validateBoxSizeField(height)) {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (validateBoxSizeField(width)) {
            this.width = width;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    private boolean validateBoxSizeField(double field) {
        if (field <= 0 ) {
            System.out.println("Нельзя установить величину меньше либо равной 0");
            return false;
        } else {
            return true;
        }
    }

}
