

const options = { method: 'GET' };
let resposta = await fetch('https://www.whatsapprobo.com.br/chamada.json', options);
let listaOriginal = await resposta.json();

let lista = document.querySelectorAll('.jKwXVe');
let listaAtual = [];

for (aluno of lista) {
	let nome = aluno.textContent;
	listaAtual.push({ aluno: nome, codigo: 0, data: new Date() });
}

// let listaAlunosPresentes = [];
// for (alunoOriginal of listaOriginal) {
// 	for (alunoAtual of listaAtual) {
// 		if (alunoOriginal.aluno.toLowerCase() == alunoAtual.aluno.toLowerCase()) {
// 			listaAlunosPresentes.push(alunoOriginal);
// 		}
// 	}
// }

let listaAlunosAusentes = [];
for (alunoOriginal of listaOriginal) {
	let encontrado = false;
	for (alunoAtual of listaAtual) {
		if (alunoOriginal.aluno.toLowerCase() == alunoAtual.aluno.toLowerCase()) {
			encontrado = true;
		}
	}
	if (encontrado == false) {
		listaAlunosAusentes.push(alunoOriginal)
	}
}


// nginx
// add_header Access-Control-Allow-Origin *;
// add_header Access-Control-Allow-Origin "meet.google.com";























https://stackoverflow.com/questions/14248296/making-http-requests-using-chrome-developer-tools/73495422#73495422


/*
 * 1. Faça um algoritmo que peça o nome do usuário e em seguida mostre o mesmo na tela.

/*
 * 2. Faça um algoritmo que peça dois números aos usuários e em seguida multiplique-os. 

/*
 * 3. Faça um algoritmo que lê os valores de 3 números

/*
 * 4. Faça um algoritmo para calcular o valor total de venda, dado que o 
