package List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
 private List<Tarefa> tarefaList;

 public ListaTarefa() {
  this.tarefaList = new ArrayList<>();
 }

 public void adcionarTarefa(String descricao) {
  tarefaList.add(new Tarefa(descricao));
 }

 public void removerTarefa(String descricao) {
  List<Tarefa> tarefaRemover = new ArrayList<>();

  for (Tarefa t : tarefaList) {
   if (t.getDescricao().equalsIgnoreCase(descricao)) {
    tarefaRemover.add(t);
   }
  }
  tarefaList.removeAll(tarefaRemover);
 }

 public int obterNumerosTarefas(){
  return tarefaList.size();
 }

 public void obterDescricaoTarefas(){
  System.out.println(tarefaList);
 }

 public static void main(String[] args) {
  ListaTarefa listaTarefa = new ListaTarefa();
  System.out.println("O número total de elementos é " + listaTarefa.obterNumerosTarefas());

  listaTarefa.adcionarTarefa("Tarefa 1");
  System.out.println("O número total de elementos é " + listaTarefa.obterNumerosTarefas());
  listaTarefa.adcionarTarefa("Tarefa 1");
  System.out.println("O número total de elementos é " + listaTarefa.obterNumerosTarefas());

  listaTarefa.adcionarTarefa("Tarefa 2");
  System.out.println("O número total de elementos é " + listaTarefa.obterNumerosTarefas());

  listaTarefa.removerTarefa("Tarefa 2");
  System.out.println("O número total de elementos é " + listaTarefa.obterNumerosTarefas());

  listaTarefa.obterDescricaoTarefas();
 }
}
