package com.aparicio.interfaz;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //Cambiar apariencia de las apps
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

        String texto= "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

String miTexto = texto.strip();
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setTitle("Mi primera ventana con Swing");
        jFrame.setSize(600,400);

        // Clase para crear etiquetas
        JLabel jLabelSaludo = new JLabel();
        jLabelSaludo.setText("Hola mundo...");
        jLabelSaludo.setBounds(10,10, 580,10);
        jFrame.add(jLabelSaludo);

        JButton jButtonAceptar = new JButton();
        jFrame.setVisible(true);
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(
                actionEvent->{
                   // System.out.println("Imprimir mensaje");
                    imprimirMensaje();
                }
        );
        jButtonAceptar.setBounds(370,290,140,50);
        jFrame.add(jButtonAceptar);
        // Agragar aceptat al boton

        jFrame.setVisible(true);


    }

    public static void imprimirMensaje() {
        System.out.println("Este es un mensaje");


    }
}
