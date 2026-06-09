package cl.duoc.llanquihue.model;

/**
 * Representa una dirección física asociada a una persona o empleado.
 * Contiene información como calle, número, ciudad, región y código postal.
 */
public class Direccion {
    private String calle;
    private String numero;
    private String ciudad;
    private String region;
    private String codigoPostal;

    /**
     * Constructor vacío de la clase Direccion.
     * Permite crear una dirección sin inicializar sus atributos.
     */
    public Direccion() {}

    /**
     * Constructor que permite crear una dirección con todos sus datos.
     *
     * @param calle nombre de la calle.
     * @param numero número de la dirección.
     * @param ciudad ciudad correspondiente a la dirección.
     * @param region región correspondiente a la dirección.
     * @param codigoPostal código postal de la dirección.
     */
    public Direccion(String calle, String numero, String ciudad,
                     String region, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
        this.codigoPostal = codigoPostal;
    }

    /**
     * Obtiene el nombre de la calle.
     *
     * @return calle de la dirección.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Obtiene el número de la dirección.
     *
     * @return número de la dirección.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Obtiene la ciudad de la dirección.
     *
     * @return ciudad de la dirección.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Obtiene la región de la dirección.
     *
     * @return región de la dirección.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Obtiene el código postal de la dirección.
     *
     * @return código postal de la dirección.
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Asigna el nombre de la calle.
     *
     * @param calle nueva calle de la dirección.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Asigna el número de la dirección.
     *
     * @param numero nuevo número de la dirección.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Asigna la ciudad de la dirección.
     *
     * @param ciudad nueva ciudad de la dirección.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Asigna la región de la dirección.
     *
     * @param region nueva región de la dirección.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Asigna el código postal de la dirección.
     *
     * @param codigoPostal nuevo código postal de la dirección.
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Devuelve una representación en texto de la dirección.
     *
     * @return cadena con los datos de la dirección.
     */
    @Override
    public String toString() {
        return "Direccion=" + calle + " " + numero + ", " + ciudad +
                ", " + region + ", " + codigoPostal;
    }
}