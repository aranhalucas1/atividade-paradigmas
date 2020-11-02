package program.util;

public class InputVerify {

    // Método para validar o que o usuario digitou
    public static boolean inputValidation(String input) {
        try {
            Double.parseDouble(input);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
