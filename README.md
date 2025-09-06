# AppCadastroAluno

Um aplicativo Android simples que demonstra um fluxo de duas telas para inserir o nome de um aluno e gerar um número de matrícula aleatório.

## Descrição

Este projeto é um aplicativo Android básico desenvolvido em Kotlin. Ele foi criado como um Trabalho Prático (TP) para a disciplina de Programação para Dispositivos Móveis. O aplicativo consiste em uma tela inicial onde o nome do aluno é inserido. Ao avançar, o nome é passado para uma segunda tela, que exibe os detalhes e permite a geração de um número de matrícula aleatório para o aluno.

## Funcionalidades

* **Tela de Entrada de Dados:** Uma tela inicial para inserir o nome do aluno usando um `TextInputEditText`.
* **Validação Simples:** Verifica se o campo de nome não está vazio antes de prosseguir.
* **Navegação entre Telas:** Utiliza `Intent` para navegar da tela principal para a tela de detalhes.
* **Tela de Detalhes:** Exibe o nome do aluno recebido da tela anterior e apresenta um botão para gerar a matrícula.
* **Geração de Matrícula:** Gera um número de matrícula aleatório de 6 dígitos ao clicar no botão.
* **UI Moderna:** Utiliza `CardView` para agrupar e destacar as informações do aluno.

## Tecnologias Utilizadas

* **Linguagem:** Kotlin
* **UI:** Android XML com `ConstraintLayout`, `CardView` e `Material Components`.
* **Componentes:** Activity, Intent, AlertDialog.
* **Build:** Gradle

