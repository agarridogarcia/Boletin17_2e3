
package boletin17_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Dam {
    private int [] notas={4,6,8,9};
    private String [] nomes= {"Pepe","Ana","Juan","Luis"};
    

    
    
    
    

    public String pedirNome(){
        String nome = JOptionPane.showInputDialog("Introducir nome do alumno");
        return nome;
    }
    
   
    public void cargarArray(){
        for(int f=0; f<notas.length;f++){
            notas[f]=pedirNotas();
            nomes[f] = pedirNome();
        }
    }
    public int pedirNotas(){
        int notas1=Integer.parseInt(JOptionPane.showInputDialog("Introduce nota: "));
        if(notas1>=1 && notas1<=10)
            return notas1;
        else{
            
            return Integer.parseInt(JOptionPane.showInputDialog("Valor non válido, introduce outra nota: "));
        }
    }    

    public void visualizar(){
        for(int f=0;f<notas.length;f++)
            System.out.println(notas[f]);
    }
    
    public void suspensoAprobado(){
        int suspensos=0;
        for(int f=0;f<notas.length;f++)
        if (notas[f]<5)
            suspensos ++;    
        System.out.println("Número de aprobados : " + (notas.length-suspensos) + " suspensos: " + suspensos);
        
    }
    public void notaAlta(){
        int alta=0; 
        for (int f=0;f<notas.length;f++) {
        if(notas[f]>=alta) 
        alta=notas[f]; 
        }
        System.out.println(" A nota máis alta é: "+alta); 
    }   
    
    public void notaMedia(){
        float media=0;
        for(int f=0;f<notas.length;f++){
        media=media+notas[f];
        }
         System.out.println("Media de todos os alumnos: " + media/notas.length);
    
    }
    public void alumnosAprobados(){
        
        for (int i=0; i<notas.length; i++){
            
            if(notas[i]>=5){
                
                System.out.println("O alumno " + nomes[i] + " con nota " + notas[i] + " está aprobado");
            }
            else
                System.out.println("O alumno " + nomes[i] + " con nota " + notas[i] + " está suspenso");
            
        }
        
    }
    public void visualizarAlumno(){
        String nome=JOptionPane.showInputDialog("Introduce nome do alumno");
        
        boolean nomel=false;
        for(int i=0;i<nomes.length;i++){
            
        
            if(nome.equals(nomes[i])){
                System.out.println("O alumno está na lista");
                nomel=true;
            }
            
       
        }
        if(nomel=false)
        System.out.println("Non está na lista");
         
        }
        
    public void ordenar(){
        int aux;
        String auxNome;
        for(int i=0;i<notas.length-1;i++)
            for(int j=i+1;j<notas.length;j++)
                if(notas[i]>notas[j]){
                    aux=notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
                    auxNome=nomes[i];
                    nomes[i]=nomes[j];
                    nomes[j]=auxNome;
                }
       
                }   
    public void visualizarOrdenar(){
        for(int i=0;i<notas.length;i++)
            System.out.println("Nombre: " + nomes[i]+ " Nota: " + notas[i]);
    }
        
}



     


