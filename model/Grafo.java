package model;

import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Grafo {
	
	private ArrayList<Vertice> listaVertices = new ArrayList<Vertice>();
	private ArrayList<Aresta> arestas = new ArrayList<Aresta>();
	
	private Integer tipoGrafo;
	private Boolean isValorado;
	
	public void ehValorado() {
		Integer valor = Integer.parseInt(JOptionPane.showInputDialog("O grafo é valorado? \n 1-SIM   2-NÃO"));
		
			if(valor==1) {
				isValorado=true;
				
			}else{
				isValorado=false;
			}	
	}
	
	public void informaVertice() {
	Boolean sair = false;	
		
		while(sair!=true){
			String nomeVertice = JOptionPane.showInputDialog("Insira um nome para o vértice");
			
			Vertice ver = new Vertice();
			ver.setNome(nomeVertice);
			listaVertices.add(ver);
			
			if(Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir mais vértices? \n 1-SIM   2-NÃO"))==2)
				sair=true;
			
		}
	}
	
	public void informaAresta() {
	Boolean sair = false;
	
		for(Vertice ver: listaVertices) {
			
		}
		
		
	}
	
	
	
	
	
	
	public ArrayList<Vertice> getListaVertices() {
		return listaVertices;
	}
	public void setListaVertices(ArrayList<Vertice> listaVertices) {
		this.listaVertices = listaVertices;
	}
	public ArrayList<Aresta> getArestas() {
		return arestas;
	}
	public void setArestas(ArrayList<Aresta> arestas) {
		this.arestas = arestas;
	}
	public Integer getTipoGrafo() {
		return tipoGrafo;
	}
	public void setTipoGrafo(Integer tipoGrafo) {
		this.tipoGrafo = tipoGrafo;
	}
	public Boolean getIsValorado() {
		return isValorado;
	}
	public void setIsValorado(Boolean isValorado) {
		this.isValorado = isValorado;
	}
	
	
	
}