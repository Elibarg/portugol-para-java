import javax.swing.JOptionPane;

public class Matrix
{
    public static void main(String[] args) 
    {
        int val [][] = new int [2][2];
        int cont = 0;
        String menorZero = "";
        String maiorZero = "";

        JOptionPane.showMessageDialog(null, "Informe 4 números");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                cont ++;
                val[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o"+cont+"º valor"));

                if(val[i][j] <= 0)
                {
                    if(menorZero == "")
                    {
                        menorZero = "Valor(es) menor ou igual a zero";
                    }else
                    {
                        menorZero += ", ";
                    }
                }
                menorZero += val[i][j];
                if(maiorZero == "")
                {
                    maiorZero = "Valor(es) mairo que zero";
                }else
                {
                    maiorZero += ", ";
                }
                maiorZero += val[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, menorZero +"\n"+ maiorZero);
    }    
}
