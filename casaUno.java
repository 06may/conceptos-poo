public class casaUno {
    final String ciudad = "Acapulco";
    final String barrio = "La Marquesa";
    final String color = "Azul";
    final byte pisos = 2;
    final byte habitaciones = 3;
    final byte banios = 3;
    final byte cocinas = 1;

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

class ejercicioCasaUno{
    public static void main(String[] args){
        casaUno casa = new casaUno();
        System.out.println("Ciudad: "+ casa.getCiudad() );
        System.out.println("Barrio: "+ casa.getBarrio() );
        System.out.println("Color: "+ casa.getColor() );
        System.out.println("Pisos: "+ casa.getPisos() );
        System.out.println("Habitaciones: "+ casa.getHabitaciones() );
        System.out.println("Baños: "+ casa.getBanios() );
        System.out.println("Cocinas: "+ casa.getCocinas() );
    }
}
