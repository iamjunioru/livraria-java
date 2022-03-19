package livraria;
public class Funcionario {
String nome;
int RG;
int CPF;
int telefone;
String endereco;
int conta_bancaria;

public void cadastrarfuncionario(String nnome,int nRG,int nCPF,int ntelefone,String
nendereco,int nconta_bancaria)
{
nome = nnome;
RG = nRG;
CPF = nCPF;
telefone = ntelefone;
endereco = nendereco;
conta_bancaria = nconta_bancaria;
}
}