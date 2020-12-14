package main.java.exceptions;

public class NoSpaceExcetion extends Exception {

    private static final long serialVersionUID = 1L;

    public NoSpaceExcetion(String string) {
        System.out.println(string);
    }

}
