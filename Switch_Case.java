import javax.swing.JOptionPane;

public class Switch_Case 
{
    public static void main(String[] args) 
    {
        String opcao;
        opcao = JOptionPane.showInputDialog("Você esta fazendo a atividade");
        opcao = opcao.toUpperCase();
        switch(opcao)
        {
            case "SIM":
                JOptionPane.showMessageDialog(null, "Parabéns!",
                "escolha --> Switch case",JOptionPane.INFORMATION_MESSAGE);
            break;
            case "NÃO":
                JOptionPane.showMessageDialog(null, "Que pena",
                "escolha --> Switch case",JOptionPane.INFORMATION_MESSAGE);
            break;
            default:
                JOptionPane.showMessageDialog(null, "O que você quis dizer?",
                "escolha --> Switch case",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
