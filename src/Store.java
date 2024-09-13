public class Store {
    public static void main(String[] args) {
        final int PRECIO_CAMISETAS = 15;
        final int PRECIO_PANTALON = 10;
        final int PRECIO_ZAPATOS = 5;

        final int CANT_CAMISETAS =2;
        final int CANT_PANTALONES =3;
        final int CANT_ZAPATOS =4;

        final int MAXIMO_VENTAS=50;
         int[]precios= new int[3];
        precios[0]= PRECIO_CAMISETAS;
        precios[1]= PRECIO_PANTALON;
        precios[2]= PRECIO_ZAPATOS;


        int[] cantidadproductos=  new int[3];
        cantidadproductos[0]= PRECIO_CAMISETAS;
        cantidadproductos[1]= PRECIO_PANTALON;
        cantidadproductos[2]= PRECIO_ZAPATOS;
         

        int total1 = precios[0] * cantidadproductos[0];
        int total2 = precios[1] * cantidadproductos[1];
        int total3 = precios[2] * cantidadproductos[2];

        int totalSales = total1 + total2 + total3;

        if (totalSales > MAXIMO_VENTAS) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
