/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Juano
 */
public class Mavenproject2 {

    public static void main(String[] args) {
      System.out.println("Ejercicio 01");
      System.out.println("");
      System.out.println("Primera Clase");
      var persona1 = new Persona(); 
      var persona2 = new Persona(); 
      var persona3 = new Persona(); 

      
       persona1.nombre= "Maria";
       persona1.estado= "Viuda";
       persona1.edad= 60;
       persona1.cedula= "0190345639" ;
       
       persona2.nombre= "Carlos";
       persona2.estado= "Casado";
       persona2.edad= 26;
       persona2.cedula= "0100405534" ;
       
       persona3.estado= "Soltero";
       persona3.nombre= "Jesus";
       persona3.edad= 33;
       persona3.cedula= "0156493087" ;
       
       
       System.out.println("Mi vecina: Se llama "+persona1.nombre+", tiene "
       +persona1.edad+" años "+",su número de cedula es "+
       persona1.cedula + " y es "  +persona1.estado);
       System.out.println("Mi vecino: Se llama "+persona2.nombre+", tiene "
       +persona2.edad+" años "+",su número de cedula es "+persona2.cedula
       + " y es " +persona2.estado);
       System.out.println("Mi tio: Se llama "+persona3.nombre+", tiene "
       +persona3.edad+" años "+",su número de cedula es "+persona3.cedula
       + " y esta " +persona3.estado);
       
      var anillo1 = new Anillo(); 
      var anillo2 = new Anillo(); 
      var anillo3 = new Anillo(); 
      
      anillo1.color ="Dorado";
      anillo1.material="Oro";
      anillo1.talla= 10;
      anillo1.precio= 70 ;
      
      anillo2.color ="Plateado";
      anillo2.material="acero";
      anillo2.talla= 8;
      anillo2.precio= 20 ;
      
      anillo3.color ="Verde";
      anillo3.material="Plastico";
      anillo3.talla= 6;
      anillo3.precio= 2;
      
      System.out.println("");
      System.out.println("Segunda Clase");
      System.out.println("El primer anillo: Es de color "+ anillo1.color+
      ", su material es " +anillo1.material+ ", esta valorado en "+
      anillo1.precio+ " dolares "+ " y su talla es "+ anillo1.talla+ 
      " centimetros." );
      System.out.println("El segundo anillo: Es de color "+ anillo2.color+
      ", su material es " +anillo2.material+ ", esta valorado en "+
      anillo2.precio+ " dolares "+ " y su talla es "+ anillo2.talla+ 
      " centimetros." );
      System.out.println("El tercer anillo: Es de color "+ anillo3.color+
      ", su material es " +anillo3.material+ ", esta valorado en "+
      anillo3.precio+ " dolares "+ " y su talla es "+ anillo3.talla+ 
      " centimetros." );
      
      var ave1 = new Ave(); 
      var ave2 = new Ave(); 
      var ave3 = new Ave(); 
      
      ave1.color ="Amarilo";
      ave1.nombre="Perico";
      ave1.peso= 35;
      ave1.region="Australia" ;
      
      ave2.color ="Negro";
      ave2.nombre="Tucan";
      ave2.peso= 320 ;
      ave2.region="Mexico" ;
      
      ave3.color ="Naranja";
      ave3.nombre="Pinzon";
      ave3.peso= 60;
      ave3.region= "Ecuador" ;
      
      System.out.println("");
      System.out.println("Tercera Clase");
      System.out.println("El ave de mi primo: Es un "+ ave1.nombre+
      ", su color es " +ave1.color+ ", su peso es "+
      ave1.peso+ " gramos "+ "y su pais natal es "+ ave1.region);
      System.out.println("El ave de mi hermano: Es un "+ ave2.nombre+
      ", su color es " +ave2.color+ ", su peso es "+
      ave2.peso+ " gramos "+ "y su pais natal es "+ ave2.region);
      System.out.println("El ave de mi hijo: Es un "+ ave3.nombre+
      ", su color es " +ave3.color+ ", su peso es "+
      ave3.peso+ " gramos "+ "y su pais natal es "+ ave3.region);
     
      var abrigo1 = new Abrigo(); 
      var abrigo2 = new Abrigo(); 
      var abrigo3 = new Abrigo(); 
      
      abrigo1.color="Negro";
      abrigo1.marca="Gucci";
      abrigo1.material="Cuero";
      abrigo1.talla= 32;
     
      abrigo2.color="Marron";
      abrigo2.marca="Chanel";
      abrigo2.material="Algodon";
      abrigo2.talla= 36;
      
      abrigo3.color="Rosa";
      abrigo3.marca="Prada";
      abrigo3.material="Seda";
      abrigo3.talla= 30;
      
      System.out.println("");
      System.out.println("Cuarta Clase");
      System.out.println("El primer abrigo: Es de color "+ abrigo1.color+
      ", es de marca " +abrigo1.marca+ ", su material es "+abrigo1.material +
      " y su talla es "+abrigo1.talla);
      System.out.println("El segundo abrigo: Es de color "+ abrigo2.color+
      ", es de marca " +abrigo2.marca+ ", su material es "+abrigo2.material +
      " y su talla es "+abrigo2.talla);
      System.out.println("El tercer abrigo: Es de color "+ abrigo3.color+
      ", es de marca " +abrigo3.marca+ ", su material es "+abrigo3.material +
      " y su talla es "+abrigo3.talla);
      
      var celular1 = new Celular(); 
      var celular2 = new Celular(); 
      var celular3 = new Celular();
      
      celular1.marca="Samsung";
      celular1.modelo="Galaxy S22";
      celular1.almacenamiento=32;
      celular1.precio=650;
      
      celular2.marca="One Plus";
      celular2.modelo="10 Pro";
      celular2.almacenamiento=16;
      celular2.precio=400;
      
      celular3.marca="Iphone";
      celular3.modelo="14 Pro Max";
      celular3.almacenamiento=128;
      celular3.precio=920;

      System.out.println("");
      System.out.println("Quinta Clase");
      System.out.println("El celular de mi mamá: Es un "+ celular1.marca+
      ", el modelo es "+celular1.modelo+ ", su almacenamiento es de "
      +celular1.almacenamiento +" gigas "+ "y su precio es "+celular1.precio+
      " dolares.");
      System.out.println("El celular de mi papá: Es un "+ celular2.marca+
      ", el modelo es "+celular2.modelo+ ", su almacenamiento es de "
      +celular2.almacenamiento +" gigas "+ "y su precio es "+celular2.precio+
      " dolares.");
      System.out.println("Mi celular: Es un "+ celular3.marca+
      ", el modelo es "+celular3.modelo+ ", su almacenamiento es de "
      +celular3.almacenamiento +" gigas "+ "y su precio es "+celular3.precio+
      " dolares.");
      
      var computadora1 = new Computadora(); 
      var computadora2 = new Computadora(); 
      var computadora3 = new Computadora();
      
      computadora1.marca="Hp";
      computadora1.procesador="Core i5";
      computadora1.color="Negra";
      computadora1.año= 2018;
      
      computadora2.marca="Lenovo";
      computadora2.procesador="Core i7";
      computadora2.color="Plateada";
      computadora2.año= 2020;
      
      computadora3.marca="Asus";
      computadora3.procesador="Ryzen 9";
      computadora3.color="Roja";
      computadora3.año= 2022;
      
      System.out.println("");
      System.out.println("Sexta Clase");
      System.out.println("Mi primera computadora: Es de marca "
      + computadora1.marca+ ", tiene un procesador "+computadora1.procesador+
      ", es de color "+computadora1.color + " y la compré en el año "
      +computadora1.año);
      System.out.println("Mi segunda computadora: Es de marca "
      + computadora2.marca+ ", tiene un procesador "+computadora2.procesador+
      ", es de color "+computadora2.color + " y la compré en el año "
      +computadora2.año);
      System.out.println("Mi tercera computadora: Es de marca "
      + computadora3.marca+ ", tiene un procesador "+computadora3.procesador+
      ", es de color "+computadora3.color + " y la compré en el año "
      +computadora3.año);
      
      
    }
    
    
       
       
               
      
       
       
       
               
    }
}

   
