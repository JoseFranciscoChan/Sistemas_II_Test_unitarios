
/**
 *
 * @author J-CHAN
 */
public class Calculator {
    public static void main(String[] args) {
    
          Operaciones operacion1 = new Operaciones();
        
        System.out.println("La suma es: "+operacion1.suma(3,2));
        System.out.println("La resta es: "+operacion1.resta(3,2));
        System.out.println("La multiplicacion es: "+operacion1.multiplicacion(3,2));
        System.out.println("La division es: "+operacion1.division(6,2));
        System.out.println("La exponenciación es: "+operacion1.exponenciacion(6, 2));
        System.out.println("La raiz cuadrada es: "+operacion1.raiz_cuadrada(16));
        System.out.println("El porcentaje es: "+operacion1.porcentaje(200, 15));

     
    }
}
