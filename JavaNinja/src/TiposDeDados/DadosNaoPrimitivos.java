package TiposDeDados;

/*
* Dados Não Primitivos: String, Array, Class, enum
* */

/*
* ALGUMAS DIFERENÇAS
*
* Dados Primitivos
*   - São tipos de dados que de maneira geral
* não recebem métodos de maneira padrão
*
* Dados Não Primitivos
*   - São tipos de dados em que é possível colocar
* métodos para fazer alterações na variável sem que
* seja mudado seu escopo
* */

public class DadosNaoPrimitivos {

    /*
    * Objective: Create a ninja and implement some methods
    * */

    public static void main(String[] args) {
        String name = "Naruto Uzumaki";
        System.out.println(name);
        // String.toUpperCase() converte os caracteres para CAIXA ALTA
        System.out.println(name.toUpperCase());
    }
}
