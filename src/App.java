public class App {
    public static void main(String[] args) throws Exception {
        poliformismo(new Cuadrado("Cuadrado", 8));
        poliformismo(new Triangulo("Triangulo", 8, 5));
        poliformismo(new Ovalo("Ovalo", 6, 10));
    }

    public static void poliformismo(Figura miFigura){
        System.out.println("Tipo: " + miFigura.getTipo());
        System.out.println("Área: " + miFigura.area());
    }
}
