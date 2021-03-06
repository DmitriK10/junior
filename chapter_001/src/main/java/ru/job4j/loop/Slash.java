package ru.job4j.loop;
/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 18.09.19 */
public class Slash {
    public static void draw(int size) {
        boolean left = false;
        boolean right = false;
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                left = row == cell;
                right = (row + cell) == size - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
