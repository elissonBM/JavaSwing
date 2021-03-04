package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicSliderUI;

/**
 * Classe para demonstrar a utilização do componente jlist e o jscrollpane
 * @author Elisson Barbieri Machado
 * @since 3 de mar. de 2021
 */
public class Exemplo08 {

	//declarando os atributos da tela
	private JFrame janela;
	//label auxiliar para exibir a seleção do usuario
	private JLabel lbAuxiliar;
	//atributo jlist para armazzenar uma lista de opçções 
	private JList ltDiaSemana;
	//atributos auxiliar scrollpane
	private JScrollPane scroll;
	//painel para organizar os componentes
	private JPanel painel;
	
	//vetor auxiliar para os dias da semana
	private String diasSemana[] = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sabado"};
	
	/*
	 * metodo para criar a tela
	 */
	public void iniciaGui() {
		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de JList e JScroll");
		// configurando o tamanho da tela - largura/ altura
		janela.setSize(330, 330);
		// configurando a posição incial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 * configurando a jlabel
		 */
		lbAuxiliar = new JLabel();
		//configurando o texto 
		lbAuxiliar.setText("CRTL para multi seleções");
		//configurações de estilo
		lbAuxiliar.setOpaque(true);
		lbAuxiliar.setBackground(Color.LIGHT_GRAY);
		lbAuxiliar.setForeground(Color.BLACK);
		//configurando a posição e tamanho
		lbAuxiliar.setBounds(10, 10, 300, 30);
		
		/*
		 * configurando o jlist
		 */
		ltDiaSemana = new JList(diasSemana);
		//configurando como o componente permitirá a seleção dos seus dados - unico ou multiplo
		ltDiaSemana.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		ltDiaSemana.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				lbAuxiliar.setText((String) ltDiaSemana.getSelectedValue());
				
			}
		});
		/*
		 * configurando o scroll
		 */
		scroll = new JScrollPane(ltDiaSemana);
		//configurando o tamanho e posição
		scroll.setBounds(10, 60, 300, 90);
		
		/*
		 * configurando o painel
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbAuxiliar);
		painel.add(scroll);
		
		//configurando a visibilidade 
		janela.setVisible(true);

	}
	
	//metodo principal
	public static void main(String[] args) {
		new Exemplo08().iniciaGui();
	}
	
	
	
	
	
	
}
