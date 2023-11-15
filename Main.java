package pkg15112023;

public class Main {

    public static void main(String[] args) {
        
       Persona persona = new Persona();
       
       persona.nombre = "Gabriel";
       persona.apellido = "Lopez";
       persona.RUT = "21.304.795-7";
       persona.edad = 21;
       persona.genero = "Masculino";
       persona.nacionalidad = "Chilena";
       persona.estatura = 1.65;
       persona.peso = 55.1;
       
       // Mostrar información final
       persona.informacion();
       
    }  
}
