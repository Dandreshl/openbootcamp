public class ejercicios_tema_04 {
  public static void main(String args[]) {
     int numeroIf=10;
     int numeroWhile = 0;
     String estacion = "PRIMAVERA";

     if (numeroIf < 0) {
        System.out.println("Numero " + numeroIf + " es negativo");
     }
     if (numeroIf == 0) {
        System.out.println("Numero " + numeroIf + " es igual a cero");
     }
     if (numeroIf > 0) {
        System.out.println("Numero " + numeroIf + " es mayor a cero");
     }
     
     
     while (numeroWhile < 3) {
        System.out.println("Bucle While - numeroWhile = " + numeroWhile);
        numeroWhile += 1;
     }
     
     
     numeroWhile = 0;
     do {
        System.out.println("Bucle DoWhile - numeroWhile = " + numeroWhile);
        numeroWhile = 3; 
     } while(numeroWhile < 3);
     
     
     
     for(var numeroFor = 0; numeroFor <= 3; numeroFor++){
         System.out.println("Bucle For - numeroFor = " + numeroFor);
     }
     
     
    switch(estacion){
        case "VERANO":
            System.out.println("Control Swith - estacion = " + estacion);
            break;
        case "INVIERNO":
            System.out.println("Control Swith - estacion = " + estacion);
            break;
        case "PRIMAVERA":
            System.out.println("Control Swith - estacion = " + estacion);
            break;
        case "OTOÑO":
            System.out.println("Control Swith - estacion = " + estacion);
            break;
        default:
            System.out.println("Control Swith - " + estacion + " no es una estacion");
            break;
     }
  }
}
