package pkg15112023;

public class Persona {
    
    String ANSI_BLUE = "\u001B[34m";
    
    // ATRIBUTOS
    // Public String
    // Public int
    
    String nombre, apellido, RUT, genero, nacionalidad;
    int edad;
    double estatura, peso;
    
    // METODO O COMPORTAMIENTO
    // void [name()]
    // Public void [name()]
    // Private void [name()]
    
    void respirar() {
        System.out.println(nombre + "Esta respirando");
    }
    
    void caminar() {
        System.out.println(nombre + "Esta caminando");
    }
    
    void hablar() {
        System.out.println(nombre + "Esta hablando");
    }
    
    void pensar() {
        System.out.println(nombre + "Esta pensando");
    }
    
    void informacion() {
        System.out.println(ANSI_BLUE + "--------------------------");
        System.out.println("        INFORMACIÓN");
        System.out.println(ANSI_BLUE + "--------------------------");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("RUT: " + RUT);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Peso: " + peso);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println(ANSI_BLUE + "--------------------------");
    }
    
}
