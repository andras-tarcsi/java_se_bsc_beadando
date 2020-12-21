package hu.gov.allamkincstar.training360.java.tracking.Exception;

public class RaktarException extends Exception{
    private static final String MESSAGE = "Nincs elegendő árúkészlet!";

    public RaktarException(){
        super(MESSAGE);
    }
}
