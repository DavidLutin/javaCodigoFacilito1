package paquete;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana3 extends JFrame implements ActionListener{
	
	JPanel panel;
	JButton boton,boton2;
	JLabel texto;
	JTextField input;
	public Ventana3()
	{
		panel = new JPanel();
		boton = new JButton("Oprimir");
		boton2 = new JButton("Oprimir");
		texto = new JLabel();
		input = new JTextField("Escribir aqui");
		
		this.add(panel);		
		
		panel.add(boton);
		panel.add(boton2);
		panel.add(input);
		panel.add(texto);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.boton.addActionListener(this);
		this.boton2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(boton))
		{
			this.texto.setText(this.input.getText());
		}
		if(e.getSource().equals(boton2))
		{
			this.texto.setText("Haz oprimido el boton 2");
		}
		
	}

}
