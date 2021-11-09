package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class Test {
    public static void main(String[] args) {
//        System.out.println("Dia 1 : " + Dias.LUNES);
//        indicarDiaSemana(Dias.JUEVES);
        
        System.out.println("Continente numero 4: " + Continentes.AMERICA);
        //para mostrar 
        System.out.println("Numeros de paises del cuarto continente: " + Continentes.AMERICA.getPaises());
    
    
    }
    
    
    
    
    //METODO
  private static void indicarDiaSemana(Dias dias){
      switch(dias){
          case LUNES:
              System.out.println("primer dia de la semana");
              break;
          case MARTES:
              System.out.println("segundo dia de la semana");
              break;
          case MIERCOLES:
              System.out.println("tercer dia de la semana");
              break;
          case JUEVES:
              System.out.println("cuarto dia de la semana");
              break;
          case VIERNES:
              System.out.println("quinto dia de la semana");
              break;
          case SABADO:
              System.out.println("sexto dia de la semana");
              break;
          case DOMINGO:
              System.out.println("septimo dia de la semana");
              break;
          
  }
  }
}
