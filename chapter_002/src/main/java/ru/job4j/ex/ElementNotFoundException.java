package ru.job4j.ex;

//0.4. Пользовательские исключения. [#219367]
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
