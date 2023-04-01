public interface ReplaceApp {
    // «La lluvia en Sevilla es una maravilla»
    // Reemplaza todas las a del String anterior por una e.

    public static void main(String[] args) {
        String oracion = "La lluvia en Sevilla es una maravilla";
        System.out.println(oracion);

        System.out.println("reemplazo " + oracion.replace("a", "e"));

    }
}
