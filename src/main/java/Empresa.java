import java.util.ArrayList;
import java.util.stream.Collectors;

public class Empresa implements Cloneable {

    private String nome;
    private ArrayList<Vaga> vagas;

    public Empresa(String nome, ArrayList<Vaga> vagas){
        this.nome = nome;
        this.vagas = vagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(ArrayList<Vaga> vagas) {
        this.vagas = vagas;
    }

    @Override
    public Empresa clone() throws CloneNotSupportedException {
        Empresa empresaClone = (Empresa) super.clone();
        return empresaClone;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome=" + nome +
                ", vagas='" + vagas.stream().map(vaga -> vaga.getTitulo()).collect(Collectors.joining(", ")) + '\'' +
                '}';
    }

}
