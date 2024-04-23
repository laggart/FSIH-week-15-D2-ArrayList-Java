import java.util.ArrayList;
import java.util.Scanner;

public class sant_jordi {
    public static void main(String[] args) throws Exception {
        ArrayList<String> elementosSantjordi = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        // pedimos elementos típicos de la fiesta de sant jordi.
        System.out.println("Nombrame elementos típicos de la fiesta de Sant Jordi, cuando termines puedes usar 'Salir'");
        String elemento = teclado.nextLine();
        while (!elemento.equalsIgnoreCase("salir")) {
            elementosSantjordi.add(elemento);
            elemento = teclado.nextLine();
        }

        System.out.println("los elementos de tu Sant jordi son: (for each)");
        for(String elementosUser: elementosSantjordi){
            System.out.println(elementosUser);
        }
        
        System.out.println("los elementos de tu Sant jordi son: (bucle for)");
        for(int i = 0; i < elementosSantjordi.size(); i++){
            System.out.print(elementosSantjordi.get(i) + ", ");
        }
        System.out.println("");

        teclado.close();
    }
}
