package br.com.poo.projeto04;

import java.util.ArrayList;


public class Bd {
    private static ArrayList<Cliente> clientesList = new ArrayList<>();
    private static ArrayList<Fornecedor> fornecedoresList = new ArrayList<>();

    public static ArrayList<Fornecedor> getFornecedoresList() {
            if (fornecedoresList == null) {
                fornecedoresList = new ArrayList<>();  Fornecedor forn1 =  new Fornecedor();   
                forn1.setNome("Scv Locadora");
                forn1.setRazaoSocial("Irmãos Martins");
                forn1.setCnpj("17.631.134/0001-03");
                forn1.setTelefone("(11)3673-7403");
                forn1.setEmail("scv@scvlocadora.com.br");
                forn1.setEndereco("Rua Caiubi, 946 - Perdizes, São Paulo");
                fornecedoresList.add(forn1);
            }   return fornecedoresList;
    }
    
    public void alterarFornecedor(String escolha, int i, String alterado) {
        escolha.toLowerCase();
        if (escolha == "nome") {
            fornecedoresList.get(i).setNome(alterado);
        } else if (escolha == "razaoSocial") {
            fornecedoresList.get(i).setRazaoSocial(alterado);
        } else if (escolha == "cnpj") {
            fornecedoresList.get(i).setCnpj(alterado);
        } else if (escolha == "telefone") {
            fornecedoresList.get(i).setTelefone(alterado);
        } else if (escolha == "email") {
            fornecedoresList.get(i).setEmail(alterado);
        } else if (escolha == "endereco") {
            fornecedoresList.get(i).setEndereco(alterado);
        }

    }
    
    
    

    public static ArrayList<Cliente> getClientesList() {
        return clientesList;
    }
    
 
}
