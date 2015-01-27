import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.JOptionPane;

public class Accueil extends JFrame {
		
		
		
			
	private static final long serialVersionUID = 1L;
			
			JFrame mainFrame;
			
		public Accueil() {
			
			mainFrame=new JFrame("Visualisation traffic aéroport");
			mainFrame.setSize(1600, 800);
		    mainFrame.setLocationRelativeTo(null);
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JMenuBar jmb=new JMenuBar();
			JMenu jm=new JMenu("Fichier");
			JMenuItem chargerAero=new JMenuItem("Charger aéoroport");
			JMenuItem chargerTraffic=new JMenuItem("Charger traffic");
			JMenuItem quitter=new JMenuItem("quitter");
			

			quitter.setActionCommand("Exit");// possible de ne pas mettre quitter
			
			
			mainFrame.setJMenuBar(jmb);
			jmb.add(jm);
			jm.add(chargerAero);
			jm.add(chargerTraffic);
			jm.add(quitter);
			
			 
		        /* 1- Initialisation du container. */
		        mainFrame.setLayout(new GridBagLayout());

		        /* 2- Création et initialisation d'une série de composants. */
		        JTextField arriveevol = new JTextField("Arrivée Vols");
		        arriveevol.setPreferredSize(new Dimension(200, 40));  
		        JTextField departvol = new JTextField("Départ Vols");
		        departvol.setPreferredSize(new Dimension(200, 40)); 
		        JComboBox arriveeCombo = new JComboBox();
		        arriveeCombo.setPreferredSize(new Dimension(200, 40)); 
		        JComboBox departCombo = new JComboBox();
		        departCombo.setPreferredSize(new Dimension(200, 40)); 
		        JTextField selectionne = new JTextField();
		        selectionne.setPreferredSize(new Dimension(200, 40));
		        selectionne.setBackground(Color.green);
		        JTextArea selection = new JTextArea("Vol sélectionné");
		        selection.setPreferredSize(new Dimension(200, 40)); 
		        JPanel visualisation = new JPanel();
		        visualisation.setPreferredSize(new Dimension(400, 200)); 
		        visualisation.setBackground(Color.red);
		        JTextField temps = new JTextField("Temps");
		        temps.setPreferredSize(new Dimension(200, 40)); 

		        
		        /*3- Ajout de ces composants en spécifiant les contraintes de type GridBagConstraints. */
		        GridBagConstraints gbc = new GridBagConstraints();

		        gbc.gridx = gbc.gridy = 0; 
		        gbc.weightx = 0;
		        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		        mainFrame.add(arriveevol,gbc);
		        
		        gbc.gridx = 1;
		        gbc.weightx = 0;
		        mainFrame.add(departvol, gbc);

		        
		        gbc.gridx = 2;
		        gbc.weightx = 1;
		       
		        gbc.gridwidth = GridBagConstraints.REMAINDER;
		        gbc.fill = GridBagConstraints.HORIZONTAL;
		        
		        mainFrame.add(temps, gbc);
		        
		        gbc.gridx = 0;
		        gbc.gridy = 1;
		        gbc.gridheight = gbc.gridwidth = 1;
		        gbc.weightx = 0;
		        
		        gbc.anchor = GridBagConstraints.LINE_START;
		        
		        mainFrame.add(arriveeCombo, gbc);

		        gbc.gridx = 1;
		        gbc.gridheight = gbc.gridwidth = 1;
		        gbc.weightx = 0;
		        
		       
		        mainFrame.add(departCombo, gbc);
		        
		        

		        gbc.gridx = 0;
		        gbc.gridy = 3;
		        
		       gbc.anchor = GridBagConstraints.LAST_LINE_START;
		        
		        mainFrame.add(selection, gbc);
		        
		        gbc.gridx = 1;
		        gbc.gridy = 3;
		        gbc.gridheight = gbc.gridwidth = 1;
		       // gbc.weighty = 1;
		        mainFrame.add(selectionne, gbc);
		        
		        gbc.gridx = 2;
		        gbc.gridy = 1;
		        gbc.weightx = 1;
		        gbc.weighty = 1;
		        gbc.gridwidth = gbc.gridheight= GridBagConstraints.REMAINDER;
		       
		        gbc.fill = GridBagConstraints.BOTH;
		      
		        mainFrame.add(visualisation, gbc);
		      
		       

		       mainFrame.setMinimumSize(new Dimension(900, 500));
		       // mainFrame.setLocationRelativeTo(null);
		    
		    
		   // mainFrame.pack();
		      
		        
			mainFrame.setVisible(true);
		}
		
		
		public class ActionQuitter implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				mainFrame.dispose();		
			}
}
}
