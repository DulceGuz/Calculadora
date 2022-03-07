import javax.swing.*;
import java.awt.*;//paquete para controlar los eventos
import java.awt.event.*;
public class Calculadora extends JFrame {
   JLabel Letrero, lblNum1, lblNum2, lblRes, lbl3, lbl4, lbl5;//Reserva el espacio en memoria
   JButton btnlimpiar, btnSalir, btnsuma, btnres, btnmult, btndiv;
   JTextField txtNum1, txtNum2, txtRes;
   JPanel panel;
   private Object objTextField;
   public Calculadora() {
      initComponents();
      panel.setBackground(Color.CYAN);
   }
   private void initComponents() {
      setSize(300, 320);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      txtNum1 = new JTextField(10);//instanciación del objeto
      txtNum2 = new JTextField(10);
      txtRes = new JTextField(10);
        
      Letrero = new JLabel("     CALCULADORA GRAFICA           ");
      lblNum1 = new JLabel("Numero 1:  ");
      lbl3 = new JLabel("                             ");
      lbl4 = new JLabel("                             ");
      lbl5 = new JLabel("                             ");
      lblNum2 = new JLabel("Numero 2:  ");
      lblRes = new JLabel ("Resultado: ");
      btnsuma = new JButton("+");
      btnres = new JButton("-");
      btnmult = new JButton("*");
      btndiv = new JButton("/");
      btnlimpiar = new JButton("Limpiar");
      btnlimpiar.setMnemonic('C');
      btnSalir = new JButton("Salir");
      btnSalir.setMnemonic('S');
      
      panel = new JPanel();
      panel.add(Letrero);
      Letrero.setFont(new Font("Arial",Font.BOLD,14)); 
      panel.add(lblNum1);
      lblNum1.setBounds(310, 310, 310, 16);
      panel.add(txtNum1);
      panel.add(lbl3);
      panel.add(lblNum2);
      lblNum2.setBounds(1000,1000,310,50);
      panel.add(txtNum2);
      panel.add(lbl4);
      panel.add(btnsuma);
      panel.add(btnres);
      panel.add(btnmult);
      panel.add(btndiv);
      panel.add(lbl5);
      panel.add(lblRes);
      panel.add(txtRes);
      panel.add(btnlimpiar);
      panel.add(btnSalir);
      btnSalir.addMouseListener(new MyListener());
      KeyAdapter kl  = new KeyAdapter() {
         public void keyTyped(KeyEvent evt){
            ResultadoKeyTyped(evt);
         }
      };
      txtNum1.addKeyListener(kl);
      KeyAdapter klf  = new KeyAdapter(){
         public void keyTyped(KeyEvent evt){
            ResultadoKeyTyped(evt);
         }
      };
      txtNum2.addKeyListener(klf);
    
      btnsuma.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btnsumaActionPerformed(evt);
         }
      });
      btnres.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btnresActionPerformed(evt);
         }
      });
      btnmult.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btnmulActionPerformed(evt);
         }
      });
      btndiv.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btndivActionPerformed(evt);
         }
      });
      btnlimpiar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btnlimpiarActionPerformed(evt);
         }
      });
      setTitle("Calculadora");
      setContentPane(panel);
      setVisible(true);
   }
   private void ResultadoKeyTyped (KeyEvent evt) {
      objTextField =  evt.getSource(); //objecto que produce el evento
   }
   private void btnsumaActionPerformed(ActionEvent evt) {
      float num1 = 0;
      float num2 = 0;
      float res = 0;    
      try{
         if(objTextField == txtNum1 || objTextField == txtNum2) {
            String a = txtNum1.getText();
            num1 =  Float.parseFloat(a.trim());
            String b = txtNum2.getText();
            num2 = Float.parseFloat(b.trim());
            res = num1 + num2;//Suma
            String texto = String.format("%.2f", res);
            txtRes.setText(texto); //Los JTextField solamente pueden recibir y mostrar cadenas.          
         }
      }   
      catch(NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Datos incompletos", "Error", JOptionPane.ERROR_MESSAGE);
         txtNum1.setText(" "); 
         txtNum2.setText(" ");
         txtNum1.requestFocus();
         txtNum2.setText(null);
      }
   }
   private void btnresActionPerformed(ActionEvent evt) {
      float num1 = 0;
      float num2 = 0;
      float res = 0;    
      
      try{
         if(objTextField == txtNum1 || objTextField == txtNum2) {
            String a = txtNum1.getText();
            num1 =  Float.parseFloat(a.trim());
            String b = txtNum2.getText();
            num2 = Float.parseFloat(b.trim());
            res = num1 - num2;//Resta
            String texto = String.format("%.2f", res);
            txtRes.setText(texto);          
         }
      }   
      catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Datos incompletos", "Error", JOptionPane.ERROR_MESSAGE);
        txtNum1.setText(" "); 
        txtNum2.setText(" ");
        txtNum1.requestFocus();
        txtNum2.setText(null);
      }
   }
   private void btnmulActionPerformed(ActionEvent evt) {
      float num1 = 0;
      float num2 = 0;
      float res = 0;    
      
      try{
         if(objTextField == txtNum1 || objTextField == txtNum2) {
            String a = txtNum1.getText();
            num1 =  Float.parseFloat(a.trim());
            String b = txtNum2.getText();
            num2 = Float.parseFloat(b.trim());
            res = num1 * num2;//Resta
            String texto = String.format("%.2f", res);
            txtRes.setText(texto);          
         }
      }   
      catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Datos incompletos", "Error", JOptionPane.ERROR_MESSAGE);
        txtNum1.setText(" "); 
        txtNum2.setText(" ");
        txtNum1.requestFocus();
        txtNum2.setText(null);
      }
      
   }
   private void btndivActionPerformed(ActionEvent evt) {
      float num1 = 0;
      float num2 = 0;
      float res = 0;    
      
      try{
         if(objTextField == txtNum1 || objTextField == txtNum2) {
            String a = txtNum1.getText();
            num1 =  Float.parseFloat(a.trim());
            String b = txtNum2.getText();
            num2 = Float.parseFloat(b.trim());
            if(num2 == 0){
              JOptionPane.showMessageDialog(null, "No se puede dividir entre 0", "Error", JOptionPane.ERROR_MESSAGE); 
            } else {
               res = num1 / num2;//Resta
               String texto = String.format("%.2f", res);
               txtRes.setText(texto);
            }          
         }
      }   
      catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Datos incompletos", "Error", JOptionPane.ERROR_MESSAGE);
        txtNum1.setText(" "); 
        txtNum2.setText(" ");
        txtNum1.requestFocus();
        txtNum2.setText(null);
      }
   }
   private void btnlimpiarActionPerformed(ActionEvent evt) {
        txtNum1.setText(""); 
        txtNum2.setText("");
        txtRes.setText("");
   }
   private class MyListener extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         System.exit(0);
      }
   }
}