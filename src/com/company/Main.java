package com.company;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(0, 2, 14, "белый", "картон");
        Box box1 = new Box(4, 10, 13, "зеленый", "фанера");
        Box box2 = new Box (1, 2, 20, "черный", "дерево");
        Box box3 = new Box(3,11, 6, "оранжевый", "бумага");
        Box box4 = new Box(15, 21, 7, "красный", "железо");

        System.out.print(box.getLength());
    }
}
