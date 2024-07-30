import javax.swing.JOptionPane;

public class Array 
{
    public static void main(String[] args) 
    {
        int val [] = new int[2];
        double media = 0.0;
        JOptionPane.showMessageDialog(null,"Informe 2 números");
        for(int i=0;i<2;i++)
        {
            val[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"º valor: "));
            media += val[i];
        }
        media /= val.length;
        JOptionPane.showMessageDialog(null,"Resultado: "+media);
    }    
}
