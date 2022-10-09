public class ejercicios_tema_03 {
    public static int sumar (int x, int y, int z) {
        return x+y+z;
    }

    public static void main(String[] args) {
        System.out.println("funcion sumar = " + sumar(1,2,3));
    
        Coche myCoche = new Coche();
        myCoche.aumentar_puertas();
        System.out.println("Puertas del Coche: " + myCoche.puertas);
    }
}