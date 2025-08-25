# 🎮 DSList - Catálogo de Jogos

DSList é uma API **Java Spring Boot** que organiza listas de jogos, permitindo consultar informações detalhadas e reordenar os jogos dentro das listas.

---

## 🛠 Tecnologias

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.5.4-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue)
![H2](https://img.shields.io/badge/H2-Test-orange)
![Maven](https://img.shields.io/badge/Maven-3.9.3-red)

---
Perfeito! Aqui está a versão limpa e moderna só da parte de **Como Rodar**, sem comandos de git:

---

## 💻 Como Rodar

Siga os passos para executar a aplicação localmente:

1. **Configure o banco de dados**:

* Para desenvolvimento, edite `src/main/resources/application-dev.properties` com suas credenciais do PostgreSQL.
* Para testes, use o H2 (`application-test.properties`) já configurado.

2. **Execute a aplicação**:

```bash
mvn spring-boot:run
```

3. **Acesse a API**:

```
http://localhost:8080
```

---

## ⚙️ Funcionalidades

* 📋 Listar jogos por lista.
* 🔍 Consultar detalhes de cada jogo.
* 🔄 Alterar a posição dos jogos dentro de uma lista.
* 🧪 Suporte a múltiplos perfis: **dev**, **test** e **prod**.

---

## 🗂 Banco de Dados

* **H2** para testes (`application-test.properties`).
* **PostgreSQL** para desenvolvimento/prod.

Exemplo de inserção de listas e jogos iniciais:

```sql
INSERT INTO tb_game_list (name) VALUES ('Aventura e RPG');

INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description)
VALUES ('Mass Effect Trilogy', 4.8, 2012, 'RPG, Shooter', 'XBox, Playstation, PC', 'https://...', 'Resumo', 'Descrição detalhada');
```
