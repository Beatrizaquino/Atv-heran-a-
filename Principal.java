public class Principal {
    

    public static void mian(String args[]){
        Pessoa mae = new Pessoa("Beatoriz", null, null);
        Pessoa pai = new Pessoa("Guilhermus", null, null);
        Pessoa filhaA = new Pessoa("Evangeline", mae, pai);
        Pessoa filhoB = new Pessoa("Harry", mae, pai);

        System.out.println(filhaA.compara(filhoB));
    }
}
