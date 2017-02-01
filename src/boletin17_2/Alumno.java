/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;

/**
 *
 * @author Ara
 */
public class Alumno implements Comparable{
    int notas;
    String nome;

    public Alumno() {
    }

    public Alumno(int notas, String nome) {
        this.notas = notas;
        this.nome = nome;
    }

    public int getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Alumno{" + "notas=" + notas + ", nome=" + nome + '}';
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
