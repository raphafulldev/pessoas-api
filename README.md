# PESSOAS API
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/raphafulldev/assets/blob/main/LICENSE) 

# Sobre o projeto

Projeto para identificar os conhecimentos do canditato quanto às tecnologias utilizadas no cotidiano de desenvolvimento da equipe de Back-end na Attornatus Procuradoria Digital.

## Objetivos do Projeto
- Implementar modelo de domínio
- Estruturar camadas lógicas: controller, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Read, Update, Delete
- Testes Unitários 


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

# DESAFIO JAVA 
## As respostas da API foram feitas por meio do Postman utilizando o formato JSON
## Criar uma pessoa ✅
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.11.04.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.25.24.jpeg)
## Editar uma pessoa ✅
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.35.37.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.37.32.jpeg)
## Consultar uma pessoa ✅
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.32.52.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.33.46.jpeg)
## Listar pessoas ✅
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.26.55.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.30.47.jpeg)
## Criar um endereço para pessoa ✅
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.40.36.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.42.25.jpeg)
## Lsitar endereços da pessoa ✅
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.44.04.jpeg)
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.55.44.jpeg)
## Poder informar qual endereço é o principal da pessoa ✅
### O endereço principal será definido por meio do booleano "true"
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2009.57.23.jpeg)

# TESTES UNITÁRIOS
![Web 1](https://github.com/raphafulldev/assets/blob/main/images/WhatsApp%20Image%202023-02-18%20at%2010.00.29.jpeg)


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
git clone https://github.com/raphafulldev/pessoas-api

```



# Autor

Raphael Barros Barreto

https://www.linkedin.com/in/raphael-barros-devbackjava/


