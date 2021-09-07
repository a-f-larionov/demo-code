package com.company.refs;

public class Execute {

    private int x;

    private Integer y;

    private final SomeObject o = new SomeObject();

    public void run() {

        x = 10;
        y = 20;
        o.z = 30;

        printValues();
        // x = 10, y = 20, o.z = 30

        changeValues(x, y, o);

        printValues();
        // x = 10, y = 20, o.z = 31
    }

    /**
     * Метод модифицирует(инкрементирует) значения 3 переменых:
     * примитивного, класса обёртки и объекта(ссылочного значения)
     *
     * @param x_local
     * @param y_local
     * @param o_local
     */
    public void changeValues(int x_local, Integer y_local, SomeObject o_local) {

        x_local++;

        y_local++;

        o_local.z++;
    }

    /**
     * Вывести все значения.
     */
    private void printValues() {

        System.out.print("x = " + x + ", ");
        System.out.print("y = " + y + ", ");
        System.out.print("o.z = " + o.z + "\r\n");
    }
}
