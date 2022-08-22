/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;



import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class main {
    public static void main(String [] args){
        String resultado="";
        int respuesta=0;
       
        coche coche=new coche();
        boolean selection=true;
        while(selection=true){
        resultado=JOptionPane.showInputDialog(null,"selecciones una opcion\n1-asignar cosas\n2-filtrar por ruedas\n3salir");
       
        switch(resultado){
                case "1":
                      resultado=JOptionPane.showInputDialog(null,"selecciones una opcion\n1-carros\n2-motocicletas\n3bicicletas\n4camionetas");
                      switch(resultado){
                          case"1":
                                 resultado=(JOptionPane.showInputDialog(null,"escriba el cilindrage"));
                                 coche.setcilindrado(resultado);
                                 respuesta=Integer.parseInt(JOptionPane.showInputDialog(null,"difite el numero de llantas"));
                                 coche.setruedas(respuesta);
                                 respuesta=Integer.parseInt(JOptionPane.showInputDialog(null,"digite el kilometrage"));
                                 coche.setvelocidad(respuesta);
                                 resultado=(JOptionPane.showInputDialog(null,"Escoja el color"));
                                 coche.setcolor(resultado);
                                  
                              break;
                                case"2":
                                 resultado=(JOptionPane.showInputDialog(null,"escriba el cilindrage"));
                                 coche.setcilindrado(resultado);
                                 respuesta=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de llantas"));
                                 coche.setruedas(respuesta);
                                 respuesta=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el kilometrage"));
                                 coche.setvelocidad(respuesta);
                                 resultado=(JOptionPane.showInputDialog(null,"digite el color"));
                                 coche.setcolor(resultado);
                              break;
                                case"3":
                                    
                              break;
                                    
                              
                                case"4":
                                    
                              break;
                      }
                    break;
                    case "2":
                        respuesta=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de llantas"));
                        coche.setruedas(respuesta);
                        if(coche.ruedas==2){
                              JOptionPane.showMessageDialog(null,"Motocicletas:\n HBMW \n KTM  \n Suzuki \n Yamaha \n");
                               JOptionPane.showMessageDialog(null,"Bicicletas:\n Shimano \n BMX \n Trek \nSpecialized\n");
                        }
                        if(coche.ruedas==4){
                              JOptionPane.showMessageDialog(null,"Carros:\n porche\n Dodge \n Lamborghini \n ferri \n");
                             JOptionPane.showMessageDialog(null,"Camionetas: \n toyota \n raptor \n Thule \n"); 
                        }
                      
                    break;
                    case "3":
                        System.exit(0);
                    break;
        }
        }

    }   
}
