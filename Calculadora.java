import javax.swing.*;
import java.awt.*;//paquete para controlar los eventos
import java.awt.event.*;
public class Calculadora extends JFrame {
   String Num1,signo,Num2;
   JLabel Letrero,lbl, lbl1, lbl2, lbl3, lbl4;//Reserva el espacio en memoria
   JButton btnlimpiar, btnSalir, btnsuma, btnres, btnmult, btndiv, btn1,btn2, btn3,btn4,btn5, btn6, btn7, btn8, btn9, btn0, btn10, btnig;
   JTextField txtPantalla;
   JPanel panel;
   private Object objTextField;
   public Calculadora() {
      initComponents();
      panel.setBackground(Color.PINK);
   }
   private void initComponents() {
      setSize(325, 360);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      txtPantalla = new JTextField(16);
      txtPantalla.setFont(new Font("Arial",Font.BOLD,18));
      Letrero = new JLabel("        CALCULADORA GRAFICA        ");
      lbl = new JLabel("");
      lbl1 = new JLabel("");
      lbl2 = new JLabel("                   ");
      lbl3 = new JLabel("                   ");
      lbl4 = new JLabel("                   ");
      btnsuma = new JButton("+");
      btnsuma.setPreferredSize(new Dimension(50,50));
      btnsuma.setBackground(Color.WHITE);
      btnsuma.setFont(new Font("Arial",Font.BOLD,18));
      btnres = new JButton("-");
      btnres.setFont(new Font("Arial",Font.BOLD,18));
      btnres.setPreferredSize(new Dimension(50,50));
      btnres.setBackground(Color.WHITE);
      btnmult = new JButton("*");
      btnmult.setFont(new Font("Arial",Font.BOLD,18));
      btnmult.setPreferredSize(new Dimension(50,50));
      btnmult.setBackground(Color.WHITE);
      btndiv = new JButton("/");
      btndiv.setPreferredSize(new Dimension(50,50));
      btndiv.setBackground(Color.WHITE);
      btndiv.setFont(new Font("Arial",Font.BOLD,18));
      btn1 = new JButton("1");
      btn1.setFont(new Font("Arial",Font.BOLD,18));
      btn1.setPreferredSize(new Dimension(50,50));
      btn1.setBackground(Color.WHITE);
      btn2 = new JButton("2");
      btn2.setFont(new Font("Arial",Font.BOLD,18));
      btn2.setPreferredSize(new Dimension(50,50));
      btn2.setBackground(Color.WHITE);
      btn3 = new JButton("3");
      btn3.setFont(new Font("Arial",Font.BOLD,18));
      btn3.setPreferredSize(new Dimension(50,50));
      btn3.setBackground(Color.WHITE);
      btn4 = new JButton("4");
      btn4.setFont(new Font("Arial",Font.BOLD,18));
      btn4.setPreferredSize(new Dimension(50,50));
      btn4.setBackground(Color.WHITE);
      btn5 = new JButton("5");
      btn5.setFont(new Font("Arial",Font.BOLD,18));
      btn5.setPreferredSize(new Dimension(50,50));
      btn5.setBackground(Color.WHITE);
      btn6 = new JButton("6");
      btn6.setFont(new Font("Arial",Font.BOLD,18));
      btn6.setPreferredSize(new Dimension(50,50));
      btn6.setBackground(Color.WHITE);
      btn7 = new JButton("7");
      btn7.setFont(new Font("Arial",Font.BOLD,18));
      btn7.setPreferredSize(new Dimension(50,50));
      btn7.setBackground(Color.WHITE);
      btn8 = new JButton("8");
      btn8.setFont(new Font("Arial",Font.BOLD,18));
      btn8.setPreferredSize(new Dimension(50,50));
      btn8.setBackground(Color.WHITE);
      btn9 = new JButton("9");
      btn9.setFont(new Font("Arial",Font.BOLD,18));
      btn9.setPreferredSize(new Dimension(50,50));
      btn9.setBackground(Color.WHITE);
      btn0 = new JButton("0");
      btn0.setFont(new Font("Arial",Font.BOLD,18));
      btn0.setPreferredSize(new Dimension(50,50));
      btn0.setBackground(Color.WHITE);
      btn10 = new JButton(".");
      btn10.setFont(new Font("Arial",Font.BOLD,18));
      btn10.setPreferredSize(new Dimension(50,50));
      btn10.setBackground(Color.WHITE);
      btnig = new JButton("=");
      btnig.setFont(new Font("Arial",Font.BOLD,18));
      btnig.setPreferredSize(new Dimension(50,50));
      btnig.setBackground(Color.WHITE);
      btnlimpiar = new JButton("C");
      btnlimpiar.setFont(new Font("Arial",Font.BOLD,18));
      btnlimpiar.setPreferredSize(new Dimension(50,50));
      btnlimpiar.setBackground(Color.WHITE);
      panel = new JPanel();
      panel.add(Letrero);
      Letrero.setFont(new Font("Arial",Font.BOLD,20));
      panel.add(txtPantalla);
      panel.add(lbl);
      panel.add(btn7);
      panel.add(btn8);
      panel.add(btn9);
      panel.add(btndiv);
      panel.add(btnlimpiar);
      panel.add(lbl1);
      panel.add(btn4);
      panel.add(btn5);
      panel.add(btn6);
      panel.add(btnmult);
      panel.add(lbl2);
      panel.add(btn1);
      panel.add(btn2);
      panel.add(btn3);
      panel.add(btnsuma);
      panel.add(lbl3);
      panel.add(btn10);
      panel.add(btn0);
      panel.add(btnig);
      panel.add(btnres);
      panel.add(lbl4);
      
      btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn1ActionPerformed(evt);
         }
      });
      btn2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn2ActionPerformed(evt);
         }
      });
      btn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn3ActionPerformed(evt);
         }
      });
      btn4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn4ActionPerformed(evt);
         }
      });
      btn5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn5ActionPerformed(evt);
         }
      });
      btn6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn6ActionPerformed(evt);
         }
      });
      btn7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn7ActionPerformed(evt);
         }
      });
      btn8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn8ActionPerformed(evt);
         }
      });
      btn9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn9ActionPerformed(evt);
         }
      });
      btn0.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn0ActionPerformed(evt);
         }
      });
      btn10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btn10ActionPerformed(evt);
         }
      });
      btndiv.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btndivActionPerformed(evt);
         }
      });
      btnmult.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btnmultActionPerformed(evt);
         }
      });
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
      btnig.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            btnigActionPerformed(evt);
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
   private void btn1ActionPerformed(ActionEvent evt) {
      txtPantalla.setText(txtPantalla.getText()+"1");      
   }
   private void btn2ActionPerformed(ActionEvent evt) {
      txtPantalla.setText(txtPantalla.getText()+"2");      
   }
   private void btn3ActionPerformed(ActionEvent evt) {
      txtPantalla.setText(txtPantalla.getText()+"3");      
   }
   private void btn4ActionPerformed(ActionEvent evt) {
      txtPantalla.setText(txtPantalla.getText()+"4");      
   }
   private void btn5ActionPerformed(ActionEvent evt) {
      txtPantalla.setText(txtPantalla.getText()+"5");      
   }
   private void btn6ActionPerformed(ActionEvent evt) {
      txtPantalla.setText(txtPantalla.getText()+"6");      
   }
   private void btn7ActionPerformed(ActionEvent evt) {
      txtPantalla.setText(txtPantalla.getText()+"7");      
   }
   private void btn8ActionPerformed(ActionEvent evt) {
      txtPantalla.setText(txtPantalla.getText()+"8");      
   }
   private void btn9ActionPerformed(ActionEvent evt) {
      txtPantalla.setText(txtPantalla.getText()+"9");      
   }
   private void btn0ActionPerformed(ActionEvent evt) {
      txtPantalla.setText(txtPantalla.getText()+"0");      
   }
   private void btn10ActionPerformed(ActionEvent evt) {
      String cadena;
      cadena = txtPantalla.getText();
      if(cadena.length()<=0){
         txtPantalla.setText("0.");
      } else {
         if(!Punto(txtPantalla.getText())){
            txtPantalla.setText(txtPantalla.getText()+".");
         }
      }
   }
   private void btnlimpiarActionPerformed(ActionEvent evt) {
         txtPantalla.setText("");
   }
   private void btndivActionPerformed(ActionEvent evt) {
      if(!txtPantalla.getText().equals("")){
         Num1=txtPantalla.getText();
         signo = "/";
         txtPantalla.setText("");
      }
   }
   private void btnmultActionPerformed(ActionEvent evt) {
      if(!txtPantalla.getText().equals("")){
         Num1=txtPantalla.getText();
         signo = "*";
         txtPantalla.setText("");
      }
   }
   private void btnsumaActionPerformed(ActionEvent evt) {
      if(!txtPantalla.getText().equals("")){
         Num1=txtPantalla.getText();
         signo = "+";
         txtPantalla.setText("");
      }
   }
   private void btnresActionPerformed(ActionEvent evt) {
      if(!txtPantalla.getText().equals("")){
         Num1=txtPantalla.getText();
         signo = "-";
         txtPantalla.setText("");
      }
   }
   private void btnigActionPerformed(ActionEvent evt) {
      String total;
      Num2= txtPantalla.getText();
      if(!Num2.equals("")){
         total=Operacion(Num1,signo,Num2);
         txtPantalla.setText(total);
      }
   }
   public static boolean Punto(String cadena){
      boolean existe;
      existe = false;
      for(int i = 0; i < cadena.length(); i++){
         if(cadena.substring(i, i+1).equals(".")){
            existe = true;
            break;
         }
      }
      return existe;
   }
   public static String Operacion(String Num1, String signo,String Num2){
      Double total = 0.0;
      String Resultado = "";
      if(signo.equals("/")){
         if(Double.parseDouble(Num2)==0){
            Resultado=("No se puede dividir entre 0");
         } else {
           total=Double.parseDouble(Num1)/Double.parseDouble(Num2);
           Resultado=total.toString(); 
         }
      }
      if(signo.equals("*")){
         total=Double.parseDouble(Num1)*Double.parseDouble(Num2);
         Resultado=total.toString();
      }
      if(signo.equals("+")){
         total=Double.parseDouble(Num1)+Double.parseDouble(Num2);
         Resultado=total.toString();
      }
      if(signo.equals("-")){
         total=Double.parseDouble(Num1)-Double.parseDouble(Num2);
         Resultado=total.toString();
      }
      return Resultado;
   }
}