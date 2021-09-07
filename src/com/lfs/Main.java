package com.lfs;

public class Main {

        public static void main(String[] args) {
        CircleTest.main(args);  //Circle
        Human human = new Human(new Head(),new Hand(),new Hand(),new Leg(),new Leg(), "Vasia"); //Human
        human.getHead().setNormal(false);   //травма головы
        System.out.println(human);
        if (!human.getHead().isNormal()){   //лечение
        human.getHead().setNormal(true);
        }
        System.out.println(human);
        BookTest.main(args);    //Book
    }

}
