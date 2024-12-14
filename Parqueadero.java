public class Parqueadero{
    private Vehiculo[] vehiculos;
    private int capacidad;
    private int contador;

    public Parqueadero(int capacidad){
        this.capacidad = capacidad;
        this.vehiculos = new Vehiculo[capacidad];
        this.contador = 0;
    }

    public void registrarVehiculo(Vehiculo vehiculo){
        if (contador < capacidad){
            vehiculos[contador] = vehiculo;
            contador++;
            System.out.println("Vehículo registrado correctamente.");
        } else{
            System.out.println("No hay espacio disponible en el parqueadero.");
        }
    }

    public Vehiculo consultarVehiculo(String placa){
        for (int i=0;i<contador;i++){
            if (vehiculos[i].getPlaca().equals(placa)){
                return vehiculos[i];
            }
        }
        return null;
    }

    public void eliminarVehiculo(String placa) {
        for (int i=0;i<contador;i++) {
            if (vehiculos[i].getPlaca().equals(placa)) {
                System.out.println("Eliminando vehículo con placa: " + placa);
                
                for (int j=i;j<contador-1;j++){
                    vehiculos[j] = vehiculos[j+1];
                }
                vehiculos[contador-1]=null; 
                contador--;
                System.out.println("Vehículo eliminado correctamente.");
                return;
            }
        }
        System.out.println("Vehículo con placa "+placa+" no encontrado.");
    }

    public void mostrarVehiculos(){
        if (contador == 0){
            System.out.println("No hay vehículos registrados.");
        }else{
            for (int i=0;i<contador;i++){
                System.out.println(vehiculos[i]);
            }
        }
    }
}