import java.util.ArrayList;
public class BlocoDeNota{
   private ArrayList <Nota> notasArray;
   
   public BlocoDeNota(){
      notasArray = new ArrayList<>();
   }
   public void inserir(Nota nota){
      notasArray.add(nota);
   }
   
   public void remover(String nota)
	{ int posicao = buscarNotas(nota);
		if(posicao >= 0) {
			notasArray.remove(posicao);
		}
	}
   public int buscarNotas(String nota)
	{
		for(int i = 0; i <notasArray.size(); i++)
		{
			Nota notas = notasArray.get(i);
			String notass = notas.getNota();
			if(nota.equalsIgnoreCase(notass))
			{
				return i;
			}
		}
		return -1;
}
      public void atualizar(String nota, String novaNota)
	{ int posicao = buscarNotas(nota);
		if(posicao >= 0) {
			Nota notas;
			notas.setNota(novaNota);
			notasArray.set(posicao, notas.setNota(novaNota));
		}
}
}