package dayone;

public class VariableNameDemo {
    public static void main(String [] args) {
        int age = 25;
        int studentCount = 100;
        int _score = 95;        // valid but not recommended
        int $total = 500;       // valid but not recommended
        // int 1stPlace = 1;    // invalid: cannot start with a digit
        // int class = 10;      // invalid: 'class' is a reserved keyword
        int gearRatio = 6;
        final int MAX_SPEED = 120;  // constant variable
    }
}
