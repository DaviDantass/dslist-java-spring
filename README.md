

🎮 DSList - Catálogo de Jogos

DSList é uma API Java Spring Boot para organizar listas de jogos, permitindo consultar detalhes e reordenar a posição dos jogos dentro das listas.


---

🛠 Tecnologias

    


---

💻 Como Rodar

1. Configure o banco de dados

Para desenvolvimento, edite src/main/resources/application-dev.properties com suas credenciais do PostgreSQL.

Para testes, use o H2 (application-test.properties) já configurado.



2. Execute a aplicação



mvn spring-boot:run

3. Acesse a API



http://localhost:8080


---

⚙️ Funcionalidades

📋 Listar jogos por lista

🔍 Consultar detalhes de cada jogo

🔄 Reordenar a posição dos jogos dentro de uma lista

🧪 Suporte a múltiplos perfis: dev, test e prod



---

📡 Endpoints

🎮 Jogos

Método	Endpoint	Descrição

GET	/games	Lista todos os jogos
GET	/games/{id}	Retorna detalhes de um jogo pelo ID


📑 Listas

Método	Endpoint	Descrição

GET	/lists	Lista todas as listas de jogos
GET	/lists/{id}/games	Retorna os jogos de uma lista específica
POST	/lists/{id}/replacement	Move/reordena a posição de um jogo na lista



---

🗂 Banco de Dados

H2 para testes (application-test.properties)

PostgreSQL para desenvolvimento/prod


Exemplo de inserção inicial:

INSERT INTO tb_game_list (name) VALUES ('Aventura e RPG');

INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description)
VALUES ('Mass Effect Trilogy', 4.8, 2012, 'RPG, Shooter', 'XBox, Playstation, PC', 'https://...', 'Resumo', 'Descrição detalhada');
