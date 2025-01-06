public class Main {
    public static void main(String[] args) {

        Ciudad ciudad = new Ciudad("Acapulco", "México", "Abelina", 1000.00);

        ciudad.dataCiudad();
    }
    public static class Ciudad{
        private   String nombre, pais, presidente;
        private double poblacion;

        public Ciudad(String nombre, String pais, String presidente, double poblacion){
            this.nombre = nombre;
            this.presidente = presidente;
            this.pais = pais;
            this.poblacion = poblacion;
        }

        public String getNombre() {
            return nombre;
        }
        public String getPais() {
            return pais;
        }
        public String getPresidente(){
            return presidente;
        }
        public double getPoblacion(){
            return poblacion;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setPais(String pais){
            this.pais = pais;
        }
        public void setPresidente(String presidente){
            this.presidente = presidente;
        }
        public void setPoblacion(double poblacion){
            this.poblacion = poblacion;
        }

        public void dataCiudad(){
            System.out.println("Nombre de la ciudad: " + nombre);
            System.out.println("País al que pertenece: " + pais);
            System.out.println("Presidente Actual: " + presidente);
            System.out.println("Población Total: " + poblacion);
        }


    }


}
