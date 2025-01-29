public class MixMatch {
    // Your main() method goes here.
    public static void main(String[] args) {

        String varString = "Hello, Java!";
        char varChar = 'A';
        short varShort = 32000;
        int varInt = 7;
        long varLong = 123456789L;
        float varFloat = 3.14f;
        double varDouble = 2.71828;
        boolean varBoolean = true;

        System.out.println(varString + " <- String, stores a sequence of characters.");
        System.out.println(varChar + " <- Char, stores a single character.");
        System.out.println(varShort + " <- Short, stores whole numbers from -32,768 to 32,767.");
        System.out.println(varInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647.");
        System.out.println(varLong + " <- Long, stores large whole numbers up to 9,223,372,036,854,775,807.");
        System.out.println(varFloat + " <- Float, stores fractional numbers up to 6-7 decimal digits.");
        System.out.println(varDouble + " <- Double, stores fractional numbers up to 15 decimal digits.");
        System.out.println(varBoolean + " <- Boolean, stores true or false values.");

        System.out.println("Mixing types: " + varString + ", " + varInt + ", " + varDouble + ", " + varBoolean);
    }
}