/**
 * 
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * Classe respons�vel por demonstrar a utiliza��o do componente JRadioButton
 * 
 * @author Elisson Barbieri Machado
 * @since 2 de mar. de 2021
 */
public class Exemplo04 {

	// declarando os atributos
	private JFrame janela;
	// label auxiliar para exibir o que foi selecionado no radio button
	private JLabel lbAuxiliar;
	// declarando o componente radio button
	private JRadioButton rbSolteiro;
	private JRadioButton rbCasado;
	private JRadioButton rbViuvo;
	private JRadioButton rbDivorciado;
	// componente ButtonGroup respons�vel por gerenciar os componentes radio button
	private ButtonGroup grpRadio;
	// componente Jbutton para executar a a��o de clique
	private JButton btVerificar;
	// componente para organiza��o
	private JPanel painel;

	/*
	 * m�todo para criar a tela
	 */
	public void iniciaGui() {
		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de Radio Button");
		// configurando o tamanho da tela - largura/ altura
		janela.setSize(340, 275);
		// configurando a posi��o incial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * consigura��o da JLabel - r�tulo auxiliar
		 */
		lbAuxiliar = new JLabel();
		// configurando o texto inicial
		lbAuxiliar.setText("Selecione o estado civil:");
		// configurando a posi��o do texto
		lbAuxiliar.setHorizontalTextPosition(SwingConstants.CENTER);
		// configurando posi��o e tamanho
		lbAuxiliar.setBounds(50, 20, 230, 20);

		/*
		 * configura��es dos radio button
		 */
		rbSolteiro = new JRadioButton();
		rbCasado = new JRadioButton();
		rbViuvo = new JRadioButton();
		rbDivorciado = new JRadioButton();
		// configurando o texto do componente
		rbSolteiro.setText("Solteiro");
		rbCasado.setText("Casado");
		rbViuvo.setText("Vi�vo");
		rbDivorciado.setText("Divorciado");
		// configurando a posi��o e tamanho
		rbSolteiro.setBounds(80, 50, 100, 25);
		rbCasado.setBounds(80, 75, 100, 25);
		rbViuvo.setBounds(80, 100, 100, 25);
		rbDivorciado.setBounds(80, 125, 100, 25);

		/*
		 * Configura��es do ButtonGroup
		 */
		grpRadio = new ButtonGroup();
		grpRadio.add(rbSolteiro);
		grpRadio.add(rbCasado);
		grpRadio.add(rbViuvo);
		grpRadio.add(rbDivorciado);

		/*
		 * configura��es do JButton
		 */
		btVerificar = new JButton();
		// configurando o texto a ser exibido
		btVerificar.setText("Verificar");
		// configurando a posi��o e tamanho
		btVerificar.setBounds(126, 176, 84, 28);
		// configurando a a��o do bot�o
		btVerificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verificaRadioButton();

			}
		});

		/*
		 * configura��es do painel da tela - JPanel
		 */
		painel = (JPanel) janela.getContentPane();
		// configurando o layout inicial
		painel.setLayout(null);
		// adicionando os componentes no painel
		painel.add(lbAuxiliar);
		painel.add(rbSolteiro);
		painel.add(rbCasado);
		painel.add(rbViuvo);
		painel.add(rbDivorciado);
		painel.add(btVerificar);

		// configurando visibilidade da tela
		janela.setVisible(true);

	}// fim do m�todo

	private void verificaRadioButton() {
		//variave aux para armazenar
		String aux = "";
		
		//verifica se solteiro esta selecionado
		if (rbSolteiro.isSelected()) {
			aux = lbAuxiliar.getText() + " " + rbSolteiro.getText();
		}
		//verifica se Casado esta selecionado
		if (rbCasado.isSelected()) {
			aux = lbAuxiliar.getText() + " " + rbCasado.getText();
		}
		//verifica se Viuvo esta selecionado
		if (rbViuvo.isSelected()) {
			aux = lbAuxiliar.getText() + " " + rbViuvo.getText();
		}
		//verifica se Divorciado esta selecionado
		if (rbDivorciado.isSelected()) {
			aux = lbAuxiliar.getText() + " " + rbDivorciado.getText();
		}
		
		//atribuino a sele��o na label auxilar
		if (!aux.equals("")) {
			lbAuxiliar.setText(aux);
		}
		
	}

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo04().iniciaGui();
	}

}// fim classe
