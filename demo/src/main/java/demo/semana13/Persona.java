package demo.semana13;

/**
*Clase Persona con atributos nombre, apellidos, edad y email
*/
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    /**
     * Constructor de la clase Persona con argumentos
     * @param nombre *nombre de la persona
     * @param apellidos *apellidos de la persona
     * @param edad *edad de la persona
     * @param email *correo electrónico de la persona
     */
    public Persona(String nombre, String apellidos, int edad, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Getter del email
     * @return *el email de la persona
     */
    public String getEmail() {
        return email;
    }
}
