import java.util.Objects;

public class User {
    private String name;
    private String login;
    private String password;
    private Profile perfil ;


    public Profile getPerfil() {
        return perfil;
    }

    public void setPerfil(Profile perfil) {
        this.perfil = perfil;
    }

    public User(String name, String login){
        if (name.isEmpty() || name==null || login.isEmpty() || login ==null){
        throw new IllegalArgumentException("name and login must be defined");
        }
        this.name=name;
        this.login=login;
        this.perfil=new Profile();
    }
    public Boolean cambiarContraseña(String contraseñaActual, String contraseñaNueva){
        if (this.password.equals(contraseñaActual)){
            if (contraseñaNueva.length()>8 || contraseñaNueva.isEmpty() || contraseñaNueva==null){
            this.password=contraseñaNueva;
            }else{
                throw new IllegalArgumentException("la contraseña debe ser de 8digitos al menos");
            }
            return true;
        }
        return false;
    }
    public Boolean validarContraseña(String urgente){
        return Objects.equals(this.password,urgente);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}

