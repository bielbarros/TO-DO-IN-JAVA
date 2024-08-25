# Gerenciador de Tarefas


### Um simples aplicativo de gerenciamento de tarefas em Java que permite adicionar, listar, marcar como concluída e remover tarefas.

### Descrição

Este projeto é um aplicativo de console em Java para gerenciar tarefas. Ele permite que os usuários adicionem novas tarefas, visualizem todas as tarefas, marquem tarefas como concluídas e removam tarefas existentes. O aplicativo usa uma lista para armazenar as tarefas e um identificador único para cada tarefa.

### Estrutura do Projeto
O projeto é composto por três classes principais:

* Tarefa: Representa uma tarefa individual com atributos como ID, descrição e status de conclusão.
* GerenciadorTarefas: Gerencia a lista de tarefas, fornecendo métodos para adicionar, listar, marcar como concluída e remover tarefas.

* Main: Contém o método main, que fornece uma interface de linha de comando para interagir com o
  GerenciadorTarefas.

### Classes

Tarefa

Representa uma tarefa com os seguintes atributos:

* id (int): Identificador único da tarefa.
* descricao (String): Descrição da tarefa.
* concluida (boolean): Status de conclusão da tarefa.
  Métodos principais:
* getId(): Retorna o ID da tarefa.
* getDescricao(): Retorna a descrição da tarefa.
* isConcluida(): Retorna o status de conclusão da tarefa.
* setDescricao(String descricao): Define a descrição da tarefa.
* setConcluida(boolean concluida): Define o status de conclusão da tarefa.
* toString(): Retorna uma representação textual da tarefa.
### GerenciadorTarefas
Gerencia uma lista de tarefas com os seguintes métodos:

* adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista.
* listarTarefas(): Lista todas as tarefas.
* marcarComoConcluida(int id): Marca a tarefa com o ID especificado como concluída.
* removerTarefa(int id): Remove a tarefa com o ID especificado.
### Main
Fornece uma interface de linha de comando para o usuário interagir com o sistema:
* Adicionar novas tarefas.
* Listar todas as tarefas.
* Marcar uma tarefa como concluída.
* Remover uma tarefa.
* Sair do programa.