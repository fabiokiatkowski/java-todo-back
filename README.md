# java-todo-back

## Um pouco da aplicação
A aplicação é uma API RESTful onde é possível fazer a inserção de novas tarefas da lista de pendências, remover pendências e consultar. Neste momento é somente possível atualizar o estado da flag **DONE**, e os possíveis valores são TRUE ou FALSE.

Foi utilizado funcionalidades do Framework Spring como validações, auto configurações. Também foi adicionado o uso do hibernate para abstrair o manusei de dados do banco de dados e deixar o código mais legível.

A crição do model utilizado segue padrão de desenvolvimento para uso de JPAs e boas práticas de banco de dados.

O front que é renderizado nesta aplicação se encontra no respostório [https://github.com/fabiokiatkowski/java-todo-front] e foi compilado para o deploy no heroku (*Deploy ainda em fase de implementação*).

## Ferramentas Utilizadas
  * Spring
  * Mysql
  * Java
  * Maven
  
## Instalando
Para rodar a apalicação é necessário que se tenha o mysqlsql na máquina e com um schema TODO configurado.
É possível verifiar na pasta /src/main/resources no diretório application.properities quais as configurações necessárias.

*TODO: Irei enviar um arquivo .sql para a criação do schema.*

Também é necessário ter configurado o Maven na máquina para gerenciamento das dependências do projeto.

## Rodando a aplicação.
- Rodar o comando mvn eclipse:eclipse para baixar as dependências
- Executar o comando mvn spring-boot:run para iniciar a aplicação.

A aplicação foi configurada para fazer a criação das tabelas necessárias para o funcionamento, por tanto, somente com esses passos já deve ser possível visualizar na url padrão http://localhost:8080
