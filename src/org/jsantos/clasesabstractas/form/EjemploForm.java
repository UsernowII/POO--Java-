package org.jsantos.clasesabstractas.form;


import org.jsantos.clasesabstractas.form.elementos.*;
import org.jsantos.clasesabstractas.form.elementos.select.Opcion;
import org.jsantos.clasesabstractas.form.validador.EmailValidador;
import org.jsantos.clasesabstractas.form.validador.LargoValidador;
import org.jsantos.clasesabstractas.form.validador.NumeroValidador;
import org.jsantos.clasesabstractas.form.validador.RequeridoValidador;


import java.util.Arrays;
import java.util.List;


public class EjemploForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador());
        password.addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador());
        email.addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NumeroValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2","Python"))
                .addOpcion(new Opcion("3", "javaScript"))
                .addOpcion(new Opcion("4", "TypeScript").setSelected())
                .addOpcion(new Opcion("5", "PHP"));

        //funcion anonima

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name ='"+this.nombre+ "' value = '"+this.valor+"' >";
            }
        };

        saludar.setValor("Hola que tal este campo esta deshabilitado");
        username.setValor(""); // setear valor usuario
        password.setValor("a1b2");
        email.setValor("johngmail.com");
        edad.setValor("28");
        experiencia.setValor("mas de 10 años de experiencia");
        //java.setSelected(true);

        /*
        List<ElementoForm>elementos = new ArrayList<ElementoForm>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        elementos.add(saludar);

        for (ElementoForm elemento: elementos) {
        System.out.println(elemento.dibujarHtml());
        System.out.println("<br>");
        }
        */

        List<ElementoForm>elementos = Arrays.asList(username,password,
                email,edad,experiencia,lenguaje,saludar);

        elementos.forEach(elemento -> {
            System.out.println(elemento.dibujarHtml());
            System.out.println("<br>");
        });


        elementos.forEach(elementoForm -> {
            if(!elementoForm.esValido()){
                elementoForm.getErrores().forEach(System.out::println);
            }
        });

    }
}
