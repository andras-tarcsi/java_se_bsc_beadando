package hu.gov.allamkincstar.training360.java.tracking.Exception;

public class VevoException extends Exception {
    private static final String MESSAGE = "Nem töltött ki minden adatot!";

    public VevoException() {
        super(MESSAGE);
    }
}
