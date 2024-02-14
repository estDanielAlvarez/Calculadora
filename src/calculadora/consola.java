package calculadora;
import java.util.Scanner;
public class consola {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("\t\tBIENVENIDO A LA CALCULADORA POR CONSOLA");
        int repetir;
        do{
        System.out.println("\t__________________________________________________________");
        System.out.println("\tPor favor digite una opción:");
        System.out.println("\t[1] Suma\n\t[2] Resta\n\t[3] Multiplicación\n\t[4] División\n\t[5] Seno"
                + "\n\t[6] Coseno\n\t[7] Tangente\n\t[8] Raíz enésima\n\t[9] Potencia enésima"
                + "\n\t[10] Porcentaje de IVA\nOpción: ");
        int option = n.nextInt();
            System.out.println("__________________________________________________________");
        switch(option){
            case 1://Suma
                System.out.println("SUMA");
        System.out.println("Ingrese el primer número:");
        float n1 = n.nextFloat();
        System.out.println("Ingrese el segundo número:");
        float n2 = n.nextFloat();
        Calculadora suma = new Calculadora(n1,n2);
        suma.sumar();
        System.out.println(n1+" + "+n2+" = "+suma.getS());
        System.out.println("_____________________________");
        break;
        
            case 2://Resta
                System.out.println("RESTA");
        System.out.println("Ingrese el primer número:");
        float n3 = n.nextFloat();
        System.out.println("Ingrese el segundo número:");
        float n4 = n.nextFloat();
        Calculadora resta = new Calculadora(n3,n4);
        resta.restar();
        System.out.println(n3+" - "+n4+" = "+resta.getRe());
        System.out.println("_____________________________");
        break; 
            case 3://Multiplicación
                System.out.println("MULTIPLICACIÓN");
        System.out.println("Ingrese el primer número:");
        float n5 = n.nextFloat();
        System.out.println("Ingrese el segundo número:");
        float n6 = n.nextFloat();
        Calculadora multipli = new Calculadora(n5,n6);
        multipli.multi();
        System.out.println(n5+" * "+n6+" = "+multipli.getM());
        System.out.println("_____________________________");
        break;
            case 4://División
                System.out.println("DIVISIÓN");
        System.out.println("Ingrese el primer número:");
        float n7 = n.nextFloat();
        System.out.println("Ingrese el segundo número:");
        float n8 = n.nextFloat();
        Calculadora divis = new Calculadora(n7,n8);
        divis.divi();
        System.out.println(n7+" / "+n8+" = "+divis.getD());
        System.out.println("_____________________________");
        break;
            case 5://seno
                System.out.println("SENO");
                System.out.println("Desea ingresar el número en grados [1]\nDesea ingresar el número"
                        + " en radianes [2]");
                int opt2;
                opt2 = n.nextInt();
                switch(opt2){
                    case 1://Seno en grados
                        System.out.print("Ingrese el número en grados: \nSen ");
                        float n9 = n.nextFloat();
                        Calculadora senog = new Calculadora(n9);
                        senog.sengrad();
                        System.out.println("Sen "+n9+" = "+senog.getSg());
                        System.out.println("_____________________________");
                        break;
                    case 2://Seno en radianes
                       System.out.print("Ingrese el número en radianes: \nSen ");
                        float n10 = n.nextFloat();
                        Calculadora senor = new Calculadora(n10);
                        senor.senrad();
                        System.out.println("Sen "+n10+" = "+senor.getSr());
                        System.out.println("_____________________________");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        System.out.println("_____________________________");
                }break;
            case 6://coseno
                System.out.println("COSENO");
                System.out.println("Desea ingresar el número en grados [1]\nDesea ingresar el número"
                        + " en radianes [2]");
                int opt3;
                opt3 = n.nextInt();
                switch(opt3){
                    case 1://coseno en grados
                        System.out.print("Ingrese el número en grados: \nCos ");
                        float n9 = n.nextFloat();
                        Calculadora cosg = new Calculadora(n9);
                        cosg.cosgrad();
                        System.out.println("Cos "+n9+" = "+cosg.getCg());
                        System.out.println("_____________________________");
                        break;
                    case 2://coseno en radianes
                       System.out.print("Ingrese el número en radianes: \nCos ");
                        float n10 = n.nextFloat();
                        Calculadora cosr = new Calculadora(n10);
                        cosr.cosrad();
                        System.out.println("Cos "+n10+" = "+cosr.getCr());
                        System.out.println("_____________________________");
                        break;      
                    default:
                        System.out.println("Ingrese una opción válida");
                        System.out.println("_____________________________");
                }break;
            case 7://tangente
                System.out.println("TANGENTE");
                System.out.println("Desea ingresar el número en grados [1]\nDesea ingresar el número"
                        + " en radianes [2]");
                int opt4;
                opt4 = n.nextInt();
                switch(opt4){
                    case 1://tangente en grados
                        System.out.print("Ingrese el número en grados: \nTan ");
                        float n9 = n.nextFloat();
                        Calculadora tang = new Calculadora(n9);
                        tang.tangrad();
                        System.out.println("Tan "+n9+" = "+tang.getTg());
                        System.out.println("_____________________________");
                        break;
                    case 2://tangente en radianes
                       System.out.print("Ingrese el número en radianes: \nTan ");
                        float n10 = n.nextFloat();
                        Calculadora tanr = new Calculadora(n10);
                        tanr.tanrad();
                        System.out.println("Tan "+n10+" = "+tanr.getTr());
                        System.out.println("_____________________________");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        System.out.println("_____________________________");
                }break;
            case 8://Raíz enésima
                System.out.println("RAÍZ ENÉSIMA");
                System.out.println("Ingrese el radicando: ");
                float n11 = n.nextFloat();
                System.out.println("Ingrese el radical: ");
                float n12 = n.nextFloat();
                Calculadora raizn = new Calculadora(n11,n12);
                raizn.raiz();
                System.out.println("La raíz "+n12+" de "+n11+" es "+raizn.getRen());
                System.out.println("_____________________________");
                break;
            case 9://Potencia enésima
                System.out.println("POTENCIA ENÉSIMA");
                System.out.println("Ingrese la base: ");
                float n13 = n.nextFloat();
                System.out.println("Ingrese el exponente: ");
                float n14 = n.nextFloat();
                Calculadora potencian = new Calculadora(n13,n14);
                potencian.potencia();
                System.out.println(n13+" elevado a "+n14+" es "+potencian.getPen());
                System.out.println("_____________________________");
                break;
            case 10://Calcular porcentaje de IVA
                System.out.println("CALCULAR EL PORCENTAJE DE IVA");
                System.out.println("Ingrese el precio total: ");
                float n15 = n.nextFloat();
                System.out.println("Ingrese el valor del porcentaje: ");
                float n16 = n.nextFloat();
                Calculadora porcentaje = new Calculadora(n15,n16);
                porcentaje.iva();
                System.out.println("El "+n16+" % de "+n15+" es: "+porcentaje.getIva());
                System.out.println("_____________________________");
                break;
            default://Por defecto
                System.out.println("Ingrese una opción válida");
                System.out.println("_____________________________");
                break;
        }
        System.out.println("Para volver al menú ingrese [0]");
        repetir = n.nextInt();
        }while(repetir==0);
    }
}
