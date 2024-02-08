package org.example;

import javax.management.modelmbean.DescriptorSupport;
import java.util.Random;
import java.util.Scanner;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class Main {
    public static void main(String[] args) {
       String nickname;
       String nicknameBd="xeyms";
       String contraseña;
       String contraseñaBd="jose0113";
       Integer nivelvida=70;
       Integer contadorSkills=0;
       Integer contadorDisparos=0;
       Integer precioSkillVida=100000;
       Integer danoDisparo=-5;
       boolean estaMuerto=false;


       String juego1="Free Fire";
       String juego2="Fifa 24";
       String juegoSeleccionado;

        Scanner keyboard =new Scanner(System.in);

        //proceso

        System.out.println("*****Ingresando*****");
        System.out.println("****Bienvenido Colega*****");
        System.out.println("----------------------------");
        System.out.print("digita tu nickname: ");
        nickname=keyboard.nextLine();

        System.out.println("Ingrese contraseña: ");
        contraseña=keyboard.nextLine();

        if (nickname.equals(nicknameBd) && contraseñaBd.equals(contraseñaBd)) {
            System.out.println("Bienvenido a PSPLUS" +nickname);
            //rutina
            System.out.println("Seleccione el juego: ");
            juegoSeleccionado=keyboard.nextLine();
            if (juegoSeleccionado.equals(juego1)) {


                int disparo;
                do {

                    //random (DISPARAR O NO)
                    Random random = new Random();
                    disparo = random.nextInt(2);

                    if (disparo == 1) {
                        contadorDisparos=contadorDisparos+1;
                        nivelvida=nivelvida+danoDisparo;
                        System.out.println("Te dispararon, y tu vida quedo en:"+nivelvida);
                        if (contadorDisparos==3){
                            estaMuerto=true;
                            break;
                        }



                    } else {
                        contadorDisparos=0;
                        System.out.println("Esquivo la bala.....");
                    }

                } while (estaMuerto == false);

                System.out.println("Estas muerto!!!");






            }else{
                System.out.println("Servidores no disponibles....");
            }
        }else{
            System.out.println("Usuario no encontrado...");
        }






    }
}