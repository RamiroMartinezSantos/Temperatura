import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        CalcularTemperatura calcularTemperatura = new CalcularTemperatura();

        String [] nombre = new String[10];
        int [] edad = new int[5];
        Double [] fah = new Double[5];
        Double [] celsius = new Double[5];
        for(int i = 0;i < 5;i++){
            System.out.println("Ingrese el nombre del paciente: "+(i+1));
            nombre[i] = scanner.nextLine();
            System.out.println("Ingrese la edad del paciente: "+(i+1));
            edad[i] = scanner.nextInt();
            System.out.println("Indique la temperatura del paciente: "+(i+1));
            System.out.println(" [1] Fahrenheit");
            System.out.println(" [2] Celsius");
            int op = scanner.nextInt();
            if(op == 1){
                fah[i] = scanner.nextDouble();
                celsius[i] = calcularTemperatura.convertirFaC(fah[i]);
            }else if(op == 2){
                celsius[i] = scanner.nextDouble();
                fah[i] = calcularTemperatura.convertirCaF(celsius[i]);
            }
            scanner.nextLine();
        }
        for (int i = 0;i<5; i++){
            System.out.println("Nombre del paciente: "+nombre[i]);
            System.out.println("Edad del paciente: "+edad[i]);
            System.out.println("Temperatura del paciente en fahrenheit"+fah[i]);
            System.out.println("Temperatura del paciente en celsius: "+celsius[i]);
            System.out.println("\n");
        }
    }
}
