class Converter {
    // Method to convert a string to an integer
    int convert(String s, String type) {
        if (type.equals("int")) {
            return Integer.parseInt(s);
        }
        throw new IllegalArgumentException("Invalid type for this method");
    }

    // Method to convert a string to a double
    double convert(String s, String type) {
        if (type.equals("double")) {
            return Double.parseDouble(s);
        }
        throw new IllegalArgumentException("Invalid type for this method");
    }

    // Method to convert a string to a boolean
    boolean convert(String s, String type) {
        if (type.equals("boolean")) {
            return Boolean.parseBoolean(s);
        }
        throw new IllegalArgumentException("Invalid type for this method");
    }

    // Display method to show the conversion results for each type
    void display() {
        String intString = "123";
        String doubleString = "123.45";
        String booleanString = "true";

        int intValue = convert(intString, "int");
        double doubleValue = convert(doubleString, "double");
        boolean booleanValue = convert(booleanString, "boolean");

        System.out.println("Converted integer value: " + intValue);
        System.out.println("Converted double value: " + doubleValue);
        System.out.println("Converted boolean value: " + booleanValue);
    }
}

public class Overloading3{
    public static void main(String[] args) {
        Converter converter = new Converter();
        converter.display();
    }
}
