import javax.swing.JOptionPane;

public class AppBlocos{
   public static void main (String [] args){
      BlocoDeNota notasArray = new BlocoDeNota();
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n0 - Sair \n1 - Inserir \n2 - Remover \n3 - Atualizar"));
			         if(op == 1)
			{	
				String nota = JOptionPane.showInputDialog("Digite sua nota");
				
				Nota notas = new Nota(nota);
	
				notasArray.inserir(notas);		
			}
         else if(op == 2)
			{
				String nota = JOptionPane.showInputDialog("Digite sua nota");
				notasArray.remover(nota);
            }
			         
   }while(op!=0);
   }
}
