import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mark {
    private JButton calculateButton;
    private JTextField txtS_name;
    private JTextField txtCplus;
    private JTextField txtGrade;
    private JTextField txtJava;
    private JTextField txtPython;
    private JTextField txtTotal;
    private JTextField txtavg;
    private JTextField txtCal;
    private JPanel main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("mark");
        frame.setContentPane(new mark().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public mark(){
       calculateButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int java,python,c,total;
               double avg;
               java=Integer.parseInt(txtJava.getText());
               python=Integer.parseInt(txtPython.getText());
               c=Integer.parseInt(txtCplus.getText());
               total=java+python+c;
               txtTotal.setText(String.valueOf(total));
               avg=total/3;
           txtavg.setText(String.valueOf(avg));
           if (avg>50 ){
               txtGrade.setText("Pass");
           }else {
               txtGrade.setText("Fail");
           }

           }
       });

    }
}
