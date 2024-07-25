package main.java.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicinarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDesricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numéro total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicinarTarefa("Tarefa 1");
        listaTarefa.adicinarTarefa("Tarefa 1");
        listaTarefa.adicinarTarefa("Tarefa 2");
        System.out.println("O numéro total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O numéro total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricaoTarefas();

    }
}
