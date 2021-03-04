package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Classe para usar o jcheckbox
 * @author Elisson Barbieri Machado
 * @since 2 de mar. de 2021
 */
public class Exemplo05 {

	//declarando os componentes da tela
	private JFrame janela;
	//label auxiliar para exibir mensagem na tela
	private JLabel lbAuxiliar;
	//checkbox para permitir mais de uma op��o 
	private JCheckBox cbBoleto;
	private JCheckBox cbCartao;
	private JCheckBox cbCobranca;
	//bot�o para verificar
	private JButton btVerificar;
	
	private JPanel painel;
	
	public void iniciaGui() {
		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de Radio Button");
		// configurando o tamanho da tela - largura/ altura
		janela.setSize(390, 300);
		// configurando a posi��o incial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 * configura��es do jlabel
		 */
		lbAuxiliar = new JLabel();
		lbAuxiliar.setText("selecione a forma de pagamento");
		lbAuxiliar.setBounds(40, 15, 210, 20);
		
		/*
		 * configura��o do jcheckbox
		 */
		cbBoleto = new JCheckBox();
		cbCartao = new JCheckBox();
		cbCobranca = new JCheckBox();
		//configurando o texto
		cbBoleto.setText("Boleto");
		cbCartao.setText("Cart�o de cr�dito");
		cbCobranca.setText("Cobran�a bancario");
		//configurando a posi��o do componente
		cbBoleto.setBounds(45, 60, 145, 20);
		cbCartao.setBounds(45, 80, 145, 20);
		cbCobranca.setBounds(45, 100, 145, 20);
		
		/*
		 * configura��o do jbutton
		 */
		btVerificar = new JButton();
		btVerificar.setText("verificar");
		btVerificar.setBounds(145, 196, 120, 28);
		//configurando a a��o do bot�o
		btVerificar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				verificaCheckBox();
				
			}
		});
		
		/*
		 * configura��o do painel da janela 
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbAuxiliar);
		painel.add(cbBoleto);
		painel.add(cbCartao);
		painel.add(cbCobranca);
		painel.add(btVerificar);
		
		janela.setVisible(true);	
	
	}
	
	/*
	 * metodo para verificar a sele��o do componente jcheckbox
	 */
	private void verificaCheckBox() {
		//variavel auxiliar para exibir a forma de pagamento
		String aux = "";
		
		//verificando boleto selecionado
		if (cbBoleto.isSelected()) {
			aux += cbBoleto.getText() + "\n";
		}
		//verificando Cartao selecionado
		if (cbCartao.isSelected()) {
			aux += cbCartao.getText() + "\n";
		}
		//verificando Cobranca selecionado
		if (cbCobranca.isSelected()) {
			aux += cbCobranca.getText() + "\n";
		}
		
		//exibindo ao usuario
		if (!aux.equals("")) {
			JOptionPane.showMessageDialog(null, aux, "formas de pagamento", 1);
		}
	
	}
	
	public static void main(String[] args) {
		new Exemplo05().iniciaGui();
	}



}
