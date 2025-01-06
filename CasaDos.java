public class CasaDos {
    private String ciudad;
    private String barrio;
    private String color;
    private byte pisos;
    private byte habitaciones;
    private byte banios;
    private byte cocinas;

    public CasaDos(String ciudad, String barrio, String color){
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.color = color;
    }

    public CasaDos(String barrio, String color, byte pisos){
        this.barrio = barrio;
        this.color = color;
        this.pisos = pisos;
    }

    public CasaDos(byte pisos, byte habitaciones, byte banios, byte cocinas){
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.banios = banios;
        this.cocinas = cocinas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getColor() {
        return color;
    }

    public byte getPisos() {
        return pisos;
    }

    public byte getHabitaciones() {
        return habitaciones;
    }

    public byte getBanios() {
        return banios;
    }

    public byte getCocinas() {
        return cocinas;
    }
}

class EjercicioCasaDos{
    public static void main(String[] args){
        CasaDos casa1 = new CasaDos("Acapulco", "La Marquesa", "Beige");
        System.out.println("Casa 1");
        System.out.println("Ciudad: "+casa1.getCiudad()+".");
        System.out.println("Barrio: "+casa1.getBarrio()+".");
        System.out.println("Color: "+casa1.getColor()+".");


        CasaDos casa2 = new CasaDos("La Marquesa", "Azul", (byte) 2);
        System.out.println("Casa 2");
        System.out.println("Barrio: "+casa2.getBarrio()+".");
        System.out.println("Color: "+casa2.getColor()+".");
        System.out.println("Pisos: "+casa2.getPisos()+".");

        CasaDos casa3 = new CasaDos((byte) 2, (byte) 3, (byte) 2, (byte) 1);
        System.out.println("Casa 3");
        System.out.println("Pisos: "+casa3.getPisos()+".");
        System.out.println("Habitaciones: "+casa3.getHabitaciones()+".");
        System.out.println("Baños: "+casa3.getBanios()+".");
        System.out.println("Cocinas: "+casa3.getCocinas()+".");
    }
}
