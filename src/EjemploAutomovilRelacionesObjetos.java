public class EjemploAutomovilRelacionesObjetos {

    public static void main(String[] args) {

        Rueda[] ruedasSub = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++) {
            ruedasSub[i] = new Rueda("yokohama", 16, 7.5);
        }


        Persona conductorSubaru = new Persona("luci", "perez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruedasSub);


        Rueda[] ruedasMaz = {new Rueda("michelin", 18, 10.5),
                new Rueda("michelin", 18, 10.5),
                new Rueda("michelin", 18, 10.5),
                new Rueda("michelin", 18, 10.5),
                new Rueda("michelin", 18, 10.5),
        };

        Persona pato = new Persona("Pato", "rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        mazda.setRuedas(ruedasMaz);


        Rueda[] ruedasBea = {new Rueda("michelin", 18, 10.5),
                new Rueda("Pirelli", 20, 10.5),
                new Rueda("Pirelli", 20, 10.5),
                new Rueda("Pirelli", 20, 10.5),
                new Rueda("Pirelli", 20, 10.5),
        };

        Persona bea = new Persona("bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "navara", Color.GRIS, new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(bea);
        nissan.setRuedas(ruedasBea);


        Rueda[] ruedasNissan2 = {new Rueda("michelin", 22, 10.9),
                new Rueda("michelin", 22, 10.9),
                new Rueda("michelin", 22, 10.9),
                new Rueda("michelin", 22, 10.9),
                new Rueda("michelin", 22, 10.9)};

        Persona lalo = new Persona("lalo", "mena");
        Automovil nissan2 = new Automovil("Nissan", "navara", Color.AMARILLO, new Motor(3.5, TipoMotor.DIESEL), new Estanque(45));
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setConductor(lalo);
        nissan2.setRuedas(ruedasNissan2);

    }


}