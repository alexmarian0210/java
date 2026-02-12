public class listaTelefonica {
        public static void main(String[] args) {
            String[] nomes = {"Alex", "Maria", "João", "Ana"};
            String[] telefones = {"1234-5678", "9876-5432", "5555-5555", "1111-1111"};

            for (int i = 0; i < nomes.length; i++) {
                System.out.println("Nome: " + nomes[i] + ", Telefone: " + telefones[i]);
            }
        }

}
