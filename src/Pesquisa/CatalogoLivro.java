package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
 private List<Livro> livroList;

 public CatalogoLivro() {
  this.livroList = new ArrayList<>();
 }

 public void adicionarLivro(String titulo, String autor, int anoPublicacao){
  livroList.add(new Livro(titulo, autor, anoPublicacao));
 }

 public List<Livro> pesquisarPorAutor(String autor){
  List<Livro> livrosAutor = new ArrayList<>();
  if (!livroList.isEmpty()) {
   for(Livro l : livroList){
    if (l.getAutor().equalsIgnoreCase(autor)) {
     livrosAutor.add(l);
    }
   }
  }
  return livrosAutor;
 }

 public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
  List<Livro> livroPorIntervaloAnos = new ArrayList<>();
  if (!livroList.isEmpty()){
   for(Livro l : livroList){
    if (l.getAnopublicacao() >= anoInicial && l.getAnopublicacao() <= anoFinal) {
     livroPorIntervaloAnos.add(l);
    }
   }
  }
  return livroPorIntervaloAnos;
 }

 public Livro pesquisarPorTitulo(String titulo){
  Livro livroPorTitulo = null;
  if (!livroList.isEmpty()) {
   for(Livro l: livroList){
    if(l.getTitulo().equalsIgnoreCase(titulo)){
     livroPorTitulo = l;
     break;
    }
   }
  }
  return livroPorTitulo;
 }

 public static void main(String[] args) {
  CatalogoLivro catalogoLivro = new CatalogoLivro();

  catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2020);
  catalogoLivro.adicionarLivro("Livro 2", "Autor 1", 2020);
  catalogoLivro.adicionarLivro("Livro 3", "Autor 2", 2022);
  catalogoLivro.adicionarLivro("Livro 4", "Autor 3", 2023);
  catalogoLivro.adicionarLivro("Livro 4", "Autor 4", 2024);
  catalogoLivro.adicionarLivro("Livro 6", "Autor 5", 1940);


  System.out.println(catalogoLivro.pesquisarPorAutor("Autor 1")); 

  System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2020, 2022));

  System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 1"));
 }

}
