
package boletin17_2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Dam {
    private int [] notas= new int [4];
    private String [] nomes= new String [4];
    
    

    public String pedirNome(){
        String nome = JOptionPane.showInputDialog("Introducir nome do alumno");
        return nome;
    }
    
   
    public void cargarArray(){
        for(int f=0; f<notas.length-1;f++){
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
        for(int f=0;f<notas.length-1;f++)
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
        
        String auxNome = JOptionPane.showInputDialog("Introducir nome a buscar");
        boolean atopado = false;
        
        for (int i=0; i<notas.length; i++){
            
            if(auxNome.equals(nomes[i])){
                System.out.println("A nota do alumno : " + nomes[i] + " é " + notas[i]);
                atopado = true;
            }  
                    
        
    }
            if(atopado==false){
                System.out.println("O alumno introducido non está na lista");
                
            }
 
}
    public void ordenarNotasCrecente(){
        
        for(int i=0;i<(notas.length-1);i++){
            for(int j=i+1;j<notas.length;j++){
                
		if(notas[i]>notas[j]){
					
		int variableauxiliar=notas[i];
	        notas[i]=notas[j];
	        notas[j]=variableauxiliar;
            }
        }
        }
    }
   
    
}


