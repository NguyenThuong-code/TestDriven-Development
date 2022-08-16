package triangle;

public class Triangle {
    public static String getTypeTriangle(int a, int b, int c) {
        String text ="";
        if (isEquilateral(a, b, c) == true) {
            text= "equilateral";
        }else if(isIsosceles(a,b,c)==true) {
            text = "isosceles";
        }else if(isTriangle(a,b,c)==true){
            text= "triangle";
        }else {
            text="Nottriangle";
        }

        return text;
    }

    private static boolean isTriangle(int a, int b, int c) {
        if(a+b>c && a+c>b &&b+c> a)
            return true;
        else
            return false;
    }

    private static boolean isIsosceles(int a, int b, int c) {
        if(a+b>c && a+c>b &&b+c> a && (a == b) || (b == c) || (c == a))
            return true;
        else
            return false;
    }


    private static boolean isEquilateral(int a, int b, int c ) {
    if(a+b>c && a+c>b &&b+c> a && a==b&&b==c)
        return true;
    else
        return false;
    }

}
