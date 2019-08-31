# Java + Spring + Feign Client

Exemplo de uma aplicação utilizando Java com Spring Boot consumindo um serviço através do Feign Client.

## Getting Started

### 1º
mvn clean package

### 2º
Sem Docker Compose:
   
    a. Iniciar o servidor de testes (porta padrão 9000): java -jar java-spring-server-tests-example-1.0.0.jar
    b. Iniciar a aplicação com o exemplo do Feign Client que foi gerada em /target (porta padrão 9001)

Com Docker Compose:

    a. docker-compose up

### 3º

Consumir o webservice da aplicação, ela irá efetuar uma chamada no servidor utilizando o Feign Client:


curl -X POST \
  http://127.0.0.1:9001/customer \
  -H 'content-type: application/json' \
  -d '{
	"firstName" : "Danilo",
	"lastName" : "Deus Dará",
	"age" : 36
}'

### 4º

Efetuar a consulta:

curl -X GET \
  http://127.0.0.1:9001/customer


### Informações adicionais

Código fonte do servidor de testes: https://github.com/deusdara/java-spring-server-for-tests-example

