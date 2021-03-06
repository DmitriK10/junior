package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

//4. Конвертация двумерного массива в ArrayList [#48580]
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int a = 0;
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}