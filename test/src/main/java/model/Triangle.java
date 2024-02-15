package model;

public class Triangle {

    public static final String EQUILATERAL = "Equilateral";
    public static final String ISOSCELES = "Isosceles";
    public static final String SCALENE = "Scalene";

    public static final String INVALID = "Invalid";

    private int a;
    private int b;
    private int c;


    public Triangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String whatType() {

    if (a == 0 || b == 0 || c == 0) {
        return INVALID;
        } else if(a == b && b == c) {
            return EQUILATERAL;
        } else if (a == b || b == c || a == c) {
            return ISOSCELES;
        } else if ( a!= b && b!= c && a!= c){
            return SCALENE;
        }
        else {
            return "XD";
        }

    }
}
