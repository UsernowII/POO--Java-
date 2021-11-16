package org.jsantos.genericsclass;

public class EjemploGenericos {


    public static <T> void imprimirCamion(Camion<T> camion){
        for(T a : camion){
            if(a instanceof Animal){
            System.out.println(((Animal)a).getNombre() + "tipo: " + ((Animal)a).getTipo());
            }else if(a instanceof  Automovil){
                System.out.println(((Automovil)a).getMarca());
            } else if(a instanceof Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }
        }
    }

    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Bambi", "Caballo"));
        transporteCaballos.add(new Animal("Leo", "Caballo"));
        transporteCaballos.add(new Animal("Tuco", "Caballo"));
        transporteCaballos.add(new Animal("Topito", "Caballo"));
        transporteCaballos.add(new Animal("Lucero", "Caballo"));

        System.out.println("---------------- Caballos------------");

        for(Animal a : transporteCaballos){
            System.out.println(a.getNombre() + "tipo: " + a.getTipo());
        }


        Camion <Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        System.out.println("---------------- Maquinas------------");

        for (Maquinaria m: transMaquinas){
            System.out.println(m.getTipo());
        }

        Camion <Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Chevrolet"));
        transAuto.add(new Automovil("Chebit"));
        transAuto.add(new Automovil("Mazda"));

        System.out.println("---------------- Automoviles------------");

        for (Automovil a: transAuto) {
            System.out.println(a.getMarca());
        }

        System.out.println("---------------- Caballos------------");
        imprimirCamion(transporteCaballos);
        System.out.println("---------------- Maquinas------------");
        imprimirCamion(transMaquinas);
        System.out.println("---------------- Automoviles------------");
        imprimirCamion(transAuto);


    }
}
