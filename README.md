# MediaDeAlunosVetores
Deseja se saber quantos alunos tem em cada sala de aula, a media dos alunos e qual sala esta acima da media.
##  ALGORITMO
###  início
	float media = 0
	int soma = 0 , c=0 , sala = 0
	int Q[] = {35,4,22,20,36,30}
	enquanto c < 6 faça
		ler posições do vetor
		somar todos os valores (soma = soma+Q[])
	fim enquanto
		Exibir media(media = soma/6)
	enquanto c < 6 faça
		se valor do vetor(Q[])for maior que a media
		exibir sala com numero de alunos acima da media
	fim enquanto
Fim
