package edu.elsmancs.domain;

public class TarjetaUsuario {
    private String id = null;
    private boolean activa = false;

    public TarjetaUsuario(String id, boolean activa) {
        this.id = id;
        this.activa = activa;
    }

    public String getId() {
        return this.id;
    }

    public boolean getActiva() {
        return this.activa;
    }

    public boolean getTamaño() {

        if (getId().length() != 9) {
            return false;
        } else {
            return true;
        }
    }
}
