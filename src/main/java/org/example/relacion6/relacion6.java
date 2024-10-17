package org.example.relacion6;

public class relacion6 {
    public static Boolean esPrimo(Integer numero){
        Boolean respuesta = true;
        int contadorResultado = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contadorResultado++;
            }
        }
        if (contadorResultado > 2) {
            respuesta = false;
        }
        return respuesta;
    };

    public static Double potencia(Integer base, Integer exponent){
        return Math.pow(base, exponent);
    };

    public static String voltea(Integer numero){
        StringBuilder volteador = new StringBuilder();
        volteador.append(numero.toString());
        return  volteador.reverse().toString();
    }
    public static Integer posicionDeDigito(Integer numero, Integer digitoABuscar){
        return numero.toString().indexOf(digitoABuscar.toString());
    }

    public static int quitaPorDelante(int num, int n) {
        num = Math.abs(num);
        String numStr = Integer.toString(num);

        Integer resultado ;

        if (n >= numStr.length()) {
            resultado = 0;
        }
        resultado=  Integer.parseInt(numStr.substring(n));
        return resultado;
    }

    public static String pegaPorDelante(int num, int digito) {
        String numStr = Integer.toString(num);
        String digitoStr = Integer.toString(digito);
        return digitoStr+ numStr;
    }

    public static String juntaNumeros(int num1, int num2) {
        String num1Str = Integer.toString(num1);
        String num2Str = Integer.toString(num2);

        return  num1Str + num2Str;
    }

    public static void main(String[] args) {
    }
}
