package br.ce.wcaquino.servicos;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {


	@Test
	public void teste() {
		
		Usuario usuario = new Usuario();
		usuario.setNome("Nome");
		
		Filme filme = new Filme();
		filme.setEstoque(2);
		filme.setNome("A era do gelo");
		filme.setPrecoLocacao(7.50);
		
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacao = locacaoService.alugarFilme(usuario, filme);
		
		System.out.println(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		System.out.println(locacao.getValor()==7.50);
		System.out.println(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
		
		
	}
	
	@Test
	public void testeComAssert() {
		
		Usuario usuario = new Usuario();
		usuario.setNome("Nome");
		
		Filme filme = new Filme();
		filme.setEstoque(2);
		filme.setNome("A era do gelo");
		filme.setPrecoLocacao(7.50);
		
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacao = locacaoService.alugarFilme(usuario, filme);
		
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assert.assertTrue(locacao.getValor()==7.50);
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
		
		
	}
}