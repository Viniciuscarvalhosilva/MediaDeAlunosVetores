# MediaDeAlunosVetores
Deseja se saber quantos alunos tem em cada sala de aula, a media dos alunos e qual sala esta acima da media.
##  ALGORITMO
###  Início
	float media = 0
	int soma = 0 , c=0 , sala = 0 , sal1 = 0 , sal2 = 0 , sal3 = 0
	enquanto c < 6 faça
		sala = sala + 1
		Digite o numero de alunos da sala
		grava valor em cada posição do vetor(Q[c])
		soma todos os valores do vetor(soma = soma + Q[])
	fim enquanto
	exibir media(media = soma/6)
	enquanto c < 6 faça
		sal1 = sal1 + 1
		se posição do vetor for maior que a media
		exibe o numero da sala(sal1) ,quantidade de alunos(Q[]) e esta acima da media
	fim enquanto
	enquanto c < 6 faça
		sal2 = sal2 + 1
		se posição do vetor for menor que a media
		exibe o numero da sala(sal2) ,quantidade de alunos(Q[]) e esta abaixo da media
	fim enquanto
	enquanto c < 6 faça
		sal3 = sal3 + 1
		se posição do vetor for igual a media
		exibe o numero da sala(sal3) ,quantidade de alunos(Q[]) e igual a media
	fim enquanto
fim

![Fluxograma Feature](https://user-images.githubusercontent.com/64235507/173261359-20a80d9f-2656-4d11-a6e3-8f9b524df77d.png)
