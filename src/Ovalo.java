public class Ovalo extends Figura{

  public int ancho, largo;

  public Ovalo(String tipo, int ancho, int largo){
    super(tipo);
    this.ancho = ancho;
    this.largo = largo;
  }

  public int getAncho(){
    return ancho;
  }

  public int getLargo(){
    return largo;
  }

  @Override
  public double area(){
    return (this.ancho / 2) * (this.largo / 2) * Math.PI;
  }
}
