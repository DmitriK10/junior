package ru.job4j.ex;

//0.4. Пользовательские исключения. [#219367]
public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        /* for-each */
        for  (int x = 0; x < value.length; x++) {
            if (value[x] == key) {
                rsl = x;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Key could not be -1");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] data = new String[1];
        data[0] = "Q";
        String key = "Q";
        try {
            indexOf(data, key);
        } catch (ElementNotFoundException q){
            q.printStackTrace();
        }
    }
}