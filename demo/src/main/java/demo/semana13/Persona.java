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

    public static Persona factory(String cadena){
        if(cadena == null){
            throw new IllegalArgumentException("LA CADENA NO PUEDE SER NULA");
        }

        String[] partes = cadena.split(",");
        
        if(partes.length != 4){
            throw new IllegalArgumentException("LOS ARGUMENTOS NO SON VALIDOS");
        }

        try{
            int edad = Integer.parseInt(partes[2]);
            return new Persona(partes[0], partes[1], edad, partes[3]);
        } catch (Exception e){
            throw new IllegalArgumentException("LOS ARGUMENTOS NO SON VALIDOS");
        }
    }

    /**
     * Getter del email
     * @return *el email de la persona
     */
    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    
}
