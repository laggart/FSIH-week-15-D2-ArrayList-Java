import java.util.ArrayList;
import java.util.Scanner;

public class alien_montserrat {
    public static void main(String[] args) throws Exception {
        ArrayList <String> listaAsistentes = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        //Pedimos la lista de personas que reciben a los Aliens
        System.out.println("Indica los 5 representantes de la tierra que deberían ir a Montserrat a recibir a los Aliens:");
        String representate = "";

        for (int i = 0; i < 5; i++){
            representate = teclado.nextLine();
            listaAsistentes.add(representate);
        }

        System.out.println("Los participantes son:");
        for(int i = 0; i<listaAsistentes.size(); i++){
            System.out.print(listaAsistentes.get(i) + ", ");
        }
        
        listaAsistentes.set(1, "Arnold Schwarzenegger"); 
        
        System.out.println("\nTenemos algunos cambios!!! asistirán:");
        for(int i = 0; i<listaAsistentes.size(); i++){
            System.out.print(listaAsistentes.get(i) + ", ");
        }
        
        System.out.println("\nMalas noticias, " + listaAsistentes.get(2) + " no podrá, ahora asistirán: ");
        listaAsistentes.remove(2);
        
        for(int i = 0; i<listaAsistentes.size(); i++){
            System.out.print(listaAsistentes.get(i) + ", ");
        }
        
        System.out.println("\n" + listaAsistentes.get(listaAsistentes.size() -1) + " se ha enfermado y no podrá asistir, los nuevos miembros son: ");
        listaAsistentes.set(listaAsistentes.size() -1, "Mark Zuckerberg");
        for(int i = 0; i<listaAsistentes.size(); i++){
            System.out.print(listaAsistentes.get(i) + ", ");
        }
        
        System.out.println("\nEn vista de que no estamos completos, tenemos nuevo integrante para la última plaza!, así ha quedado la recepción");
        listaAsistentes.add(2, "Kim Jong Un");
        
        for(int i = 0; i<listaAsistentes.size(); i++){
            System.out.print(listaAsistentes.get(i) + ", ");
        }

        System.out.println("");

        teclado.close();
    }
}

