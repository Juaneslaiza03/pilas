
import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public Stack<Objpila> LlenarPila() {
        Stack<Objpila> p = new Stack<>();
        boolean bandera = true;
        int opt = 0;

        while (bandera) {
            Objpila o = new Objpila();

            System.out.println("Ingrese el Titulo:");
            o.setTitulo(sc.next());
            System.out.println("ingrese la Url");
            o.setUrl(sc.next());
            System.out.println("ingrese la Fecha: ");
            o.setFecha(sc.next());
            System.out.println("---------------------------");

            p.push(o);

            System.out.println("Dese ingresar otra opcion: 1.Si 2.No");

            while (!sc.hasNextInt()) {
                System.out.println("Por favor Ingrese un dato numerico");
            }
            opt = sc.nextInt();
            sc.nextLine();
        }
        if (opt == 2) {

            bandera = false;
        }

        return p;
    }

    public void MostrarPila(Stack<Objpila> p) {
        for (Objpila i : p) {
            System.out.println("Nombre de la pelicula: " + i.getTitulo());
            System.out.println("la Url ingresada es: " + i.getUrl());
            System.out.println("La fecha ingresada fue: " + i.getFecha());
            System.out.println("----------------------------------------------");

        }
    }
}
