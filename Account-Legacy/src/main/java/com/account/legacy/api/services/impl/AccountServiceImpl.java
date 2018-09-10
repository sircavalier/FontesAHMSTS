package com.account.legacy.api.services.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.account.legacy.api.util;
import com.account.legacy.api.documents.ContaLegado;
import com.account.legacy.api.documents.ControleLancamento;
import com.account.legacy.api.documents.Summary;
import com.account.legacy.api.services.AccountService;
import com.google.gson.Gson;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public List<Summary> getAll() throws IOException {
		ContaLegado contaLegado = null;          // Objeto utilizado para recuperar os dados do sistema legado...
		Reader reader = null;                    // Handle do arquivo de dados legado...
		Gson gson = new Gson();                  // Instância do objeto manipulador de dados JSON...
		List<Summary> retorno = new ArrayList<Summary>(); //Objeto de retorno da ação...

		try {
			reader = new FileReader("lancamento-conta-legado.json"); 
			contaLegado = gson.fromJson(reader, ContaLegado.class);
			
			for (ControleLancamento item : contaLegado.getListaControleLancamento()) {
				retorno.add(new Summary(util.convertStringToDate(item.getDataLancamentoContaCorrenteCliente()),
						                item.getLancamentoContaCorrenteCliente().getNomeTipoOperacao(),
						                item.getNumeroEvento(),
						                item.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa(),
						                util.convertStringToDate(item.getDataEfetivaLancamento()),
						                item.getNomeBanco(),
						                Integer.toString(item.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia()),
						                item.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente(),
						                item.getValorLancamentoRemessa()));
				
			}
		}
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		catch (Exception e) {
            e.printStackTrace();
        }
		finally {
			if (reader != null) {
				reader.close();
			}
		}
		
		return retorno;
    }
}
