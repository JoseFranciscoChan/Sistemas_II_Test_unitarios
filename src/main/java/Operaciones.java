
/**
 *
 * @author J-CHAN
 */
public class Operaciones {
 public  int  suma( int a,  int b){
        return a+b;
    }

    public  int  resta( int a,  int b){
        return a-b;
    }
    
    public  int  multiplicacion( int a,  int b){
        return a*b;
    }
    
    public  int  division( int a,  int b){
        return a/b;
    }   
   
    public  int  exponenciacion( int a,  int b){
        
        int cuadrado = (int) Math.pow(a, b);
        return cuadrado;
    }
    
    public  double   raiz_cuadrada( int a){
        double resultado = Math.sqrt(a);
        return resultado;
    }
    
    public  double porcentaje( int a,  int b){
        double por;
        int cien = 100;
        por=a*b;
        double total= por/cien;
        return total;
    }
}
