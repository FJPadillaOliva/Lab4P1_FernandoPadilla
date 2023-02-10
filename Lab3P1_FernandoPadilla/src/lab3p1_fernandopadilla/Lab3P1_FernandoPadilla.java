
package lab3p1_fernandopadilla;

import java.util.Scanner;

public class Lab3P1_FernandoPadilla {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        char resp = 's';
        
        while (resp == 's' || resp == 'S'){
            System.out.println("1.Substitute");
            System.out.println("2.Palindromas");
            System.out.println("3.Contenida o no");
            System.out.println("4.Salida");
            int opcion = read.nextInt();
            
            switch (opcion){
                case 1:
                    String str;
                    String str2;
                    String replace;
                    System.out.println("Ingrese primera cadena(%d):");
                    read.next();
                    str = read.nextLine();
                    System.out.println("Ingrese segunda cadena: ");
                    read.next();
                    str2 = read.nextLine();
                    replace = str.substring(0,str.indexOf("%d")) + str2;
                    System.out.println(replace);
                    break;
                case 2:
                    String word;
                    int c1=0;
                    char letra,letra2;
                    System.out.println("Ingrese una palabra: ");
                    word = read.next().toLowerCase();
                    for (int i = 0; i < word.length();i++){
                        letra = word.charAt(i);
                        for (int j =  word.length()-1; j >=0; j--) {
                            letra2 = word.charAt(j);
                            if (letra == letra2){
                                c1++;
                                break;
                            }
                        }
                        //r a d a r
                        //r a d a r
                    }
                           if (c1==word.length()){
                                System.out.println("La palabra es Palindroma");
                            }else{
                                System.out.println("La palabra no es Palindroma");
                            }
                    break;
                case 3:
                    String strl;
                    String strc;
                    int confirm;
                    System.out.println("Ingrese cadena larga:");
                    read.next();
                    strl = read.nextLine();
                    System.out.println("Ingrese cadena corta: ");
                    strc = read.next();
                    confirm = strl.indexOf(strc);
                    if (confirm !=-1){
                        System.out.println("La cadena corta esta contenida en la cadena larga ");
                    }else{
                        System.out.println("La cadena corta no esta contenida en la cadena larga ");
                    }
                    break;
                case 4:
                    resp = 'n';
                    break;
                default:
                    System.out.println("Opcion no valida");
            }//fin switch
        }//fin while
    }//fin public static void
    
}//fin public class