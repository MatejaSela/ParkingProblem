package main.java.exceptions;

public class NoMoneyExcetion extends Exception {

    public NoMoneyExcetion(String string) {
        System.out.println(string);
    }

    private static final long serialVersionUID = 1L;

}
