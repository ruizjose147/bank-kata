package ValueObject;


import java.util.UUID;

public class CuentaId {
    private String id;

    public CuentaId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

}
