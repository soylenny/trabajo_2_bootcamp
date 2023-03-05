
public class Main {

    public static void main(String[] args) {
        int numeroIf = 5;

        if (numeroIf<0){
            System.out.println("el numero es negativo");
        }
        else if(numeroIf>0){
            System.out.println("el numero es positivo");
        } else {
            System.out.println("el numero es 0");
        }

        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("while " + numeroWhile);
        }

        int numeroDoWhile = 0;
        do{
            numeroDoWhile++;
            System.out.println("do while " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        for(int numeroFor = 0; numeroFor <= 5; numeroFor++){
            System.out.println("for " + numeroFor);
        }

        String estacion = "invierno";
        switch(estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}