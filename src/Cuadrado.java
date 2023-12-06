public class Cuadrado extends Figura{

  private int lado;

  public Cuadrado(String tipo, int lado){
    super(tipo);
    this.lado = lado;
  }

  public int getLado(){
    return lado;
  }

  @Override
  public double area(){
    return this.lado * this.lado;
  }
}
