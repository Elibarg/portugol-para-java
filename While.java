import javax.swing.JOptionPane;

public class While 
{
    public static void main(String[] args) 
    {
       boolean resposta;
       int aux;
       JOptionPane.showMessageDialog(null,"Conta uma coisa pra gente...");

       aux = JOptionPane.showConfirmDialog(null,"Você entendeu a diferença entre do while e while");
       if(aux == 0)
       {
            resposta = true;
       }else{
        resposta = false;
       }
       while(!resposta)
       {
            aux = JOptionPane.showConfirmDialog(null,"...");
            if( aux == 0)
            {
                resposta = true;
            }else
            {
                resposta = false;
            }
       }
       JOptionPane.showConfirmDialog(null,"A");
    }
}
