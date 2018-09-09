package account.legacy.com.AccountLegacy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import account.legacy.data.*;

@Controller
@RestController
public class AccountController {
   
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping("/v1/account/summary")
    public List<Summary> summary() throws IOException {
		ContaLegado contaLegado = null;          // Objeto utilizado para recuperar os dados do sistema legado...
		Reader reader = null;                    // Handle do arquivo de dados legado...
		Gson gson = new Gson();                  // Instância do objeto manipulador de dados JSON...
		List<Summary> retorno = new ArrayList<Summary>(); //Objeto de retorno da ação...

		try {
			reader = new FileReader("lancamento-conta-legado.json"); 
			contaLegado = gson.fromJson(reader, ContaLegado.class);
			
			for (ControleLancamento item : contaLegado.getListaControleLancamento()) {
				retorno.add(new Summary(util.ConvertStringToDate(item.getDataLancamentoContaCorrenteCliente()),
						                item.getLancamentoContaCorrenteCliente().getNomeTipoOperacao(),
						                item.getNumeroEvento(),
						                item.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa(),
						                util.ConvertStringToDate(item.getDataEfetivaLancamento()),
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