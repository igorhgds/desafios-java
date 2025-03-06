public class Principal {
    public static void main(String[] args) {

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("06620020");
        System.out.println(novoEndereco);
    }
}
