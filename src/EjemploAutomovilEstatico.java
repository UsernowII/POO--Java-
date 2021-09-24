public class EjemploAutomovilEstatico {

    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);


        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "navara",Color.GRIS, new Motor(3.5,TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "navara", Color.AMARILLO, new Motor(3.5, TipoMotor.DIESEL), new Estanque(45));
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil auto = new Automovil();
        Automovil.setColorPatente(Color.AZUL);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());


        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil color " +Automovil.getColorPatente().getColor());
        System.out.println("Automovil.calcularConsumoEstatico(300,60 = " + Automovil.calcularConsumoEstatico(300,60));

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipoSubaru.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipoSubaru.getDescripcion());
    }
}