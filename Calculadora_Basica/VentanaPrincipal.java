/**

@author Jesus Barajas, jebarfig21
Clase que abre una ventana, aqui mismo se encuentra el controlador del programa

Es una calculadora simple para 2 números, y realiza las operacion de Suma, Resta, Multiplicacion, División, Potencia

 **/

package Calculadora_Basica;

import java.lang.Math;

//Bibliotecas
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JLabel text;        //Texto no editable
    private JLabel text_num1;   //Texto no editable
    private JLabel text_num2;   //Texto no editable
    private JTextField num1;    //Caja de Texto para el numero 1
    private JTextField num2;    //Caja de Texto para el numero 2
    private JButton suma;       //boton para sumar
    private JButton multiplica; //boton para multiplicar
    private JButton divide;     //boton para dividir
    private JButton resta;      //boton para restar
    private JButton exponente;  //boton para elevar el num1 a la num2 potencia

    public VentanaPrincipal() {
	super();                   //constructor principal de la clade padre JFrame
	configurarVentana();       //método para darle estilo a la ventana
	inicializarComponentes();  //método para darle valores a los atributos
    } 




    private void configurarVentana(){
	int ancho = 500;
        int alto = 250;
	this.setTitle("Primer Calculadora");      //Titulo de la ventana
	this.setSize(ancho,alto);                    //Tamaño de ventana
	this.setLocationRelativeTo(null);         //Colocacion de pantalla
	this.setLayout(null);                     
	this.setResizable(true);                 //La ventana no puede alterar su tamaño
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cuando se cierra la ventana el programa termina su eejcucion actual
	
    }

    private void inicializarComponentes() {
	//incicalizar atributos
	text = new JLabel();
	text_num1 = new JLabel();
	text_num2 = new JLabel();
	num1 = new JTextField();
	num2 = new JTextField();
	suma = new JButton();
	multiplica = new JButton();
	divide = new JButton();
	resta = new JButton();
	exponente = new JButton();

	//Asigar valores
	text.setText("Bienvenido a tu primer calculadora"); // Colocamos texto a la etiqueta
	text.setBounds(25,25,250,25); //tamaño y posicion de text

	text_num1.setText("Inserte el primer número"); // Colocamos texto a la etiqueta
	text_num1.setBounds(25,50,200,25); //tamaño y posicion de text
        num1.setBounds(25,80,100,25);//tamaño y posicion de num1

	text_num2.setText("Inserte el segundo número"); // Colocamos texto a la etiqueta
	text_num2.setBounds(25,110,200,25); //tamaño y posicion de text
	num2.setBounds(25,140,100,25);//tamaño y posicion de num1


	
	//BOTONES
	
	suma.setText("Sumar"); //Boton para sumar
        suma.setBounds(300,25,150,25);
        suma.addActionListener(this);
	//------
	resta.setText("Restar"); //Boton para sumar
        resta.setBounds(300,55,150,25);
        resta.addActionListener(this);
        //------
	multiplica.setText("Multiplicar");//Boton para multiplicar
	multiplica.setBounds(300,85,150,25);
	multiplica.addActionListener(this);
	//------
	divide.setText("Dividir");//Boton para multiplicar
	divide.setBounds(300,115,150,25);
	divide.addActionListener(this);
	//------
	exponente.setText("Potencia");//Boton para multiplicar
	exponente.setBounds(300,145,150,25);
	exponente.addActionListener(this);
	
	
	
	//SHOW IN JFRAME
	this.add(text);
	this.add(text_num1);
	this.add(num1);
	this.add(text_num2);
	this.add(num2);
	this.add(suma);
	this.add(multiplica);
	this.add(divide);
	this.add(resta);
	this.add(exponente);
	
    }

    @Override
    public void actionPerformed(ActionEvent e){
	String numero1 = num1.getText();
	String numero2 = num2.getText();
	String Str="0";
	float num=0;
	Object fuente = e.getSource();

	if(fuente == suma){
	    num = (Float.parseFloat(numero1))+(Float.parseFloat(numero2));
	    Str = String.valueOf(num);
	}

	if(fuente == multiplica){
	    num = (Float.parseFloat(numero1))*(Float.parseFloat(numero2));
	    Str = String.valueOf(num);
	}

	if(fuente == divide){
	    num = (Float.parseFloat(numero1))/(Float.parseFloat(numero2));
	    Str = String.valueOf(num);
	}

	if(fuente == resta){
	    num = (Float.parseFloat(numero1))-(Float.parseFloat(numero2));
	    Str = String.valueOf(num);
	}

	if(fuente == exponente){
	    num = (float)(Math.pow((Integer.parseInt(numero1)),(Integer.parseInt(numero2))));
	    Str = String.valueOf(num);
	}
	
	JOptionPane.showMessageDialog(this, "Resultado : "+Str);
    }

}

