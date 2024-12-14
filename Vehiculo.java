public class Vehiculo {
    private String placa;
    private String tipo;
    private String propietario;

    public Vehiculo(String placa, String tipo, String propietario) {
        this.placa = placa;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String toString() {
        return "Placa: " + placa + ", Tipo: " + tipo + ", Dueño: " + propietario;
    }
}
