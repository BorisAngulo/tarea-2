
public class Matematico{
    private double n1, n2, n3;
    private double    a, b;
    private String respuesta;
    public String mayorDe3Numeros(int n1, int n2, int n3){
        String respuesta;
        respuesta = "";
        if(n1 > n2 && n2 > n3){
            respuesta = "el mayor es " + n1 + " el segundo es " + n2 + " y el numero menor es " + n3;
        }else{if(n1 > n3 && n3 > n2){
            respuesta = "el mayor es " + n1 + " el segundo es " + n3 + " y el numero menor es " + n2;
           }else{if(n2 > n3 && n3 > n1){
               respuesta = "el mayor es " + n2 + " el segundo es " + n3 + " y el numero menor es " + n1;
            }else{if(n2 > n1 && n1 > n3){
                respuesta = "el mayor es " + n2 + " el segundo es " + n1 + " y el numero menor es " + n3;
            }else{if(n3 > n2 && n2 > n1){
                respuesta = "el mayor es " + n3 + " el segundo es " + n2 + " y el numero menor es " + n1;
            }else{if(n3 > n1 && n1 > n2){
                respuesta = "el mayor es " + n3 + " el segundo es " + n1 + " y el numero menor es " + n2;
            }else{if(n3 == n1 && n1 == n2){
                respuesta = "los tres numeros son iguales";
            }else{if(n3 == n1 && n1 > n2){
                respuesta = "el numero " + n3 + " y " + n1 + " son iguales y " + n2 + " es el menor de los dos ";
            }else{if(n2 == n3 && n1 > n3){
                respuesta = "el numero mayor es " + n1 + " y " + n2 + " " +  n3 + " son iguales";
            }else{if(n3 == n1 && n2 > n1){
                respuesta = "el numero mayor es " + n2 + " y " + n1 + " " + n3 + " son iguales";
            }else{if(n2 == n1 && n3 > n1){
                respuesta = "el numero mayor es " + n3 + " y " + n1 + " " + n2 + " son iguales";
            }}}}}}}}}
        }
            
        }
         
        return respuesta;
    } 
    
    public double area(double a, double b){
        double area;
        area = a * b;
        return area;
        
    }
    
    public double distanciaDosPuntos(Punto uno , Punto dos){
        double distanciaPuntos;
        distanciaPuntos = Math.sqrt(Math.pow(uno.getX() - dos.getX(),2) + (Math.pow(uno.getY() - dos.getY(),2))); 
        return distanciaPuntos;
    } 
    
    public String cuadrante(Punto uno){
        String cuadrante;
        cuadrante = "";
        if(uno.getX() > 0.0 && uno.getY() > 0.0){
            cuadrante = "El punto esta ubicado en el primer cuadrante";
        }else{if(uno.getX() < 0.0 && uno.getY() < 0.0){
            cuadrante = "El punto esta ubicado en el tercer cuadrante";
        }else{if(uno.getX() < 0.0 && uno.getY() > 0.0){
            cuadrante = "El punto esta ubicado en el segundo cuadrante";
        }else{if(uno.getX() > 0.0 && uno.getY() < 0.0){
            cuadrante = "El punto esta ubicado en el cuadrante cuadrante";
        }else{if(uno.getX() == 0.0 && uno.getY() == 0.0){
            cuadrante = "el punto se ubica en el origen";
        }}}}}
        return cuadrante;
    }
}
       
    

    

