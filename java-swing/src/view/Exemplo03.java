package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Classe para 
 * @author Elisson Barbieri Machado
 * @since 1 de mar. de 2021
 */
public class Exemplo03 {

	/*
	 * declarando os componentes utilizados na tela
	 */
	private JFrame janela;
	private JTextField campo;
	private JTextArea area;
	private JButton botao1;
	private JButton botao2;
	
	/*
	 * metodo para criar a instancia dos objetos e componentes da tela e suas 
	 * configura��es
	 */

	public void iniciaGui() {
	
		/*
		 *configurando a tela
		 */
		janela = new JFrame();
		//definindo o tamanho
		janela.setSize(300, 300);
		//definindo o titulo
		janela.setTitle("exemplo de a��o");
		janela.setLocationRelativeTo(null);
		
		/*
		 * configurando o campo de texto
		 */
		campo = new JTextField();
		
		
		/*
		 * configurando a area de texto
		 */
		area = new JTextArea();
		
		/*
		 * configurando o primeiro  bot�o
		 */
		botao1 = new JButton();
		//texto do botao
		botao1.setText("clique aqui");
		//adicionando o evento de clique ao bot�o 1
		botao1.addActionListener(new AcaoBotao1());
		
		
		/*
		 * configurando o segundo bot�o
		 */
		botao2 = new JButton();
		//texto do botao
		botao2.setText("troca cor");
		//adicionando o evento de clique ao bot�o 1
		botao2.addActionListener(new AcaoBotao2());
		
		/*
		 * adicionando os componentes na tela pasando parametros de localiza��o
		 */
		//Adiciona o bot�o ao painel da janela
		janela.getContentPane().add(BorderLayout.EAST,botao2);
		//Adiciona o bot�o ao painel da janela
		janela.getContentPane().add(BorderLayout.SOUTH,botao1);
		//Adiociona a area ao painel da janela
		janela.getContentPane().add(BorderLayout.CENTER,area);
		//Adiciona o campo ao painel da janela		
		janela.getContentPane().add(BorderLayout.NORTH,campo);
		/*
		 * configurando os parametros de exibi��o da tela
		 */
		
		janela.setVisible(true);
	}//fim do metodo
	
	/*
	 * classe interna auxiliar para computar a a��o do primeiro botao
	 */
	public class AcaoBotao1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//captura o textfield
			String auxiliar = campo.getText();
			//atribui na area
			area.append(auxiliar + "\n");
			//apagando o conteudo do campo
			campo.setText("");		}
	}//fim da classe interna para o bot�o 1
	
	/*
	 * classe interna auxiliar para computar a a��o do segundo botao
	 */
	public class AcaoBotao2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//Se fundo branco ent�o troca para preto
			if (area.getBackground().equals(Color.BLACK)) {
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);
			}else {
				area.setBackground(Color.BLACK);
				area.setForeground(Color.WHITE);
			}
		}
		
	}//fim da classe interna para o bot�o 2 
	
	
	
	
	public static void main(String[] args) {
		new Exemplo03().iniciaGui();
		

	}



}//fim da classe

