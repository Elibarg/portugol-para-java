import javax.swing.JOptionPane;

public class Do_While 
{
    public static void main(String[] args) 
    {
       Double resposta = 0.0;
       JOptionPane.showMessageDialog(null,"Acerte o cálculo");
       do
       {
        resposta = Double.parseDouble(JOptionPane.showInputDialog("Quanto é 5/2"));
       }while(resposta != 2.5);
       JOptionPane.showMessageDialog(null,"Acertou");

    }
}
