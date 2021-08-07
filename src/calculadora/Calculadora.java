/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author amb00
 */
public class Calculadora extends Frame implements ActionListener {

    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private Button bDec,bMas,bMenos,bPor,bDiv,bIgual,bBorrar;
    private TextField txtDisplay;
    
    //defino las variables para almacenar los numeros y el resultado de la operacion
    double op1,op2,res;
    String operacion;
    boolean opReq=true;
    
    public Calculadora()
    {
        super();
        
        setLayout(new BorderLayout());
        
        //En el Norte ubico el Display
        txtDisplay = new TextField();
        //Se agrega el textfield al frame
        add(txtDisplay,BorderLayout.NORTH);
        
        //en el centro ubico el teclado
        Panel pTeclado = _crearTeclado();
        add(pTeclado,BorderLayout.CENTER);
        
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bDec.addActionListener(this);
        bMas.addActionListener(this);
        bMenos.addActionListener(this);
        bPor.addActionListener(this);
        bDiv.addActionListener(this);
        bIgual.addActionListener(this);
        addWindowListener(new EscuchaVentana());
        pack();
        setVisible(true);
    }
    
    
    private Panel _crearTeclado()
    {
       // instancio los 16 botones
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");
        bMas = new Button("+");
        bMenos = new Button("-");
        bPor = new Button("*");
        bDiv = new Button("/");
        bDec = new Button(".");
        bIgual = new Button("=");
        
        //instancio un panel (un container) con grid layout 4 * 4
        Panel p = new Panel(new GridLayout(4,4));
        
        //Se agregan los botones al panel
        //fila 0
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bDiv);
        
        //fila 1
         p.add(b4);
         p.add(b5);
         p.add(b6);
         p.add(bPor);
        
        //fila 2
         p.add(b1);
         p.add(b2);
         p.add(b3);
         p.add(bMenos);
        
        //fila 3
         p.add(bDec);
         p.add(b0);
         p.add(bIgual);
         p.add(bMas);
        
        //retorno el panel con todos los botones agregados
        return p;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b0)
        {
            if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + "0");
        }
        if (e.getSource()==b1)
        {
            if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + "1");
        }
        if (e.getSource()==b2)
        {
            if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + "2");
        }
        if (e.getSource()==b3)
        {
            if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + "3");
        }
        if (e.getSource()==b4)
        {
            if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + "4");
        }
        if (e.getSource()==b5)
        {
            if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + "5");
        }
        if (e.getSource()==b6)
        {
            if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + "6");
        }
        if (e.getSource()==b7)
        {
            if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + "7");
        }
        if (e.getSource()==b8)
        {
            if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + "8");
        }
        if (e.getSource()==b9)
        {
            if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + "9");
        }
        if (e.getSource()==bMas)
        {
            if (op1 != 0)
                op1 = op1+Double.parseDouble(txtDisplay.getText());
            else
                op1 = Double.parseDouble(txtDisplay.getText());
            operacion = "suma";
            txtDisplay.setText("");
            System.out.println(op1);
        }
        if (e.getSource()==bMenos)
        {
             if (op1 != 0)
                op1 = op1-Double.parseDouble(txtDisplay.getText());
            else
                op1 = Double.parseDouble(txtDisplay.getText());
            operacion = "resta";
            txtDisplay.setText("");
            System.out.println(op1);
        }
        if (e.getSource()==bPor)
        {
             if (op1 != 0)
                op1 = op1*Double.parseDouble(txtDisplay.getText());
            else
                op1 = Double.parseDouble(txtDisplay.getText());
            operacion = "multiplicacion";
            txtDisplay.setText("");
            System.out.println(op1);
        }
        if (e.getSource()==bDiv)
        {
             if (op1 != 0)
                op1 = op1/Double.parseDouble(txtDisplay.getText());
            else
                op1 = Double.parseDouble(txtDisplay.getText());
            operacion = "division";
            txtDisplay.setText("");
            System.out.println(op1);
        }
        if (e.getSource()==bIgual)
        {
            op2 =Double.parseDouble(txtDisplay.getText());
            System.out.println(op2);
            switch (operacion)
            {
                case "suma":
                    res=op1+op2;
                    txtDisplay.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                    break;
                 case "resta":
                    res=op1-op2;
                    txtDisplay.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                    break;
                  case "multiplicacion":
                    res=op1*op2;
                    txtDisplay.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                    break;
                 case "division":
                    res=op1/op2;
                    txtDisplay.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                    break;      
                    
            }
            opReq=true;
            System.out.println(res);
            
        }
        if (e.getSource()==bDec)
        {
             if (opReq){ txtDisplay.setText(""); opReq=false; }
            txtDisplay.setText(txtDisplay.getText() + ".");
        }
        
            
        
    }
    
    class EscuchaVentana implements WindowListener
    {

        @Override
        public void windowClosing(WindowEvent we) {
            
            //para cerrar la ventana y finalizar el programa se hace en 3 pasos
            //1. ocultar la ventana
            //2. liberar con el metodo dispose
            //3. finalizar la aplicacion con system.exit
            
            System.out.println("oculto");
            setVisible(false);
            System.out.println("libero");
            dispose();
            System.out.println("bye");
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent we) { }

        @Override
        public void windowIconified(WindowEvent we) {}

        @Override
        public void windowDeiconified(WindowEvent we) {  }

        @Override
        public void windowActivated(WindowEvent we) { }

        @Override
        public void windowDeactivated(WindowEvent we) { }

        @Override
        public void windowOpened(WindowEvent we) { }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
    }
    
}
