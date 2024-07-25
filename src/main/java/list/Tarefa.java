package main.java.list;

public class Tarefa {
    //Atributo
    private  String desricao;

    public Tarefa(String desricao) {
        this.desricao = desricao ;
    }

    public String getDesricao() {
        return desricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "desricao='" + desricao + '\'' +
                '}';
    }
}
