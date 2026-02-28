const API_URL = "http://localhost:8080/api/tarefas";

    document.addEventListener('DOMContentLoaded', listarTarefas);

    async function listarTarefas() {
        try {
            const response = await fetch(API_URL);
            const tarefas = await response.json();
            const listElement = document.getElementById('task-list');
            listElement.innerHTML = '';

            tarefas.forEach(tarefa => {
                const li = document.createElement('li');
                li.className = 'task-item';
                li.innerHTML = `
                    <div class="task-info">
                        <h3>${tarefa.nome}</h3>
                        <p>${tarefa.descricao || 'Sem descrição'}</p>
                    </div>
                    <div class="actions">
                        <button class="btn-delete" onclick="deletarTarefa(${tarefa.id})">Excluir</button>
                    </div>
                `;
                listElement.appendChild(li);
            });
        } catch (error) {
            console.error("Erro ao buscar tarefas:", error);
        }
    }

    async function salvarTarefa() {
        const nome = document.getElementById('nome').value;
        const descricao = document.getElementById('descricao').value;

        if (!nome) return alert("O nome é obrigatório!");

        const novaTarefa = {
            nome: nome,
            descricao: descricao,
            concluida: false
        };

        try {
            const response = await fetch(API_URL, {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(novaTarefa)
            });

            if (response.ok) {
                document.getElementById('nome').value = '';
                document.getElementById('descricao').value = '';
                listarTarefas();
            }
        } catch (error) {
            console.error("Erro ao salvar:", error);
        }
    }

    async function deletarTarefa(id) {
        if (!confirm("Deseja realmente excluir esta tarefa?")) return;

        try {
            const response = await fetch(`${API_URL}/${id}`, {
                method: 'DELETE'
            });

            if (response.ok) {
                listarTarefas();
            }
        } catch (error) {
            console.error("Erro ao deletar:", error);
        }
    }