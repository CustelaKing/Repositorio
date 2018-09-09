package model;

import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Grafo {
	
	private ArrayList<Vertice> listaVertices = new ArrayList<Vertice>();
	private ArrayList<Aresta> listaArestas = new ArrayList<Aresta>();
	
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
	
	public void cadastraVertice() {
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
	
	public void cadastraAresta() {
		
	Boolean sair = false;
		
		while(!sair){
			
			String verticesAresta = JOptionPane.showInputDialog("Informe o vértice de saída e o de chegada, respectivamente separados pela vírgula(,)");
			
			String[] vertice = verticesAresta.split(",");
			
			Vertice verticeSaida = new Vertice();
			Vertice verticeChegada = new Vertice();
			
			for(Vertice vert : listaVertices) {
				if(vert.getNome().equalsIgnoreCase(vertice[0])){
					verticeSaida = vert;
				}
				if(vert.getNome().equalsIgnoreCase(vertice[1])){
					verticeChegada =  vert;
				}
			}
			
			Aresta aresta = new Aresta();
			aresta.setVerticeSaida(verticeSaida);
			aresta.setVerticeChegada(verticeChegada);
			
			if(isValorado){
				aresta.setValor(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da aresta?" )));
			}
			
			listaArestas.add(aresta);
			
			if(Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir mais Arestas? \n 1-SIM   2-NÃO"))==2)
				sair=true;
		}
		
	}
	
	
	public ArrayList<Vertice> getListaVertices() {
		return listaVertices;
	}
	public void setListaVertices(ArrayList<Vertice> listaVertices) {
		this.listaVertices = listaVertices;
	}
	
	public ArrayList<Aresta> getListaArestas() {
		return listaArestas;
	}

	public void setListaArestas(ArrayList<Aresta> listaArestas) {
		this.listaArestas = listaArestas;
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