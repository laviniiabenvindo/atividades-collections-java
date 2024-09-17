package Carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
 private List<Item> carrinho;

 public CarrinhoDeCompras() {
  this.carrinho = new ArrayList<>();
 }

 public void addItem(String nome, double preco, int quantidade) {
  Item item = new Item(nome, preco, quantidade);
  this.carrinho.add(item);
 }

 public void removerItem(String nome) {
  List<Item> itemRemover = new ArrayList<>();

  if (!carrinho.isEmpty()) {
   for (Item i : carrinho) {
    if (i.getNome().equalsIgnoreCase(nome)) {
     itemRemover.add(i);
    }
   }
   carrinho.removeAll(itemRemover);
  } else {
   System.out.println("Carrinho vazio!");
  }
 }

 public void exibirItems() {
  System.out.println(this.carrinho);
 }

 public double calcularValorTotal() {
  double valorTotal = 0;
  for (Item item : carrinho) {
   double valorItem = item.getPreco() * item.getQuantidade();
   valorTotal += valorItem;

  }
  return valorTotal;
 }

 @Override
 public String toString() {
  return "CarrinhoDeCompras{" +
    "itens = " + carrinho +
    '}';
 }

 public static void main(String[] args) {
  // Criando uma instância do carrinho de compras
  CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

  // Adicionando itens ao carrinho
  carrinhoDeCompras.addItem("Lápis", 2d, 3);
  carrinhoDeCompras.addItem("Lápis", 2d, 3);
  carrinhoDeCompras.addItem("Caderno", 35d, 1);
  carrinhoDeCompras.addItem("Borracha", 2d, 2);

  // Exibindo os itens no carrinho
  carrinhoDeCompras.exibirItems();

  // // Removendo um item do carrinho
  carrinhoDeCompras.removerItem("Lápis");

  // // Exibindo os itens atualizados no carrinho
  carrinhoDeCompras.exibirItems();

  // // Calculando e exibindo o valor total da compra
  System.out.println("O valor total da compra é = " +
  carrinhoDeCompras.calcularValorTotal());
 }
}
