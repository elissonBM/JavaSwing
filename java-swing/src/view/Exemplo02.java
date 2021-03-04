package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Classe para demonstrar a utiliza��o de janela botoes rotulos e campo de texto
 * @author Elisson Barbieri Machado
 * @since 1 de mar. de 2021
 */
public class Exemplo02 {
	
	//m�todo responsavel por criar a tela e adicionar seus componentes

	public void iniciaGui() {
		
		/*
		 * definido a tela e suas configura��es
		 */
		JFrame janela= new JFrame(); 
		//configurando o titulo da tela
		janela.setTitle("exemplo de campo de texto");
		//configurando o tamanho da tela
		janela.setSize(300, 200);
		//definindo o layout como nulo 
		janela.getContentPane().setLayout(null);
		//configurando a centraliza��o do objeto janela
		janela.setLocationRelativeTo(janela);
	
		
		/*
		 * definido o rotulos e suas configura��es JLabel
		 */
		JLabel lbNome = new JLabel();
		//definindo o nome a ser exibido
		lbNome.setText("nome: ");
		//primeiro argumento posi��o x - do ponto zero para a direita
		//segundo argumento - posi��o y - do ponto zero para baixo 
		//terceiro argumento - largura
		//quarta argumento - alltura
		lbNome.setBounds(10, 10, 40, 20);
		
		/*
		 * definido o campo de texto e suas configura��es 
		 */
		JTextField tfNome = new JTextField();
		tfNome.setBounds(60, 10, 150, 20);
				
		
		/*
		 * definido o bot�o e suas configura��es
		 */
		JButton botao = new JButton();
		//configurando o texto do bot�o
		botao.setText("clique aqui");
		botao.setBounds(10, 60, 100, 20);
		
		janela.getContentPane().add(lbNome);
		janela.getContentPane().add(tfNome);
		janela.getContentPane().add(botao);

		/*
		 * configurando o paramentro de visibilidade
		 */
		janela.setVisible(true);
	}//fim do metodo
	
	//metodo principal para executar a classe
	public static void main(String[] args) {
		new Exemplo02().iniciaGui();
		}

}
