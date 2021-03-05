package view;
/**
 * 
 * Classe para demonstrar a utilização do menu
 * @author Elisson Barbieri Machado
 * @since 4 de mar. de 2021
 * @version 1.0
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;



public class Exemplo00 {
	//declarando os atributos da tela
	private JFrame janela;
	//declarando o componente para a barra de menu
	private JMenuBar barraMenu;
	//delcarando os menus de menu1 menu2 e menu3
	private JMenu menu1;
	private JMenu menu2;
	private JMenu menu3;
	//declarando os itens de menu
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JMenuItem itemMenu3;
	private JMenuItem itemMenu4;
	private JMenuItem itemMenu5;
	private JMenuItem itemMenu6;
	private JMenuItem itemMenu7;
	private JMenuItem itemMenu8;
	private JMenuItem itemMenu9;
	private JMenuItem itemMenu10;
	private JMenuItem itemMenu11;
	private JMenuItem itemMenu12;
	private JMenuItem itemMenu13;
	
	//metodo para criar a tela
	public void iniciaGui() {
		/*
		 * criando as instancias do objeto
		 */
		janela = new JFrame();
		barraMenu = new JMenuBar();
		menu1 = new JMenu();
		menu2 = new JMenu();
		menu3 = new JMenu();
		itemMenu1 = new JMenuItem();
		itemMenu2 = new JMenuItem();
		itemMenu3 = new JMenuItem();
		itemMenu4 = new JMenuItem();
		itemMenu5 = new JMenuItem();
		itemMenu6 = new JMenuItem();
		itemMenu7 = new JMenuItem();
		itemMenu8 = new JMenuItem();
		itemMenu9 = new JMenuItem();
		itemMenu10 = new JMenuItem();
		itemMenu11 = new JMenuItem();
		itemMenu11 = new JMenuItem();
		itemMenu12 = new JMenuItem();
		itemMenu13 = new JMenuItem();
		
		/*
		 * configuração do texto do menu
		 */
		menu1.setText("MENU 1");
		menu2.setText("MENU 2");
		menu3.setText("SAIR");
		
		/*
		 * CONFIGURANDO OS TEXTOS DOS ITENS DE MENU
		 */
		itemMenu1.setText("EXEMPLO01");
		itemMenu2.setText("EXEMPLO02");
		itemMenu3.setText("EXEMPLO03");
		itemMenu4.setText("EXEMPLO04");
		itemMenu5.setText("EXEMPLO05");
		itemMenu6.setText("EXEMPLO06");
		itemMenu7.setText("EXEMPLO07");
		itemMenu8.setText("EXEMPLO08");
		itemMenu9.setText("EXEMPLO09");
		itemMenu10.setText("EXEMPLO010");
		itemMenu11.setText("EXEMPLO011");
		itemMenu12.setText("EXEMPLO012");
		itemMenu13.setText("Sair");
		
		/*
		 * ADICIONANDO O MENU NA BARRA DE MENUS
		 */
		barraMenu.add(menu1);
		barraMenu.add(menu2);
		barraMenu.add(menu3);
		
		/*
		 * adicionando os itens de menu no menu1
		 */
		menu1.add(itemMenu1);
		menu1.add(itemMenu2);
		menu1.add(itemMenu3);
		menu1.add(itemMenu4);
		menu1.add(itemMenu5);
		menu1.add(itemMenu6);
		/*
		 * adicionando os itens de menu no menu2
		 */
		menu2.add(itemMenu7);
		menu2.add(itemMenu8);
		menu2.add(itemMenu9);
		menu2.add(itemMenu10);
		menu2.add(itemMenu11);
		menu2.add(itemMenu12);
		
		/*
		 * adicionando os itens de menu no menu3
		 */
		menu3.add(itemMenu13);
		/*
		 * adicionando as ações ao itens de menu
		 */
		
		itemMenu1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo01().iniciaGui();
				
			}
		});
		
		itemMenu2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo02().iniciaGui();
				
			}
		});
		
		itemMenu3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo03().iniciaGui();
				
			}
		});
		
		itemMenu4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo04().iniciaGui();
				
			}
		});
		
		itemMenu5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo05().iniciaGui();
				
			}
		});
		
		itemMenu6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo06().iniciaGui();
				
			}
		});
		
		itemMenu7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo07().iniciaGui();
				
			}
		});
		
		itemMenu8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo08().iniciaGui();
				
			}
		});
		
		
		itemMenu9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo09().iniciaGui();
				
			}
		});
		
		itemMenu10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo10().iniciaGui();
				
			}
		});
		
		itemMenu11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo11().iniciaGui();
				
			}
		});
		
		itemMenu12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new Exemplo12().iniciaGui();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		itemMenu13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção", JOptionPane.YES_OPTION,
						JOptionPane.CANCEL_OPTION);

				if (opcao == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				
			}
		});
		
		/*
		 * configurando o jframe
		 */
		//adicionando a barra de menu a janela
		janela.setJMenuBar(barraMenu);
		//configurando o titulo do menu
		janela.setTitle("Exemplo de menu");
		//configurando a ação x do frame
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//configurando o tamanho maximizado
		janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//configurando a visibilidade
		janela.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Exemplo00().iniciaGui();
	}
	
	
	
}
