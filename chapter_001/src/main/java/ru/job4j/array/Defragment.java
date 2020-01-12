package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int i = 0;
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            i = 0;
            if (cell == null) {
                while (array[index + i] == null) {
                    if ((index + i) == (array.length - 1))
                    {
                        break;
                    };
                    i++;
                }
                array[index] = array[index + i];
                array[index + i] = cell;
            }
            else {
                continue;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}