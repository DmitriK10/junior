package ru.job4j.loop;
/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 21.03.18
 */
public class Counter {
    /**
     * Ищем сумму чисел в диапазоне от start до finish
     * @param start первое число диапазона.
     * @param finish последнее число диапазона.
     * @return sum сумма.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
