package me.dio.padrao.projeto.facade;

import me.dio.padrao.projeto.facade.subsistema1.crm.CrmService;
import me.dio.padrao.projeto.facade.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);

    }

}
