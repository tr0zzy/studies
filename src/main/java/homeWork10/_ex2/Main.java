package homeWork10._ex2;

public class Main {
    enum Planet {
        MERCURY("Меркурий", 3.303e+23, 2.4397e6),
        VENUS("Венера", 4.869e+24, 6.0518e6),
        EARTH("Земля", 5.976e+24, 6.37814e6),
        MARS("Марс", 6.421e+23, 3.3972e6),
        JUPITER("Юпитер", 1.9e+27, 7.1492e7),
        SATURN("Сатурн", 5.688e+26, 6.0268e7),
        URANUS("Уран", 8.686e+25, 2.5559e7),
        NEPTUNE("Нептун", 1.024e+26, 2.4746e7);

        private final String name;
        private final double mass;
        private final double radius;

        private static final double G = 6.67300E-11; // гравитационная постоянная

        Planet(String name, double mass, double radius) {
            this.name = name;
            this.mass = mass;
            this.radius = radius;
        }

        public double surfaceGravity() {
            return G * mass / (radius * radius);
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf("%s: g = %.2f м/с²%n", planet.getName(), planet.surfaceGravity());
        }
    }
}
