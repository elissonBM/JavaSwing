package view;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * Classe para demonstrar a utilza��o de janela (JFrame) e bot�o (JButton)
 * @author Elisson Barbieri Machado
 * @since 1 de mar. de 2021
 */


public class Exemplo01 {

	//m�todo para exibir uma janela swing com o componente bot�o
	public void iniciaGui() {//inicio do m�todo
		//criando o componente JFrame = e adicionando o titulo
		JFrame janela = new JFrame("exemplo tela e bot�o");
	
		//criando o componente jbutton e adicionando titulo 
		JButton botao = new JButton("EXEMPLO DE BOT�O");
	
		//CONFIGURANO o tamanho da janela
		//primeiro parametro - largura
		//segundo parametro - altura
		janela.setSize(500, 300);
		
		//adicionando o bot�o no objeto janela (no content pane)
		janela.getContentPane().add(botao);
		
		//configurando a visibilidade da tela
		janela.setVisible(true);
	
		//informando que a tela nao tem layout pr�-definido
	
	}//fim do m�todo

	
	public static void main(String[] args) {
		new Exemplo01().iniciaGui();
	}
	
	
	
	
}//fim da classe
