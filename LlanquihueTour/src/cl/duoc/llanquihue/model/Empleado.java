package cl.duoc.llanquihue.model;

/**
 * Representa a un empleado del sistema Llanquihue Tour.
 * Hereda los datos personales de la clase Persona y agrega información
 * laboral como cargo, sueldo y fecha de contratación.
 */
public class Empleado extends Persona{
    private String cargo;
    private double sueldo;
    private String fechaContratacion;

    /**
     * Constructor vacío de la clase Empleado.
     * Inicializa los atributos heredados mediante el constructor vacío de Persona.
     */
    public Empleado() {
        super ();
    }

    /**
     * Constructor que permite crear un empleado con sus datos personales
     * y laborales.
     *
     * @param rut RUT del empleado.
     * @param nombre nombre del empleado.
     * @param apellido apellido del empleado.
     * @param email correo electrónico del empleado.
     * @param telefono número telefónico del empleado.
     * @param direccion dirección asociada al empleado.
     * @param cargo cargo que desempeña el empleado.
     * @param sueldo sueldo del empleado.
     * @param fechaContratacion fecha en que el empleado fue contratado.
     */
    public Empleado(String rut, String nombre, String apellido,
                    String email, String telefono, Direccion direccion,
                    String cargo, double sueldo, String fechaContratacion) {

        super(rut, nombre, apellido, email, telefono, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fechaContratacion = fechaContratacion;
    }

    /**
     * Obtiene el cargo del empleado.
     *
     * @return cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Obtiene el sueldo del empleado.
     *
     * @return sueldo del empleado.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Obtiene la fecha de contratación del empleado.
     *
     * @return fecha de contratación del empleado.
     */
    public String getFechaContratacion() {
        return fechaContratacion;
    }

    /**
     * Asigna el cargo del empleado.
     *
     * @param cargo nuevo cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Asigna el sueldo del empleado.
     *
     * @param sueldo nuevo sueldo del empleado.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Asigna la fecha de contratación del empleado.
     *
     * @param fechaContratacion nueva fecha de contratación del empleado.
     */
    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    /**
     * Devuelve una representación en texto de los datos del empleado,
     * incluyendo la información heredada de Persona.
     *
     * @return cadena con los datos personales y laborales del empleado.
     */
    @Override
    public String toString() {
        return "Empleado[" + super.toString() +
                ", cargo=" + cargo + ", sueldo=" + sueldo + "\n" +
                ", fechaContratacion=" + fechaContratacion + "]";
    }
}