import java.util.Scanner;
//e importa la clase Scanner de Java para poder leer la entrada del usuario desde la consola

public class Panaderia {
    public static void main(String[] args) {
        //se crean algunas variables necesarias para el programa
        Scanner sc = new Scanner(System.in); //instancia de scaner
        String[] productos = {"Pan de molde", "Croissant", "Baguette", "Tarta de manzana"};
        double[] precios = {3.0, 2.0, 1.5, 12.0};
        int[] cantidades = {50, 30, 40, 20};
        double total = 0.0;
        boolean salir = false;

        System.out.println("Bienvenido a la panadería.");
        System.out.println("Estos son nuestros productos:");

        //Se utiliza un ciclo for para recorrer los arreglos productos y precios y mostrar la información correspondiente en la consola

        for (int i = 0; i < productos.length; i++) {
            System.out.println(i + 1 + ". " + productos[i] + " - $" + precios[i]);
        }

        while (!salir) {
            System.out.println("Por favor seleccione el número del producto que desea comprar, o ingrese 0 para salir:");
            int seleccion = sc.nextInt();

            if (seleccion == 0) {
                salir = true;
                continue; //se termina el ciclo
            }

            if (seleccion >= 1 && seleccion <= productos.length) {
                System.out.println("Ha seleccionado " + productos[seleccion - 1] + ". El precio es $" + precios[seleccion - 1] + ".");
                System.out.println("Hay " + cantidades[seleccion - 1] + " unidades disponibles. ¿Cuántos desea comprar?");
                int cantidad = sc.nextInt();

                if (cantidad > cantidades[seleccion - 1]) {
                    System.out.println("Lo siento, no hay suficientes unidades disponibles.");
                } else {
                    double subtotal = cantidad * precios[seleccion - 1];
                    total += subtotal;
                    cantidades[seleccion - 1] -= cantidad;
                    System.out.println("El subtotal de su compra es $" + subtotal + ".");
                    System.out.println("¿Desea seguir comprando? (s/n)");
                    String respuesta = sc.next();

                    if (respuesta.equalsIgnoreCase("n")) {
                        salir = true;
                    }
                }
            } else {
                System.out.println("Selección inválida.");
            }
        }

        System.out.println("Gracias por su compra.");
        System.out.println("El total de su compra es $" + total + ".");
        System.out.println("Estos son los productos restantes:");

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - " + cantidades[i] + " unidades.");
        }
    }
}
