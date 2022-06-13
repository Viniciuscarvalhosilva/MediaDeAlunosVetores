package mediaDeAlunosFeature;
import java.util.Scanner;

public class MediaDeAlunosFeature 
{

	public static void main(String[] args) 
	{
		float media = 0;
		int soma = 0, c = 0, sala = 0, sal1 = 0 ,sal2 = 0 ,sal3 = 0;  					
		int Q[] = new int[6];	        
		int n = Q.length;
		Scanner read = new Scanner(System.in);
		
		for(c=0;c<n;c++) 
		{
			sala = sala+1;													//sala soma 1 a cada iteracao do laço
			System.out.printf("Digite o numero de alunos da sala %d:\n",sala);
			Q[c] = read.nextInt();											//grava valor digitado em cada posicao do vetor
			soma = soma + Q[c];												//soma recebe ela mesmo mais o valor digitado para cada posicao do vetor
																
		}
		media = soma/6;														//calcula a media de todos os valores digitados
		System.out.println("*********************************************");
		System.out.printf("A media dos alunos e %.1f\n", media);
		System.out.println("*********************************************");
		System.out.print("ACIMA DA MEDIA: \n");
				
		for(c=0;c<n;c++)
		{
			sal1 = sal1 +1;													
			if (Q[c] > media)												//se valor da posicao do vetor for maior que a media
			{
					
				System.out.printf("\nSala %d tem %d alunos. ",sal1,Q[c]);	//exibe que a sala tem quantidade de alunos acima da media
			}
			
					
		}
			System.out.println("\n");
			System.out.println("********************************************");
			System.out.print("ABAIXO DA MEDIA: \n");
		for(c=0;c<n;c++)
		{
			sal2 = sal2 +1;	
			if (Q[c] < media)
			{
					
				System.out.printf("\nSala %d tem %d alunos.",sal2,Q[c]);
			}
			
		}
		System.out.println("\n");
		System.out.println("********************************************");
		System.out.print("IGUAIS A MEDIA: \n");
		for(c=0;c<n;c++)
		{
			sal3 = sal3+1;
			if(Q[c]==media)
			{
				
				System.out.printf("\nSala %d tem %d alunos\nIgual a media.", sal3,Q[c]);
			}
						
		}
								
	}
}


