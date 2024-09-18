package SetInterface.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
 private Set<Convidado> convidadosSet;

 public ConjuntoConvidado() {
  this.convidadosSet = new HashSet<>();
 }

 public void adicionarConvidado(String nome, int codigoConvite) {
  convidadosSet.add(new Convidado(nome, codigoConvite));
 }

 public void removerConvidadoPorCodigoConvite(int codigoConvite) {
  if (!convidadosSet.isEmpty()) {
   Convidado convidadoParaRemover = null;

   for (Convidado c : convidadosSet) {
    if (c.getCodigoConvite() == codigoConvite) {
     convidadoParaRemover = c;
     break;
    }
   }
   convidadosSet.remove(convidadoParaRemover);
  }
 }

 public int contarConvidados(){
  return convidadosSet.size();
 }

 public void exibirConvidados(){
  System.out.println(convidadosSet);
 }

 public static void main(String[] args) {
  ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

  System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro de set convidados");

  conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
  conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
  conjuntoConvidado.adicionarConvidado("Convidado 3", 1237);
  conjuntoConvidado.adicionarConvidado("Convidado 4", 1239);

  System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro de set convidados");

  conjuntoConvidado.removerConvidadoPorCodigoConvite(1234);
  System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro de set convidados");
  conjuntoConvidado.exibirConvidados();
 }
}
