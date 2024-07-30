import javax.swing.JOptionPane;

public class If_Else_If_e_Else {
    public static void main(String[] args) 
    {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("inforne um número: "));
        if(num <0)
        {
            JOptionPane.showMessageDialog(null,"O número informado e menor que zero");
        } 
        else if (num == 0)
        {
            JOptionPane.showMessageDialog(null,"O número informado e zero");

        }
        else
        {
            JOptionPane.showMessageDialog(null,"O número informado e maior que zero");
        }
        
    }
    
}
