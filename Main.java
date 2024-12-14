import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Parqueadero parqueadero = new Parqueadero(10);
        
        System.out.println("Ingrese los datos del vehículo a registrar:");
        
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        
        System.out.print("Tipo de vehículo (carro/moto): ");
        String tipo = scanner.nextLine();
        
        System.out.print("Dueño: ");
        String propietario = scanner.nextLine();
        
        Vehiculo vehiculo = new Vehiculo(placa, tipo, propietario);
        parqueadero.registrarVehiculo(vehiculo);
        
        System.out.print(" ");
        System.out.print("Ingrese la placa del vehículo a consultar: ");
        String placaConsulta = scanner.nextLine();
        Vehiculo vehiculoConsulta = parqueadero.consultarVehiculo(placaConsulta);
        
        if (vehiculoConsulta != null) {
            System.out.print(" ");
            System.out.println("Vehículo encontrado: ");
            System.out.println(vehiculoConsulta);
            
            System.out.print(" ");
            System.out.print("¿Deseas eliminar este vehículo? (sí/no): ");
            String respuestaEliminar = scanner.nextLine().trim().toLowerCase();
            if (respuestaEliminar.equals("si")) {
                parqueadero.eliminarVehiculo(placaConsulta);
            }
        } else {
            System.out.println("Vehículo no encontrado.");
        }
        System.out.print(" ");
        System.out.println("Vehículos en el parqueadero:");
        parqueadero.mostrarVehiculos();
        scanner.close();
    }
}
