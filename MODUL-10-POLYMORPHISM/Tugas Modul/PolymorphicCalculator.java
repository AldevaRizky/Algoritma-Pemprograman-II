import java.util.Scanner;

// Abstract class untuk operasi matematika
abstract class Operation {
    protected double number1;
    protected double number2;

    public Operation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public abstract double calculate();
}

// Class penjumlahan
class Addition extends Operation {
    public Addition(double number1, double number2) {
        super(number1, number2);
    }

    public double calculate() {
        return number1 + number2;
    }
}

// Class pengurangan
class Subtraction extends Operation {
    public Subtraction(double number1, double number2) {
        super(number1, number2);
    }

    public double calculate() {
        return number1 - number2;
    }
}

// Class perkalian
class Multiplication extends Operation {
    public Multiplication(double number1, double number2) {
        super(number1, number2);
    }

    public double calculate() {
        return number1 * number2;
    }
}

// Class pembagian
class Division extends Operation {
    public Division(double number1, double number2) {
        super(number1, number2);
    }

    public double calculate() {
        return number1 / number2;
    }
}

// Class utama
public class PolymorphicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Masukkan angka pertama: ");
            double number1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double number2 = scanner.nextDouble();

            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");

            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();
            Operation operation;

            switch (choice) {
                case 1:
                    operation = new Addition(number1, number2);
                    System.out.println("Hasil: " + operation.calculate());
                    break;
                case 2:
                    operation = new Subtraction(number1, number2);
                    System.out.println("Hasil: " + operation.calculate());
                    break;
                case 3:
                    operation = new Multiplication(number1, number2);
                    System.out.println("Hasil: " + operation.calculate());
                    break;
                case 4:
                    operation = new Division(number1, number2);
                    System.out.println("Hasil: " + operation.calculate());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.print("Lanjutkan? (y/n): ");
            String continueChoice = scanner.next();

            if (continueChoice.equalsIgnoreCase("n")) {
                continueCalculation = false;
            }
        }
    }
}