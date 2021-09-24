public class EjemploAutomovilEnum {

    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);


        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());


        TipoAutomovil tipo= subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipo.getDescripcion());

        tipo = mazda.getTipo();

        switch (tipo) { //Version mejorada Switch Case versioon 13+
            case CONVERTIBLE ->
                    System.out.println("El auto es deportuvo y descapotable");
            case COUPE ->
                    System.out.println("Es un automovil pequeño");
            case FURGON ->
                    System.out.println("Es un automovil utilitario d etrasnporte");
            case HATCHBACK ->
                    System.out.println("Es un automovil mediano compacto");
            case PICKUP ->
                    System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                    System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                    System.out.println("Es un automovil mas grande, con maleta");
        }


        TipoAutomovil [] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos) {
            System.out.print(ta+ "=> "+ ta.name()+ ", "+
                    ta.getNombre() + ", "+ ta.getDescripcion() +", "+ ta.getNumeroPuertas());
            System.out.println();
        }

    }
}
