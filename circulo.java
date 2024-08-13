// Fernanda Muñoz Arroyo y Ulises Abdiel Cabello Cardenas

public class circulo{
  public static void main(String[] args) {
      int diametro=32;
      final float pi =3.14f;
      float area;
      float perimetro;
      area= pi * diametro;
      perimetro= pi*((diametro/2)*(diametro/2));
      System.out.println(area);
      System.out.println(perimetro);
  }
}