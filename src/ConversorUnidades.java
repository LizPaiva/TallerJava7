public class ConversorUnidades {
    public static double metrosACentimetros(double metros) {
        return metros * 100;
        // un mtr es igual a 100 cm
    }
    public static double kilogramosALibras(double kg) {
        return kg * 2.20462;
        // 1 kg son 2.2 lbr
    }
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static void mostrarResultados(double metros, double kg, double celsius) {
        double centimetros = metrosACentimetros(metros);
        double libras = kilogramosALibras(kg);
        double fahrenheit = celsiusAFahrenheit(celsius);

        System.out.println("Conversión:");
        System.out.println(metros + " metros son " + centimetros + " centímetros.");
        System.out.println(kg + " kg son " + libras + " libras.");
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
    }


}
