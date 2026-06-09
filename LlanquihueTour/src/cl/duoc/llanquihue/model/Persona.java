package cl.duoc.llanquihue.model;

/**
 * Representa a una persona dentro del sistema Llanquihue Tour.
 * Contiene datos personales como RUT, nombre, apellido, email, teléfono
 * y dirección.
 */
public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private Direccion direccion;

    /**
     * Constructor vacío de la clase Persona.
     * Permite crear una persona sin inicializar sus atributos.
     */
    public Persona() {}

    /**
     * Constructor que permite crear una persona con todos sus datos.
     *
     * @param rut RUT de la persona.
     * @param nombre nombre de la persona.
     * @param apellido apellido de la persona.
     * @param email correo electrónico de la persona.
     * @param telefono número telefónico de la persona.
     * @param direccion dirección asociada a la persona.
     */
    public Persona(String rut, String nombre, String apellido,
                   String email, String telefono, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene el RUT de la persona.
     *
     * @return RUT de la persona.
     */
    public String getRut() {
        return rut;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene el correo electrónico de la persona.
     *
     * @return email de la persona.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Obtiene el teléfono de la persona.
     *
     * @return teléfono de la persona.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Obtiene la dirección asociada a la persona.
     *
     * @return dirección de la persona.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Asigna el RUT de la persona.
     *
     * @param rut nuevo RUT de la persona.
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Asigna el nombre de la persona.
     *
     * @param nombre nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Asigna el apellido de la persona.
     *
     * @param apellido nuevo apellido de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Asigna el correo electrónico de la persona.
     *
     * @param email nuevo correo electrónico de la persona.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Asigna el teléfono de la persona.
     *
     * @param telefono nuevo teléfono de la persona.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Asigna la dirección de la persona.
     *
     * @param direccion nueva dirección de la persona.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve una representación en texto de los datos de la persona.
     *
     * @return cadena con los datos personales de la persona.
     */
    @Override
    public String toString() {
        return "Datos [rut=" + rut + ", nombre=" + nombre + ", apellido="
                + apellido + "\n" + ", email=" + email + ", telefono=" + telefono
                + "\n" + ", direccion=" + direccion + "]";
    }

}