package hu.gov.allamkincstar.training360.java.tracking.Exception;

public class KosarException extends Exception {
    private static final String MESSAGE = "Nincs elegendő árúkészlet raktáron!";

    public KosarException() {
        super(MESSAGE);
    }
}
