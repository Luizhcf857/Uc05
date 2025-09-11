use gestaoLivro;

insert into usuario(matr, nome, end)
values
(1, 'Ana Souza', 'Rua das flores 123'),
(2, "Carlos Lima", "Av. Brasil 456"),
(3, "Fernanda Alves", "Rua Central 789"),
(4, "Joao Pedro", "Travessa norte 321"),
(5, "Mariana Silva", "Av.Paulista");

select * from usuario;

insert into livros(cod, titulo, edicao)
values
(1, "Introducao ao MySql", "2 edicao"),
(2, "Programando em Java", "3 edicao"),
(3, "Logica de programcao", "1 edicao"),
(4, "Banco de dados Avancado", "5 edicao"),
(5, "Estrutura de dados", "4 edicao");

select * from livros;

insert into autor(cod, nome, nacio)
values
(1, "Jose Santos", "Brasil"),
(2, "Maria Oliveira", "Portugal"),
(3, "Luiz Pereira", "Brasil"),
(4, "John Smith", "EUA"),
(5, "Sofia Costa", "Espanha");

select * from autor;

insert into assunto(cod, nome)
values
(1, "Banco de dados"),
(2, "Programacao"),
(3, "Redes de computadores"),
(4, "Engenheria de software"),
(5, "Inteligencia Artificial");

select * from assunto;