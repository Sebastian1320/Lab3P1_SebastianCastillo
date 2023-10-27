/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_sebastiancastillo;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Lab3P1_SebastianCastillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("***** M E N U *****");
        System.out.println("1. Sucesiones y más sucesiones!");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en casa!");
        System.out.println("4. Para salir");
        int opcion= leer.nextInt();
        while (opcion!=4){
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese el numero inicial");
                    int num=leer.nextInt();
                    System.out.println("Ingrese la diferencia");
                    int dif=leer.nextInt();
                    System.out.println("Ingrese cuantas veces desea visualizar");
                    int n=leer.nextInt();
                    for(int i=0; i<n;i++){
                        System.out.print(num);
                        num=num+dif+i;
                        if(i<n-1){
                            System.out.print(",");
                        }
                    }
                    System.out.println();
                    System.out.print("Que numero desea visualizar en la sucecion");
                    int n2=leer.nextInt();
                    for (int x=n; x<n2-1; x++) {
                        num=num+dif+x;
                    }
                    System.out.println(num);
                    break;
                }
                case 2:
                    System.out.println("Ingrese el modo de pelea que quiera");
                    System.out.println("1.- Hasta la muerte");
                    System.out.println("2.- por ronda");
                    int pelea=leer.nextInt();
                    System.out.println("Estadisticas de los pokemones");
                    System.out.println( "Vaporeon Vida:280 Ataque:80 Defensa:15%");
                    System.out.println("Blastoise Vida:300 Ataque:50 Defensa:10%");
                    System.out.println("Pikachu Vida:300 Ataque:70 Defensa:25%");
                    System.out.println("Mewtwo Vida:250 Ataque:75 Defensa:20%");
                    switch (pelea){
                        case 1:
                            System.out.println("Ingrese una pelea determinada");
                            System.out.println("1.- Vaporeon vrs Mewtwo");
                            System.out.println("2.- Blastoise vrs Pikachu");
                            System.out.println("3.- Mewtwo vrs Pikachu");
                            System.out.println("4.- Pikachu vrs Vaporeon");
                            int pred=leer.nextInt();
                            switch (pred){
                                case 1:{
                                    double vida=280;
                                    double vida2=250;
                                    int ronda=1;
                                    while(vida>0&&vida2>0){
                                        System.out.println("---------- Ronda "+ronda+" ----------");
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        vida=vida-75*0.85;
                                        vida2=vida2-80*0.80;
                                        if(vida<0){
                                            vida=0;
                                        }
                                        else if(vida2<0){
                                            vida2=0;
                                        }
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        ronda=ronda+1;
                                  }
                                     System.out.println("******* Fin de la Batalla *******");
                                    if(vida>0){
                                        System.out.println("Pokemon 1 ha ganado");
                                    }
                                    else if(vida2>0){
                                        System.out.println("Pokemon 2 ha ganado");
                                    }
                                    else if (vida<0||vida2<0){
                                        System.out.println(" Es un empate!!!");
                                    }
                                    break;
                                }//fin case
                                case 2:{
                                    double vida=300;
                                    double vida2=300;
                                    int ronda=1;
                                    while(vida>0&&vida2>0){
                                        System.out.println("---------- Ronda "+ronda+" ----------");
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        vida=vida-70*0.90;
                                        vida2=vida2-50*0.75;
                                        if(vida<0){
                                            vida=0;
                                        }
                                        else if(vida2<0){
                                            vida2=0;
                                        }
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        ronda=ronda+1;
                                  }
                                     System.out.println("******* Fin de la Batalla *******");
                                    if(vida>0){
                                        System.out.println("Pokemon 1 ha ganado");
                                    }
                                    else if(vida2>0){
                                        System.out.println("Pokemon 2 ha ganado");
                                    }
                                    else if (vida<0||vida2<0){
                                        System.out.println(" Es un empate!!!");
                                    }
                                    break;
                                }//fin case 2
                                case 3:{
                                    double vida=250;
                                    double vida2=300;
                                    int ronda=1;
                                    while(vida>0&&vida2>0){
                                        System.out.println("---------- Ronda "+ronda+" ----------");
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        vida=vida-70*0.80;
                                        vida2=vida2-75*0.75;
                                        if(vida<0){
                                            vida=0;
                                        }
                                        else if(vida2<0){
                                            vida2=0;
                                        }
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        ronda=ronda+1;
                                  }
                                     System.out.println("******* Fin de la Batalla *******");
                                    if(vida>0){
                                        System.out.println("Pokemon 1 ha ganado");
                                    }
                                    else if(vida2>0){
                                        System.out.println("Pokemon 2 ha ganado");
                                    }
                                    else if (vida<0||vida2<0){
                                        System.out.println(" Es un empate!!!");
                                    }
                                    break;
                                }//fin case 3
                                case 4:{
                                    double vida=300;
                                    double vida2=280;
                                    int ronda=1;
                                    while(vida>0&&vida2>0){
                                        System.out.println("---------- Ronda "+ronda+" ----------");
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        vida=vida-80*0.75;
                                        vida2=vida2-70*0.85;
                                        if(vida<0){
                                            vida=0;
                                        }
                                        else if(vida2<0){
                                            vida2=0;
                                        }
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        ronda=ronda+1;
                                  }
                                    System.out.println("******* Fin de la Batalla *******");
                                    if(vida>0){
                                        System.out.println("Pokemon 1 ha ganado");
                                    }
                                    else if(vida2>0){
                                        System.out.println("Pokemon 2 ha ganado");
                                    }
                                    else if (vida<0||vida2<0){
                                        System.out.println(" Es un empate!!!");
                                    }
                                    break;
                                }//fin case 4
                            }
                            break;
                        case 2: 
                            System.out.println("Ingrese el numero de rondas ");
                            int ronda=leer.nextInt();
                            if (ronda>0&&ronda<10){
                            System.out.println("Ingrese una pelea determinada");
                            System.out.println("1.- Vaporeon vrs Mewtwo");
                            System.out.println("2.- Blastoise vrs Pikachu");
                            System.out.println("3.- Mewtwo vrs Pikachu");
                            System.out.println("4.- Pikachu vrs Vaporeon");
                            int pred2=leer.nextInt();
                            switch (pred2){
                                 case 1:{
                                    double vida=280;
                                    double vida2=250;
                                    for(int i=1;i<=ronda;i++){
                                        System.out.println("---------- Ronda "+i+" ----------");
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        vida=vida-75*0.85;
                                        vida2=vida2-80*0.80;
                                        if(vida<0){
                                            vida=0;
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Pokemon 1 ha ganado");
                                            break;
                                            
                                        }
                                        else if(vida2<0){
                                            vida2=0;
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Pokemon 2 ha ganado");
                                            break;
                                        }
                                        else if(vida<0&&vida2<0){
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Fue un empate");
                                        }

                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                  }
                                    break;
                                }//fin case
                                case 2:{
                                    double vida=300;
                                    double vida2=300;
                                    for(int i=1;i<=ronda;i++){
                                        System.out.println("---------- Ronda "+i+" ----------");
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        vida=vida-70*0.90;
                                        vida2=vida2-50*0.75;
                                        if(vida<0){
                                            vida=0;
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Pokemon 1 ha ganado");
                                            break;
                                            
                                        }
                                        else if(vida2<0){
                                            vida2=0;
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Pokemon 2 ha ganado");
                                            break;
                                        }
                                        else if(vida<0&&vida2<0){
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Fue un empate");
                                        }
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                  }
                                    break;
                                }//fin case 2
                                case 3:{
                                    double vida=250;
                                    double vida2=300;
                                    for(int i=1;i<=ronda;i++){
                                        System.out.println("---------- Ronda "+i+" ----------");
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        vida=vida-70*0.80;
                                        vida2=vida2-75*0.75;
                                        if(vida<0){
                                            vida=0;
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Pokemon 1 ha ganado");
                                            break;
                                            
                                        }
                                        else if(vida2<0){
                                            vida2=0;
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Pokemon 2 ha ganado");
                                            break;
                                        }
                                        else if(vida<0&&vida2<0){
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Fue un empate");
                                        }

                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                  }
                                     
                                    break;
                                }//fin case 3
                                case 4:{
                                    double vida=300;
                                    double vida2=280;
                                    for(int i=1;i<=ronda;i++){
                                        System.out.println("---------- Ronda "+i+" ----------");
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        vida=vida-80*0.75;
                                        vida2=vida2-70*0.85;
                                        if(vida<0){
                                            vida=0;
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Pokemon 1 ha ganado");
                                            break;
                                            
                                        }
                                        else if(vida2<0){
                                            vida2=0;
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Pokemon 2 ha ganado");
                                            break;
                                        }
                                        else if(vida<0&&vida2<0){
                                            System.out.println("Vida de pokemon 1 "+vida);
                                            System.out.println("Vida de pokemon 2 "+vida2);
                                            System.out.println("******* Fin de la Batalla *******");
                                            System.out.println("Fue un empate");
                                        }
                                        System.out.println("Vida de pokemon 1 "+vida);
                                        System.out.println("Vida de pokemon 2 "+vida2);
                                  }
                                    break;
                                }//fin case 4
                            } 
                            } else{
                                System.out.println("Ronda no puede ser menor que 0 o mayor que 10");
                            }
                            break;
                    }
                case 3:
                    System.out.println("Ingrese un numero impar y mayor a 7 ");
                    int num=leer.nextInt();
                    if(num%2==1&&num>7){
                    for (int i = 0; i < i; i++) {
                        
                    }
            } else{
                        System.out.println("Su numero no es impar o mayor que 7");
                    }
            
        System.out.println("***** M E N U *****");
        System.out.println("1. Sucesiones y más sucesiones!");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en casa!");
        System.out.println("4. Para salir");
        opcion= leer.nextInt();
    }//fin while
    }//
}
}