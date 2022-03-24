package br.com.contmatic.test.model;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static br.com.contmatic.test.model.FabricaObjetos.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.StringContains.containsString;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.contmatic.model.empresa.Empresa;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpresaTest {

	@BeforeClass
	public static void pre_teste(){
		construirObjetos();
	}

	@Test
	public void test_01_validar_instancia_com_contrutor_obrigatorio_da_classe_empresa(){
		assertEquals(CNPJ, EMPRESA_ATRIBUTOS_OBRIGATORIOS.getCnpj());
	}

	@Test
	public void test_02_validar_instancia_com_construtor_completo_da_classe_empressa(){
		assertEquals(CNPJ, EMPRESA_TODOS_ATRIBUTOS.getCnpj());
		assertEquals(RAZAO_SOCIAL, EMPRESA_TODOS_ATRIBUTOS.getRazaoSocial());
		assertEquals(NOME_FANTASIA, EMPRESA_TODOS_ATRIBUTOS.getNomeFantasia());
		assertEquals(AREA_ATUACAO, EMPRESA_TODOS_ATRIBUTOS.getAreaAtuacao());
		assertEquals(EMAILS, EMPRESA_TODOS_ATRIBUTOS.getEmails());
		assertEquals(TELEFONES, EMPRESA_TODOS_ATRIBUTOS.getTelefones());
		assertEquals(ENDERECOS, EMPRESA_TODOS_ATRIBUTOS.getEnderecos());
		assertEquals(FUNCIONARIOS, EMPRESA_TODOS_ATRIBUTOS.getFuncionarios());
		assertEquals(PRODUTOS, EMPRESA_TODOS_ATRIBUTOS.getProdutos());
		assertEquals(CARGOS, EMPRESA_TODOS_ATRIBUTOS.getCargos());
		assertEquals(AMBIENTES_DE_TRABALHO, EMPRESA_TODOS_ATRIBUTOS.getAmbientesTrabalho());
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_03_validar_cnpj_nulo(){
		EMPRESA_TODOS_ATRIBUTOS.setCnpj(NULO);
	}

	@Test(expected = IllegalStateException.class)
	public void test_04_validar_cnpj_invalido(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setCnpj(CNPJ_INVALIDO);
	}

	@Test(expected = IllegalStateException.class)
	public void test_05_validar_cnpj_com_numeros_repetidos(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setCnpj(CNPJ_NUMEROS_REPETIDOS);
	}

	@Test(expected = IllegalStateException.class)
	public void test_06_validar_cnpj_com_apenas_espacos(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setCnpj(SOMENTE_ESPACOS);
	}

	@Test(expected = IllegalStateException.class)
	public void test_07_validar_cnpj_com_tamanho_diferente_do_padrao(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setCnpj(CNPJ_COM_QUATIDADE_DIGITOS_DIFERENTE);
	}

	@Test(expected = IllegalStateException.class)
	public void test_08_validar_cnpj_sem_nenhum_char(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setCnpj(VAZIO);
	}

	@Test(expected = IllegalStateException.class)
	public void test_09_validar_cnpj_com_letra(){
		EMPRESA_TODOS_ATRIBUTOS.setCnpj(CNPJ_COM_LETRA);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_11_validar_razao_social_nulo(){
		EMPRESA_TODOS_ATRIBUTOS.setRazaoSocial(NULO);
	}

	@Test(expected = IllegalStateException.class)
	public void test_12_validar_razao_social_maior_que_permitido(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setRazaoSocial(TEXTO_COM_71_CHARS);
	}

	@Test(expected = IllegalStateException.class)
	public void test_13_validar_razao_sozial_menor_que_permitido(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setRazaoSocial(TEXTO_COM_1_CHAR);
	}

	@Test(expected = IllegalStateException.class)
	public void test_14_validar_razao_social_com_apenas_espacos(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setRazaoSocial(SOMENTE_ESPACOS);
	}

	@Test(expected = IllegalStateException.class)
	public void test_15_validar_razao_social_sem_nenhum_char(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setRazaoSocial(VAZIO);
	}

	@Test(expected = IllegalStateException.class)
	public void test_16_validar_razao_social_com_char_nao_alfanumerico(){
		EMPRESA_TODOS_ATRIBUTOS.setRazaoSocial(TEXTO_COM_CHAR_NAO_ALFANUMERICO);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_18_validar_nome_fantasia_nulo(){
		EMPRESA_TODOS_ATRIBUTOS.setNomeFantasia(NULO);
	}

	@Test(expected = IllegalStateException.class)
	public void test_19_validar_nome_fantasia_maior_que_permitido(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setNomeFantasia(TEXTO_COM_71_CHARS);
	}

	@Test(expected = IllegalStateException.class)
	public void test_20_validar_nome_fantasia_menor_que_permitido(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setNomeFantasia(TEXTO_COM_1_CHAR);
	}

	@Test(expected = IllegalStateException.class)
	public void test_21_validar_nome_fantasia_com_apenas_espacos(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setNomeFantasia(SOMENTE_ESPACOS);
	}

	@Test(expected = IllegalStateException.class)
	public void test_22_validar_nome_fantasia_sem_nenhum_char(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setNomeFantasia(VAZIO);
	}

	@Test(expected = IllegalStateException.class)
	public void test_23_validar_nome_fantasia_com_char_nao_alfanumerico(){
		EMPRESA_TODOS_ATRIBUTOS.setNomeFantasia(TEXTO_COM_CHAR_NAO_ALFANUMERICO);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_25_validar_area_atuacao_nulo(){
		EMPRESA_TODOS_ATRIBUTOS.setAreaAtuacao(NULO);
	}

	@Test(expected = IllegalStateException.class)
	public void test_26_validar_area_atuacao_maior_que_permitido(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setAreaAtuacao(TEXTO_COM_71_CHARS);
	}

	@Test(expected = IllegalStateException.class)
	public void test_27_validar_area_atuacao_menor_que_permitido(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setAreaAtuacao(TEXTO_COM_1_CHAR);
	}

	@Test(expected = IllegalStateException.class)
	public void test_28_validar_area_atuacao_com_apenas_espacos(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setAreaAtuacao(SOMENTE_ESPACOS);
	}

	@Test(expected = IllegalStateException.class)
	public void test_29_validar_area_atuacao_sem_nenhum_char(){
		EMPRESA_ATRIBUTOS_OBRIGATORIOS.setAreaAtuacao(VAZIO);
	}

	@Test(expected = IllegalStateException.class)
	public void test_30_validar_area_atuacao_com_char_nao_alfanumerico(){
		EMPRESA_TODOS_ATRIBUTOS.setAreaAtuacao(TEXTO_COM_CHAR_NAO_ALFANUMERICO);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_32_validar_emails_lista_nula(){
		EMPRESA_TODOS_ATRIBUTOS.setEmails(null);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_33_validar_emails_lista_vazia() {
		EMPRESA_TODOS_ATRIBUTOS.setEmails(LISTA_VAZIA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_34_validar_emails_limite_maximo_de_elementos() {
		EMPRESA_TODOS_ATRIBUTOS.setEmails(LISTA_EMAILS_ACIMA_LIMITE);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_35_validar_telefones_lista_nula(){
		EMPRESA_TODOS_ATRIBUTOS.setTelefones(null);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_36_validar_telefones_lista_vazia() {
		EMPRESA_TODOS_ATRIBUTOS.setTelefones(LISTA_VAZIA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_37_validar_telefones_limite_maximo_de_elementos() {
		EMPRESA_TODOS_ATRIBUTOS.setTelefones(LISTA_TELEFONES_ACIMA_DO_LIMITE);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_38_validar_enderecos_lista_nula(){
		EMPRESA_TODOS_ATRIBUTOS.setEnderecos(LISTA_NULA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_39_validar_enderecos_lista_vazia() {
		EMPRESA_TODOS_ATRIBUTOS.setEnderecos(LISTA_VAZIA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_40_validar_enderecos_limite_maximo_de_elementos() {
		EMPRESA_TODOS_ATRIBUTOS.setEnderecos(LISTA_ENDERECOS_ACIMA_LIMITE);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_41_validar_funcionarios_lista_nula(){
		EMPRESA_TODOS_ATRIBUTOS.setFuncionarios(LISTA_NULA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_42_validar_funcionarios_lista_vazia() {
		EMPRESA_TODOS_ATRIBUTOS.setFuncionarios(LISTA_VAZIA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_43_validar_funcionarios_limite_maximo_de_elementos() {
		EMPRESA_TODOS_ATRIBUTOS.setFuncionarios(LISTA_FUNCINARIOS_ACIMA_LIMITE);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_44_validar_produtos_lista_nula(){
		EMPRESA_TODOS_ATRIBUTOS.setProdutos(LISTA_NULA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_45_validar_produtos_lista_vazia() {
		EMPRESA_TODOS_ATRIBUTOS.setProdutos(LISTA_VAZIA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_46_validar_produtos_limite_maximo_de_elementos() {
		EMPRESA_TODOS_ATRIBUTOS.setProdutos(LISTA_PRODUTOS_ACIMA_LIMITE);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_47_validar_cargos_lista_nula(){
		EMPRESA_TODOS_ATRIBUTOS.setCargos(LISTA_NULA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_48_validar_cargos_lista_vazia() {
		EMPRESA_TODOS_ATRIBUTOS.setCargos(LISTA_VAZIA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_49_validar_cargos_limite_maximo_de_elementos() {
		EMPRESA_TODOS_ATRIBUTOS.setCargos(LISTA_CARGOS_ACIMA_LIMITE);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_50_validar_ambientes_de_trabalho_lista_nula(){
		EMPRESA_TODOS_ATRIBUTOS.setAmbientesTrabalho(LISTA_NULA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_51_validar_ambientes_de_trabalho_lista_vazia() {
		EMPRESA_TODOS_ATRIBUTOS.setAmbientesTrabalho(LISTA_VAZIA);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test_52_validar_ambientes_de_trabalho_limite_maximo_de_elementos() {
		EMPRESA_TODOS_ATRIBUTOS.setAmbientesTrabalho(LISTA_AMBIENTES_ACIMA_LIMITE);
	}
	
	@Test
	public void test_53_validar_metodo_hashCode_de_empresa() {
		assertThat(EMPRESA_TODOS_ATRIBUTOS.hashCode(), equalTo(EMPRESA_ATRIBUTOS_OBRIGATORIOS.hashCode()));
	}
	
	@Test
	public void test_54_validar_metodo_equals_de_empresa_com_empresa() {
		assertTrue(EMPRESA_ATRIBUTOS_OBRIGATORIOS.equals(EMPRESA_TODOS_ATRIBUTOS));
	}
	
	@Test
	public void test_55_validar_metodo_equals_de_empresa_com_objeto_de_classe_diferente() {
		assertFalse(EMPRESA_TODOS_ATRIBUTOS.equals(new Object()));
	}
	
	@Test
	public void test_56_validar_metodo_equals_de_empresa_com_nulo() {
		assertFalse(EMPRESA_TODOS_ATRIBUTOS.equals(null));
	}

	@Test
	public void test_57_validar_metodo_equals_de_empresa_com_outro_objeto_da_mesma_classe() {
		assertTrue(EMPRESA_TODOS_ATRIBUTOS.equals(EMPRESA_TODOS_ATRIBUTOS));
	}
	
	@Test
	public void test_58_validar_metodo_tostring_de_empresa() {
		assertThat(
			EMPRESA_TODOS_ATRIBUTOS.toString(), 
			allOf(
				containsString(CNPJ),
				containsString(RAZAO_SOCIAL),
				containsString(NOME_FANTASIA),
				containsString(AREA_ATUACAO),
				containsString(EMAILS.toString()),
				containsString(TELEFONES.toString()),
				containsString(ENDERECOS.toString()),
				containsString(FUNCIONARIOS.toString()),
				containsString(PRODUTOS.toString()),
				containsString(CARGOS.toString()),
				containsString(AMBIENTES_DE_TRABALHO.toString())
			)
		);
	}

}

