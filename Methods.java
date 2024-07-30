import javax.swing.JOptionPane;

public class Methods 
{
    public static void main(String[] args) 
    {
        String nome = "";
        JOptionPane.showMessageDialog(null,"Este é um EXEMPLO de aplicação de um metodo");
        nome = solicitarNome();
        informaNome(nome);
    }

     public static String solicitarNome()
    {
        String nome = "";

        nome = JOptionPane.showInputDialog("inforeme seu nome");

        return nome;
    }
    public static void informaNome(String nome)
    {
        JOptionPane.showMessageDialog(null,"seu nome é "+ nome +" ?");
    }
}
