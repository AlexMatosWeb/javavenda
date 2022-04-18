import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orientaçao");
		produto1.setValor(BigDecimal.valueOf(100));

		Produto produto2 = new Produto();
		produto2.setNome("Spring");
		produto2.setId(300L);
		produto2.setValor(BigDecimal.valueOf(300));

		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda ");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Alex Sandro");
		venda.setValorTotal(BigDecimal.valueOf(197.00));

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);

		System.out.println("Descrição :" + venda.getDescricaoVenda() + "e o total: " + venda.totalVenda());
	}
}