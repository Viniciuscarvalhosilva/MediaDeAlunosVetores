package mediaDeAlunos;

public class MediaDeAlunos 
{

	public static void main(String[] args) 
	{
		float media = 0 ;
		int soma = 0, c = 0,sala = 0;  					//VARIAVEIS DO TIPO INTEIRO INICIANDO COM ZERO 
		int Q[] = {35,4,22,20,36,30};	                //VETOR COM VALORES ADICIONADOS EM CADA POSI��O
		int n = Q.length;								//QUANTIDADE TOTAL DO VETOR
		for(c =0;c<n;c++) 								//PROCESSANDO OS 'n' ELEMENTOS DO VETOR 'Q'
		{
			soma = soma + Q[c];							//SOMA RECEBE ELA MESMA MAIS VALOR DE CADA POSI��O DO VETOR
													
		}
		media = soma/n;									//CALCULO DA MEDIA. SOMA DIVIDIDO PELO TOTAL DE POSI��ES DO VETOR
		System.out.println("");
		System.out.println("Media dos alunos  = " + media); //EXIBE A MEDIA DOS ALUNOS
		System.out.println("*************************");
		System.out.println("");
		System.out.print("Salas que estao acima da media: ");
		System.out.println("");
		for(c=0;c<n;c++)								
		{
												
			sala = sala+1;			
			if (Q[c] > media)								//SE POSI��O DO VETOR FOR MAIOR QUE A MEDIA
			{
				
				
				System.out.printf("\nA sala %d tem (%d) alunos.",sala,Q[c]);//EXIBE AS SALAS ACIMA DA MEDIA
				
			}
		
		}
		
	}

}
