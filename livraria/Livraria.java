package livraria;
public class Livraria {
 
    public static void main(String[] args) {
        
    cliente cliente = new cliente();
        System.out.println("-=-=-=-=--=-=-=-=-");
        System.out.println("-=-=- TITULO -=-=-");
        System.out.println("-=-=-=-=--=-=-=-=-");
        System.out.println("Equipe: \nX \nY \nZ");
        System.out.println("-=-=-=-=--=-=-=-=-");
        cliente.cadastrarcliente("Renata", 123, 8899493, "Limoeiro");
        System.out.println("Cliente: " + cliente.nome + "\nCPF: " + cliente.CPF + "\nTelefone:  " + cliente.telefone + "\nEndereço: " + cliente.endereco);
        System.out.println("-=-=-=-=--=-=-=-=-");
    livros livros = new livros ();
        livros.CadastrarLivro ("Nicholas Sparks", "Romance", 2005, "A Garota do Lago", "Viva");
        System.out.println("Autor: " + livros.Autor + "\nGenero: " + livros.Genero + "\nLançamento:  " + livros.AnodeLancamento + "\nTitulo: " + livros.Titulo + "\nEditora: "  + livros.Editora); 
        System.out.println("-=-=-=-=--=-=-=-=-");
    Proprietario proprietario = new Proprietario();
        proprietario.cadastrarProprietario("Ryan", 123456, 545, 88995678, "Cedro");
        System.out.println("Nome proprietario: " + proprietario.nome + "\nRG: " + proprietario.RG + "\nCPF:  " + proprietario.CPF + "\nTelefone: "  + proprietario.telefone + "\nEndereço: " + proprietario.endereco);
        System.out.println("-=-=-=-=--=-=-=-=-");
    Funcionario funcionario = new Funcionario();
        funcionario.cadastrarfuncionario("Joyce", 675984, 678, 88789635, "Fortaleza", 287654);
        System.out.println("Funcionario: " + funcionario.nome + "\nRG: " + funcionario.RG + "\nCPF:  " + funcionario.CPF + "\nTelefone: " + funcionario.telefone + "\nEndereço: " + funcionario.endereco + "\nConta: " + funcionario.conta_bancaria);
        System.out.println("-=-=-=-=--=-=-=-=-");
        
    }
    
}