package modelo;

public class Personal {

    protected Hotel hotel;
    private String usuario;
    private String password;

    public Personal(Hotel hotel, String usuario, String password) {
        this.hotel = hotel;
        this.usuario = usuario;
        this.password = password;
    }

    public boolean comprobarLogin(String usuario, String password) {
        boolean usuarioCorrecto;
        if (usuario.equals(this.usuario) && password.equals(this.password)) {
            usuarioCorrecto = true;
        } else {
            usuarioCorrecto = false;
        }

        return usuarioCorrecto;
    }

}
