public record Endereco(String cep, String logradouro, String complemento,
                       String localidade, String uf) {

    @Override
    public String toString() {
        return "Endereco{" +
                "cep = '" + cep + '\'' +
                ", logradouro  = ' " + logradouro + '\'' +
                ", complemento = '" + complemento + '\'' +
                ", localidade = '" + localidade + '\'' +
                ", uf = '" + uf +
                '}';
    }
}
