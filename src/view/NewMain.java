
package view;

import Model.Desktop;
import Model.Notebook;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {
         String opcao = "s";
        

        List<Desktop> pc = new ArrayList<>();
        List<Notebook> not = new ArrayList<>();
        
       
 
        while( ! opcao.equalsIgnoreCase( "n" )){
            String texto = "Digite sua opção: \n" + 
                    "1 - Cadastrar  Desktop \n" + 
                    "2 - Remover Desktop da Lista \n" + 
                    "3 - Listar de todos Desktop Cadatrados \n" + 
                    "4- Cadastrar Notebok \n"+
                    "5 - Remover Notebook da Lista \n" +
                    "6 - Lista de Notebook cadastrados \n" +
                    "n - Sair ";
            opcao =  JOptionPane.showInputDialog(texto);

            switch( opcao ){
                case "1":
                    Desktop pp = new Desktop();
                   
                    String id = JOptionPane.showInputDialog("Id do Aparelho");
                    id = id.replace(",", ".");
                    pp.setId(Integer.valueOf( id ) );
                    
                    
                    String modelo = JOptionPane.showInputDialog("Modelo do Aparelho");
                    pp.setModelo(modelo);
                    
                    String potenciaF = JOptionPane.showInputDialog("Potencia do Aparelho");
                    potenciaF = potenciaF.replace(",", ".");
                    pp.setPotenciaF(Integer.valueOf( potenciaF ) );
                    
                    String cor = JOptionPane.showInputDialog("Cor do Aparelho");
                    pp.setCor(cor);
                    
                   
                    String preco = JOptionPane.showInputDialog("preco do Aparelho");
                    preco = preco.replace(",", ".");
                    pp.setPreco(Double.valueOf( preco ) );
                    
                    
                    pc.add( pp );
                    break;
                    
               case "2":
                    int poss = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:")  );
                    not.remove(poss -1 );
                    break;
                    
                    
                    
                case "3":
                    String conteudo = "";
                    for (Desktop pi : pc) {
                        conteudo += pi.Informacoes()+ "\n";
                    }
                   JOptionPane.showMessageDialog(null, conteudo);
                    break;
                    
                    
                    case "4":
                        
                    Notebook n = new Notebook();
                   
                    String idd = JOptionPane.showInputDialog("Id do Aparelho");
                    id = idd.replace(",", ".");
                    n.setId(Integer.valueOf( id ) );
                    
                    
                    String modeloo = JOptionPane.showInputDialog("Modelo do Aparelho");
                    n.setModelo(modeloo);
                    
                    String tempodeBateria = JOptionPane.showInputDialog("Tempo de Bateria do Aparelho");
                    
                    n.setTempodeBateria( tempodeBateria) ;
                    
                    String corr = JOptionPane.showInputDialog("Cor do Aparelho");
                    n.setCor(corr);
                    
                   
                    String precoo = JOptionPane.showInputDialog("preco do Aparelho");
                    preco = precoo.replace(",", ".");
                    n.setPreco(Double.valueOf( preco ) );
                    
                    
                    not.add(n);
                    
                    
                    
                    break;
                    
                    case "5":
                    int posn = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:")  );
                    not.remove(posn -1 );
                    break;
                    
                    
                case "6":
                    String cont = "";
                    for (Notebook pi : not) {
                        cont += pi.Informacoes()+ "\n";
                    }
                   JOptionPane.showMessageDialog(null, cont);
                    break;
                    
                case "n":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");

            }
        }
   
    }
    
}
