package snippet;

public class Snippet {
	O que acontece com cada item do menu:
	Incluir Produção: permite o registro de um período de produção. Não permitir duplicação do código de produção, ou seja, se o código 10 já existir e o usuário tentar inserir uma nova produção com o código 10, o sistema deverá avisar que o código já existe e a produção não poderá ser incluída.
	Consultar: permite fazer consultas: pela data e pelo cultivar. A consulta por data exibe a quantidade de fardos produzidos naquele dia, indicando o tipo de feno (A, B ou C) e cultivar, no seguinte formato: “<data>: <cultivar> - <tipoDeFeno> - <qtDeFardos>”. Já a consulta por cultivar exibe o resultado no seguinte formato: <cultivar>: <tipoDeFeno> - <soma da quantidade de fardos>. Caso houver mais de um tipoDeFeno, exibir cada um em uma nova linha. Mostrar uma mensagem ao usuário caso não haja registros com a chave de busca utilizada.
	Alterar: permite alterar qualquer campo do registro de produção. A busca do registro para alteração deve ser realizada por código.
	Excluir: permite excluir um registro de produção. A implementação é similar ao da opção Alterar, exceto que o registro é excluído da lista.
	Listar todos: lista todos os registros de produção do programa.
	Sair: finaliza o programa.
	
	
}

