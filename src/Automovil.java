public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJA;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";


    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    public Automovil(String fabricante, String modelo, Color color, Motor motor){
        this(fabricante, modelo);
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color,
                     Motor motor, Estanque estanque) {
        this(fabricante,modelo,color,motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }
// Geter Setter

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    //methods

    public String verDetalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("id= ").append(this.id);
        sb.append("\nauto.fabricante = ").append(this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.tipo = "+ this.getTipo());
        sb.append("\nauto.color = " + this.color.getColor());
        sb.append("\nauto.cilindrada = " + this.motor.getCilindrada());
        sb.append("\nauto.patente= "+ Automovil.colorPatente.getColor());
        return sb.toString();
    }


    public String acelerar(int rpm) {
        return "el auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + "" + this.modelo + " frenando";
    }



    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentaGasolina) {
        return km / (estanque.getCapacidad() * porcentaGasolina);
    }

    public float calcularConsumo(int km, int porcentaGasolina) {
        return km / (estanque.getCapacidad()* (porcentaGasolina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentaGasolina) {
        return km / (Automovil.capacidadTanqueEstatico * (porcentaGasolina / 100f));
    }


    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo());
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id= " + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + motor.getCilindrada() +
                ", capacidadTanque=" + estanque.getCapacidad()+
                '}';
    }
}
