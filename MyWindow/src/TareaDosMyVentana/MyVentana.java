package TareaDosMyVentana;

import javax.swing.*;
import java.awt.*;

public class MyVentana extends JFrame{


    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        v1.setVisible(true);

    }//end main

}//end clas MyVentana

 class Ventana extends JFrame{

    //atributos
     private static final int ancho = 1000;
     private static final int alto = 800;
     private static final String nombre = ("Mi ventana");
     public JPanel panel1;

     //metodos

    public Ventana (){

        this.setSize(ancho,alto);                        //establece el tamaño
        this.setLocationRelativeTo(null);                //establece donde aparece
        this.setTitle(nombre);                           //establece el nombre
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);    //se para el programa al cerrar
        this.getContentPane().setBackground(Color.ORANGE);       //establece el color
        crearComponentes();



    }//end ventana

     private void crearComponentes (){
        colocarPaneles();
        //colocarEtiquetas();
         //colocarBotones();
         //colocarRadioBotones();
         //colocarCajaDeTexto();
         //colocarAreasDetexto();
         //colocarListasDesplegables();

    }//end crear componentes

     private void colocarPaneles(){
         panel1 = new JPanel();//creamos el panel
         panel1.setLayout(null);

         //panel1.setBackground(Color.GREEN);//ponemos el color del panel
         this.getContentPane().add(panel1); //ponemos el panel en la ventana
     }

     private void colocarEtiquetas (){
         JLabel etiqueta = new JLabel("heloo",SwingConstants.CENTER);
         //etiqueta.setText("hellllooo");
         //etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
         etiqueta.setBounds(100, 100, 100, 100);
         panel1.add(etiqueta);
         etiqueta.setForeground(Color.BLUE);
         etiqueta.setBackground(Color.ORANGE);
         etiqueta.setOpaque(true);

         etiqueta.setFont(new Font("Times New Roman", Font.PLAIN,20));

         ImageIcon imagen = new ImageIcon("catttt.png");
         JLabel etiqueta2 = new JLabel();
         panel1.add(etiqueta2);
         etiqueta2.setBounds(50, 100, 250,258);
         etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(),Image.SCALE_SMOOTH)));

     }//end colocar etiquetas

     private void  colocarBotones (){
        //boton 1/ boton de texto
        JButton boton1 = new JButton();
        boton1.setBounds(100, 300, 300,40);
        boton1.setText("push");
         panel1.add(boton1);
         boton1.setForeground(Color.BLUE); //color de letra boton
         boton1.setFont(new Font("cooper black", Font.PLAIN, 27));

         //boton 2 imagen
         JButton boton2 = new JButton();
         boton2.setBounds(100, 500, 200, 200);
         panel1.add(boton2);
         ImageIcon Botoncito = new ImageIcon("boton.png");
         boton2.setIcon(new ImageIcon(Botoncito.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
         boton2.setBackground(Color.PINK);// colo del botn



     }//end colocar botones

     private void colocarRadioBotones(){
        JRadioButton radio1 = new JRadioButton("coso 1", false);
        radio1.setBounds(50, 100, 100,50);
         panel1.add(radio1);


     }//en colocar radio botones

     private void colocarCajaDeTexto(){
         JTextField cajatexto = new JTextField(); //una osla linea de texto
         cajatexto.setBounds(50,50,100,30);
         cajatexto.setText("hewo"+cajatexto.getText());
         panel1.add(cajatexto);

     }

     private void colocarAreasDetexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        //areaTexto.setText("hwoooo");
        //areaTexto.append("\nesto agreega mas texro");
        areaTexto.setEditable(true); //esto lo hace editable
         //se puede hacer un println para obtener el texto en la consola areaTexto.getText
        panel1.add(areaTexto);

     }

     private  void  colocarListasDesplegables(){
        String[]paises = {"oa","si","noh"};
        JComboBox lista1 = new JComboBox(paises);
        lista1.setBounds(20, 20, 100, 200);
        panel1.add(lista1);
     }

     private void raton ()
     {
         JTextPane federico = new JTextPane();
         federico.setBounds(200, 2000, 200, 2000);
         panel1.add(federico);
     }

 }//en Class ventana

