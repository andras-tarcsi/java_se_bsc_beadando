package hu.gov.allamkincstar.training360.java.tracking.Exception;

public class KosarUresException extends Exception{
    private static final String MESSAGE = "Üres a kosár!";

    public KosarUresException() {
        super(MESSAGE);
    }
}
