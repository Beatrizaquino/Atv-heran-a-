public class Principal {
    

    public static void mian(String args[]){
        Pessoa mae = new Pessoa("Beatoriz", null, null);
        Pessoa pai = new Pessoa("Guilhermus", null, null);
        Pessoa filhaA = new Pessoa("Evangeline", null, null);
        Pessoa filhoB = new Pessoa("Harry", null, null);

        filhaA.compare(filhoB);
    }
}
