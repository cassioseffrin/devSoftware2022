
let lista = document.querySelectorAll('.jKwXVe');
let listaAlunos = [];

for (aluno of lista) {
	let nome = aluno.textContent;
	listaAlunos.push({aluno: nome, codigo: 0, data: new Date()});
}

JSON.stringify(listaAlunos)
