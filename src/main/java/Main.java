public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("=== Temperature Converter Demo ===");
        System.out.println("300K to Celsius: " + converter.kelvinToCelsius(300) + "°C");
        System.out.println("32°F to Celsius: " + converter.fahrenheitToCelsius(32) + "°C");
        System.out.println("0°C to Fahrenheit: " + converter.celsiusToFahrenheit(0) + "°F");
        System.out.println("=== Container running successfully ===");
    }
}
