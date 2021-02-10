# BestFoliaSys

- [Descritivo do problema](https://is.gd/problem_description)
- [User Stories](#user-stories)
- [Objetivo de aprendizagem](#objetivo-de-aprendizagem)
  - Lista encadeada
  - JUnit
  - Diagrama de classes
  - Padrões de projeto
    - Facade
    - MVC
    - Iterator
- [Melhorias](melhorias)

# User Stories
As *user stories* ou "histórias de usuário" é uma forma simples e objetiva
de descrever um determinado requisito de um *software*. 

As histórias de usuários foram um excelente fator norteante considerando
que esse projeto foi um primeiro contato com a linguagem java e com as técnicas 
de POO. Graças a ela foi possível direcionar os esforços de construção do 
*software* sem perder o foco do objetivo final.

A tabela abaixo apresenta os principais requisitos propostos nas *user stories*.

| User Story nº | Título | Breve Descrição | Status | 
|:-------------:|--------|-----------------|:------:|
| 01 | Manutenção de Bloco | Inserir e consultar Bloco. | ✅ |
| 02 | Manutenção de Transporte | Inserir e consultar Transporte | ✅ |
| 03 | Manutenção de Folião | Inserir e consultar Folião | ✅ |
| 04 | Listar Blocos | Mostrar todos os Blocos que irão sair em um determinado local e período. | ✅  |
| 05 | Listar Transportes | Mostrar todos os Transportes cadastrados para um Bloco. | ✅ |
| 06 | Registrar Folião no Transporte | Inserir um registro de um Folião em um Transporte. | ✅ |
| 07 | Listar Foliões de um Transporte | Mostrar todos os Foliões que estão registrados em um transporte. | ✅ | 

# Objetivo de aprendizagem

Os objetivos de aprendizagem não foram deixados explícitos. Porém, com base no 
[descritivo do problema](https://is.gd/problem_description) é possível afirmar que 
esse projeto tinha como objetivo apresentar os seguintes conceitos: 
- Lista encadeada 
- Testes unitários com JUnit
- Diagramas de classes 
- Padrões de projetos (MVC, Facade e Interator)

# Melhorias

A lista abaixo apresenta uma série de melhorias que podem ser implementadas no 
algoritmo desse projeto para melhorar a qualidade do código sem fugir do conexto 
de aprendizagem esperado.

| Classe | Pacote | Melhoria |
|:------ | :----: | ---------|
| ListaEncadeada | util | Utilizar a interface List do pacote java.util.List ao invés da IList que já veio no projeto. |
| ListaEncadeada | util | Utilizar generics na lista encadeada a fim de reduzir a quantidade de *cast* feito no projeto. |
| Transporte | model | Utilizar objetos apropriados para representar a data e horario de chegada e saida de um Transporta. |
| Transporte, Foliao e Bloco | model | Reimplementar o método equals das classes. |
| Transporte e Bloco | model | Retornar listas imutáveis (utlizando o Collections.unmodifiable) ao invés da lista original. |
| BFSController | controller | Fazer os métodos lançarem exceções ao invés de retornar "null". |
| BFSController | controller | Gerar os IDs de utilizando a classe UUID ao invés de usar uma variável acumuladora. |
