# PESSOAS API
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/raphafulldev/assets/blob/main/LICENSE) 

# Sobre o projeto

Projeto para identificar os conhecimentos do canditato quanto às tecnologias utilizadas no cotidiano de desenvolvimento da equipe de Back-end na Attornatus Procuradoria Digital.

## Objetivos do Projeto
- Implementar modelo de domínio
- Estruturar camadas lógicas: controller, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções
- Testes Unitários (jUnit)


## Foi implementado o padrão de projetos REST, visando romper a comunicação direta entre a camada de vizualização da camada de modelo de negócio.
![](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-17%20at%2013.58.17.jpeg)

## Modelo Conceitual
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/2.jpeg)

## Passos para implementação das consultas:
- Foi criado repositório do JPA (Java Persistence API)

![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-17%20at%2010.27.31.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-17%20at%2010.28.57.jpeg)
- Criada o service, que é a camada onde fica a lógica do negócio

![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-17%20at%2010.30.05.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-17%20at%2010.31.14.jpeg)

- Classe controller/resources

![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-17%20at%2010.32.28.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-17%20at%2010.33.48.jpeg)

## Tratamento de erros personalizados
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/9.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/10.jpeg)

## As respostas da API foram feitas por meio do Postman utilizando o formato JSON
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-17%20at%2010.35.29.jpeg)

## Configuração do Banco de Dados H2
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-17%20at%2010.39.40.jpeg)


# Tecnologias utilizadas
## Back end
- Java
- Postman para testes do CRUD
- Banco de dados relacional H2 
- SpringBoot

### Pré-requisitos: Java 11 ou superior

```bash
# clonar repositório
git clone https://github.com/raphafulldev/workshop-springboot3-jpa

```



# Autor

Raphael Barros Barreto

https://www.linkedin.com/in/raphael-barros-devbackjava/


