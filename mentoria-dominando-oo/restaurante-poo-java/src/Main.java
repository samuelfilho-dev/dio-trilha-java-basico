public class Main {
    public static void main(String[] args) {

        // Criação do Objeto Endereço
        Endereco enderecoRestauranteSamu = new Endereco();
        Endereco enderecoRestauranteSamu2 = new Endereco("68515-000","Rua Da Santa Sé");
        Endereco enderecoRestauranteFulana = new Endereco("68500-005","Rua Dos Alegres");

        // Criação do Objeto Restaurante — Restaurante do Samu
        Restaurante restaurante = new Restaurante();

        // Inserimento de Dados do Restaurante — Restaurante do Samu
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Restaurante do Samu");
        restaurante.setCnpj("00.000.000/0001-11");
        restaurante.setEndereco(enderecoRestauranteSamu2);

        // Impressão do Objeto Restaurante — Restaurante do Samu
        System.out.println(restaurante);

        // Criação do Objeto Restaurante — Restaurante da Fulana
        Restaurante restaurante2 = new Restaurante();

        // Inserimento de Dados do Restaurante — Restaurante da Fulana
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Restaurante Da Fulana");
        restaurante2.setCnpj("00.000.000/0002-22");
        restaurante2.setEndereco(enderecoRestauranteFulana);

        // Impressão do Objeto Restaurante — Restaurante da Fulana
        System.out.println(restaurante2);
    }
}