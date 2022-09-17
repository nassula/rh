package br.com.nass.service.reajuste;

import java.math.BigDecimal;

import br.com.nass.modelo.Funcionario;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);

}
