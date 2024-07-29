//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void Ejercicio1(){
        int x = (int) 5.89 + (int) 3.45;
        System.out.println(x);
}
    public static void Ejercicio2(){
        char c = 'A';
        int asciiValue = (int) c;

        System.out.println("El valor ASCII de '" + c + "' es: " + asciiValue);
    }
    public static void Ejercicio3(){
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        System.out.println(i);
    }
    public static void Ejercicio4(){
        String numero= "15";
        int convertido= Integer.parseInt(numero);
        System.out.println("EL numero es: "+ convertido);
    }
    public static void Ejercicio5(){
        byte Vbyte = (byte) -1;
        char Vchar = (char) Vbyte;
        int Vint = (int) Vchar;

        System.out.println("El valor de byteValue: " + Vbyte);
        System.out.println("El valor de charValue: " + (int)Vchar);
        System.out.println("El valor de intValue: " + Vint);
    }
    public static void Ejercicio6(){
        int number = 65;
        char character = (char) number;

        System.out.println("El carácter correspondiente al número " + number + " es: " + character);
    }
    public static void Ejercicio7(){
        long longV = 100L;
        int intV = (int) longV;

        System.out.println("El valor de intValue es: " + intV);
    }
    public static void Ejercicio8(){
        float numeroFloat = 15.67f;
        String numeroString = Float.toString(numeroFloat);
        System.out.println("El número como String es: " + numeroString);
    }
    public static void Ejercicio9(){
        int resultado = (int) Math.round(3.7);
        System.out.println("El resultado es: " + resultado);
    }
    public static void Ejercicio10(){
        byte b = 50;
        short s = b;
        System.out.println("El valor de byte b: " + b);
        System.out.println("El valor de short s: " + s);
    }
    public static void Asignacion1(){
        int x = 10; x += 5;

        System.out.println("El Resultado Es: " + x);
    }
    public static void Asignacion2(){
     int y = 10;
     int x = 5;
     y *= (x + 5);

        System.out.println("El Resultado Es: " + y);

    }
    public static void Asignacion3(){
        int a = 15; a %= 4;


        System.out.println("El Valor de A Es: " + a);
    }
    public static void Asignacion4(){

        int x=15;
        int y=14;
        x += y;

        System.out.println("El Resultado Es: " + x);
    }
    public static void Asignacion5(){
      int x=10;
        System.out.println("Valor de x antes de: " + x);
        x ^= 2;
        System.out.println("Valor de x despues de: " + x);
    }
    public static void OperadoresID1(){
        int x = 5;
       int  y = ++x;
        System.out.println("Valor de x : " + x);
        System.out.println("Valor de y : " + y);
    }
    public static void OperadoresID2(){
        int a = 5;
        System.out.println(a++);
        System.out.println(a);
    }
    public static void OperadoresID3(){
        int x=10;
        System.out.println(x--);
    }
    public static void OperadoresID4(){
        int i=10;
        System.out.println(i++);
        System.out.println(++i);
    }
    public static void OperadoresID5(){
        int x = 3; x = x++;
        System.out.println("Valor de x : " + x);
    }
    public static void Combinados1(){
        int i = 5;
        i += ++i + i++ + ++i;
        System.out.println("Valor de i : " + i);
    }
    public static void Combinados2(){
        double x = 5.75;
        int res = (int) x;

        System.out.println("Valor original (double): " + x);
        System.out.println("Valor convertido a int: " + res);
        System.out.println(res++);
    }
    public static void Combinados3(){
        double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println(i--);
    }
    public static void Combinados4(){
        int Int = 9;
        double res = 0.0;
        res += (double) Int / 2.0;
        System.out.println("Valor original (int): " + Int);
        System.out.println("Resultado de la división (double): " + res);
    }
    public static void Combinados5(){
        char c = 'X';
        c += 32;
        System.out.println(c);
    }
    public static void Combinados6(){
        long Long = 100;

        short res = (short) Long;
        System.out.println("Valor original (long): " + Long);
        System.out.println("Valor convertido a short: " + res);
        res *= 3;
        System.out.println("Valor de resultado después de multiplicar por 3: " + res);
    }
    public static void Combinados7(){
        int x = 10;
        x += (x++) + (++x);
        System.out.println("Valor de x : " + x);
    }
    public static void Combinados8(){
        float Float = 100;

        byte res = (byte) Float;
        System.out.println("Valor original (float): " + Float);
        System.out.println("Valor convertido a byte: " + res);
        res -= 3;
        System.out.println("Valor de resultado después del predecremento por 3: " + res);
    }
    public static void Combinados9(){
        int i = 257;
        byte b = (byte)i;
        System.out.println(b);
    }
    public static void Combinados10(){
        double valorDouble = 10.7;
        int resultado = (int) valorDouble;
        resultado += 5;
        resultado++;
        System.out.println("El resultado final es: " + resultado);
    }

}