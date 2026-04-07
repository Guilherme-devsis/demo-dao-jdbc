package db;

import java.io.Serial;

public class DbException extends RuntimeException {

    @Serial
    public static final long serialVersionUID = 1L;

    public DbException (String msg){
        super(msg);
    }
}
