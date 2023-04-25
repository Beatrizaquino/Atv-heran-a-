

public class Pessoa{

    public String nome;
    public Pessoa mae;
    public Pessoa pai;

    public Pessoa(String string, Object object, Object object2) {
    }

    public void metodoConstrutor( String nome, Pessoa mae, Pessoa pai){
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    } 

}