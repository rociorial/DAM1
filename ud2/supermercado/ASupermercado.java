package ud2.supermercado;
            // Mostrar información de la compra
            System.out.printf("\n-----------------------");
            System.out.println("\nResumen de la compra:");
            System.out.printf("Cantidad producto: %d uds%n", cantidad);
            System.out.printf("Precio producto: %.2f euros%n", precio);
            System.out.printf("Importe total: %.2f euros%n", importeTotal);
            System.out.println("-----------------------");

            // Pedir método de pago
            int metodoPago = 0;
            do {
                System.out.print("\n¿Quieres pagar con efectivo (1) o con tarjeta (2)?: ");
                try {
                    metodoPago = sc.nextInt();

                    if (metodoPago != 1 && metodoPago != 2) {
                        System.out.println("\n**Opción no válida. Debes elegir 1 para efectivo o 2 para tarjeta.**\n");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\n**Error: Valor no válido**\n");
                    sc.nextLine(); 
                }
            } while (metodoPago != 1 && metodoPago != 2); // Repetir hasta obtener un valor válido

            // Manejar metodo de pago
            if (metodoPago == 1) {
                // Pago en efectivo
                double efectivo;
                do {
                    System.out.print("Introduce el importe entregado por el cliente: ");
                    efectivo = validarPrecio();
                    if (efectivo < importeTotal) {
                        System.out.println("El importe entregado no cubre el total. Inténtelo de nuevo:");
                    }
                } while (efectivo < importeTotal);

                double cambio = efectivo - importeTotal;
                System.out.println("\n------------------------------");
                System.out.printf("Cambio a devolver: %.2f euros%n", cambio);
                desglosarCambio(cambio);
            } else if (metodoPago == 2) {
                // Pago con tarjeta
                System.out.println("Pago realizado con tarjeta. Gracias por su compra.");
            } else {
                System.out.println("\n**Opción no válida. Inténtelo de nuevo.**\n");
            }

            // Preguntar si se desea procesar otro cliente
            String respuesta;
            do {
                System.out.print("\n¿Desea realizar otra compra? (si / no): ");
                respuesta = sc.next().trim().toLowerCase();
                if (!respuesta.equals("si") && !respuesta.equals("no")) {
                    System.out.println("\n**Por favor, introduce 'si' o 'no'.**\n");
                }
            } while (!respuesta.equals("si") && !respuesta.equals("no"));

            nuevoCliente = respuesta.equals("si");
        } while (nuevoCliente);

        System.out.println("Gracias confiar en nosotros para su compra. ¡Hasta pronto!");
        sc.close();
    }
}