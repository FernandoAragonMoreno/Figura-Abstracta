public class Triangulo extends Figura{

  private int base, altura;

  public Triangulo(String tipo, int base, int altura){
    super(tipo);
    this.base = base;
    this.altura = altura;
  }

  public int getBase(){
    return base;
  }

  public int getAltura(){
    return altura;
  }

  @Override
  public double area(){
    return (double) this.base * this.altura / 2;
  }
}
