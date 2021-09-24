public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza");


        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "navara", Color.GRIS,new Motor(3.5, TipoMotor.BENCINA),new Estanque(50));
        Automovil nissan2 = new Automovil("Nissan", "navara", Color.GRIS,new Motor(3.5,TipoMotor.BENCINA), new Estanque(45));

        System.out.println("son iguales? " + (nissan == nissan2) );
        System.out.println("son iguales? " + (nissan.equals(nissan2)) );



        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());


        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println(subaru.calcularConsumo(300,0.6f));
        System.out.println(mazda.calcularConsumo(300,60));
        System.out.println(nissan.calcularConsumo(300,60));
    }
}
