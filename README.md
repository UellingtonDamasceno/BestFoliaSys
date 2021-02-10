# BestFoliaSys

Esse foi o primeiro projeto solicitado na disciplina prática do módulo integrador de algoritmos 
e programação (MI de algoritmo e programação) no semestre 2018.1 do curso de Engenharia da Computação
da Universidade Estadual de Feira de Santana (UEFS).

  Este projeto foi desenvolvido de forma individual tendo como base a metodologia de aprendizagem baseada em problemas 
  do inglês "Problem-Based Learning" (PBL).

- [Descritivo do problema](https://is.gd/problem_description)
- [Motivação](#motivação)
- [Modelo conceitual](#modelo-conceitual)
- [User Stories](#user-stories)
- [Objetivo de aprendizagem](#objetivo-de-aprendizagem)
  - Lista encadeada
  - JUnit
  - Diagrama de classes
  - Padrões de projeto
    - Facade
    - MVC
    - Iterator
- [Melhorias](#melhorias)

# Motivação
Durante o período de carnaval é comum organizarem "bate-volta" para levarem 
foliões que estão dispostos a bricar o carnaval até os blocos carnavalescos que
acontecem várias regiões. O grande problema dessa abordagem é as vezes podem
acontecer desencontros como o que ocorreu com o 
[OO](#https://is.gd/problem_description). E é para evitar problemas como 
a falta de organização e horários que o "BestFoliaSys" foi desenvolvido.

# Modelo conceitual
O projeto é simples e possui uma arquitetura baseada no padrão de projeto 
estrutual Model, View e Controller (MVC) porém sem a utilização da View e com 
as seguintes classes no pacote model: 
- Foliao
- Transporte
- Bloco

O diagram a abaixo demostra como as classes se relacionam.
![Modelo conceitual](https://github.com/UellingtonDamasceno/BestFoliaSys/blob/master/res/modelo%20conceitual.png)


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
