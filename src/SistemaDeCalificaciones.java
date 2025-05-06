class SistemaCalificaciones {
    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
    public static boolean aprobo(double promedio) {
        return promedio >= 60;
    }
    public static void mostrarResultados(double nota1, double nota2, double nota3) {
        double promedio = calcularPromedio(nota1, nota2, nota3);
        boolean paso = aprobo(promedio);

        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Promedio: " + promedio);
        if (paso) {
            System.out.println("pasó");
        } else {
            System.out.println("no pasó.");
        }
    }
}

