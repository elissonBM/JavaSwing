package view;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * Classe para demonstrar a utilzação de janela (JFrame) e botão (JButton)
 * @author Elisson Barbieri Machado
 * @since 1 de mar. de 2021
 */


public class Exemplo01 {

	//método para exibir uma janela swing com o componente botão
	public void iniciaGui() {//inicio do método
		//criando o componente JFrame = e adicionando o titulo
		JFrame janela = new JFrame("exemplo tela e botão");
	
		//criando o componente jbutton e adicionando titulo 
		JButton botao = new JButton("EXEMPLO DE BOTÃO");
	
		//CONFIGURANO o tamanho da janela
		//primeiro parametro - largura
		//segundo parametro - altura
		janela.setSize(500, 300);
		
		//adicionando o botão no objeto janela (no content pane)
		janela.getContentPane().add(botao);
		
		//configurando a visibilidade da tela
		janela.setVisible(true);
	
		//informando que a tela nao tem layout pré-definido
	
	}//fim do método

	
	public static void main(String[] args) {
		new Exemplo01().iniciaGui();
	}
	
	
	
	
}//fim da classe
