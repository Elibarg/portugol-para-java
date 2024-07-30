import javax.swing.JOptionPane;

public class For 
{
    public static void main(String[] args) 
    {
       String textoFinal = "";
       JOptionPane.showMessageDialog(null,"Você dira suas 3 bandas preferidas",
       "para --> for",JOptionPane.INFORMATION_MESSAGE);

       for(int i = 0;i<3;i++)
       {
        textoFinal += JOptionPane.showInputDialog("informe o nome das 1ª banda preferida");
        textoFinal += "\n";
       }
       JOptionPane.showConfirmDialog(null, "suas bandas preferidas são: \n" + textoFinal,
       "para --> for",JOptionPane.INFORMATION_MESSAGE);
    }    
}
