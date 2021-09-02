package com.company;

public class Main {

    public static void main(String[] args) {

        // write your code here

        SomeClass someClass = new SomeClass();

        int x1 = 10;
        Integer x2 = 20;
        SomeObject o = new SomeObject();
        o.z = 30;


        System.out.println(
                "x1 = " + x1 +
                        "x2 = " + x2 +
                        "o.z = " + o.z
        );

        someClass.someMethod(x1, x2, o);

        System.out.println(
                "x1 = " + x1 +
                        "x2 = " + x2 +
                        "o.z = " + o.z
        );

    }

    static class SomeObject {
        public int z;
    }


    static class SomeClass {

        public void someMethod(int x1, Integer x2, SomeObject o) {

            x1++;
            x2++;
            o.z++;
        }
    }
}
