const options = { method: 'GET' };
let resposta = await fetch('https://www.whatsapprobo.com.br/chamada.json', options);
let listaOriginal = await resposta.json();

let lista = document.querySelectorAll('.jKwXVe');
let listaAtual = [];

for (aluno of lista) {
	let nome = aluno.textContent;
	listaAtual.push({ aluno: nome, codigo: 0, data: new Date() });
}

let listaAlunosAusentes = [];
for (alunoOriginal of listaOriginal) {
	let encontrado = false;
	for (alunoAtual of listaAtual) {
		if (alunoOriginal.aluno.toLowerCase() == alunoAtual.aluno.toLowerCase()) {
			encontrado = true;
		}
	}
	if (encontrado == false) {
		listaAlunosAusentes.push(  {...alunoOriginal, data: new Date()} ) 
	}
}

console.log(listaAlunosAusentes)



// checagem listas
//  let listaAlunosAusentesAula1 = [];
// for (alunoAtual of listaAtual) {
// 	let encontrado = false;
// 	for (alunoOriginal of listaOriginal ) {
// 		if (alunoOriginal.aluno.toLowerCase() == alunoAtual.aluno.toLowerCase()) {
// 			encontrado = true;
// 		}
// 	}
// 	if (encontrado == false) {
// 		listaAlunosAusentesAula1.push(  {...alunoAtual, data: new Date()} ) 
// 	}
// }


// https://stackoverflow.com/questions/14248296/making-http-requests-using-chrome-developer-tools/73495422#73495422

