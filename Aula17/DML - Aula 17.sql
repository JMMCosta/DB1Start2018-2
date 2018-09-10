/*Exercicios:
1 - faça insert na tabela UF com todas as siglas dos estados do Brasil.*/

INSERT INTO uf
(nome)

values

('AC'), ('AL'), ('AP'), ('AM'), ('BA'), ('CE'), ('DF'), ('ES'), ('GO'), ('MA'), ('MT'), ('MS'), ('MG'), 
('PA'), ('PB'), ('PR'), ('PE'), ('PI'), ('RJ'), ('RN'), ('RS'), ('RO'), ('RR'), ('SC'), ('SP'), ('SE'), ('TO');


/*2 - insira as seguintes cidades:
Para o SC
* Chapecó
* Blumenau
* Joinville

Para o PR
* Curitiba
* Maringá
* Lunardeli
* Apucarana
* Arapongas
* Ponta Grossa
* Jandaia do Sul
* Sertanopolis
* Cianorte
* Sarandi
* Londrina
* Cruzeiro do Oeste

Para o SP(
*Ribeirão Preto
* Cotia

Para TO
* Tocantinopolis*/

INSERT INTO cidade (nome,uf_id) SELECT 'Chapecó',  id FROM uf WHERE nome = 'SC';
INSERT INTO cidade (nome,uf_id) SELECT 'Blumenau',  id FROM uf WHERE nome = 'SC';
INSERT INTO cidade (nome,uf_id) SELECT 'Joinville',  id FROM uf WHERE nome = 'SC';

INSERT INTO cidade (nome,uf_id) SELECT 'Curitiba',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Maringá',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Lunardeli',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Apucarana',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Arapongas',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Ponta Grossa',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Jandaia do Sul',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Sertanópolis',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Cianorte',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Sarandi',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Londrina',  id FROM uf WHERE nome = 'PR';
INSERT INTO cidade (nome,uf_id) SELECT 'Cruzeiro do oeste',  id FROM uf WHERE nome = 'PR';

INSERT INTO cidade (nome,uf_id) SELECT 'Ribeirão Preto',  id FROM uf WHERE nome = 'SP';
INSERT INTO cidade (nome,uf_id) SELECT 'Cotia',  id FROM uf WHERE nome = 'SP';

INSERT INTO cidade (nome,uf_id) SELECT 'Tocantinopolis',  id FROM uf WHERE nome = 'TO';



/* 3 - Realize a remoção dos estados que não tem cidades*/
/*DELETE FROM uf WHERE uf.id in (SELECT uf.id FROM uf LEFT JOIN cidade ON cidade.uf_id = uf.id WHERE cidade.uf_id IS NULL);*/
/* Erro, não consegui usar subquery*/



/*4 - Insira novas cidades no estado de SP*/
INSERT INTO cidade (nome,uf_id) SELECT 'Araçatuba',  id FROM uf WHERE nome = 'SP';
INSERT INTO cidade (nome,uf_id) SELECT 'Buritama',  id FROM uf WHERE nome = 'SP';
INSERT INTO cidade (nome,uf_id) SELECT 'Guararapes',  id FROM uf WHERE nome = 'SP';
INSERT INTO cidade (nome,uf_id) SELECT 'Birigui',  id FROM uf WHERE nome = 'SP';


/*5 - Realize a atualização do nome das cidades:
* Lunardeli para Lunardelli
* Jandaia do Sul para Jandaia
* Maringá para Cidade Canção
*/
/* UPDATE cidade SET nome = 'Lunardelli' WHERE nome = 'Lunardeli'; -- não Funcionou por configurações internas */
UPDATE cidade SET nome = 'Lunardelli' WHERE nome = 'Lunardeli';
UPDATE cidade SET nome = 'Jandaia' WHERE nome = 'Jandaia do Sul';
UPDATE cidade SET nome = 'Cidade canção' WHERE nome = 'Maringá';


/*6 - Faça um select que retorne o nome das cidades e seus respectivos estados. 
Ordene por estados e posteriormente pelo nome das cidades */
SELECT cidade.nome, uf.nome FROM cidade INNER JOIN uf ON cidade.uf_id = uf.id;
SELECT cidade.nome, uf.nome FROM cidade INNER JOIN uf ON cidade.uf_id = uf.id ORDER BY uf.nome;
SELECT cidade.nome, uf.nome FROM cidade INNER JOIN uf ON cidade.uf_id = uf.id ORDER BY cidade.nome;

/*7 - Retorne quantas cidades cada estado possui 
dica: veja group by e count()*/

SELECT COUNT(cidade.id), uf.nome FROM cidade INNER JOIN uf ON cidade.uf_id = uf.id GROUP BY uf.nome;

/*
8 - Insira tres pessoas na base de dados. Cada uma destas pessoas deve ter dois enderecos (um comercial e outro residencial). 
As cidades que devem ser usadas são do estado do PR (você escolhe).
*/

INSERT INTO pessoa (nome, documento)
values 
('João Maciel Silva','xxxxxxxxxxxxxx');

INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'João Maciel Silva'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Curitiba'),
'RUA',
'Aleatória porque não conheço nenhuma',
1234,
11111111,
'Residencial');

 INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'João Maciel Silva'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Curitiba'),
'AV',
'Getúlio Vargas',
1234,
11111111,
'Comercial');


INSERT INTO pessoa (nome, documento)
values 
('Arlequino Pinguino Duascarildo','yyyyyyyyyyyyyy');

INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Arlequino Pinguino Duascarildo'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Londrina'),
'RUA',
'Outra Rua Aleatória',
777,
22222222,
'Residencial');

 INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Arlequino Pinguino Duascarildo'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Londrina'),
'AV',
'Getúlio Vargas',
1675,
22222222,
'Comercial');

INSERT INTO pessoa (nome, documento)
values 
('Ciro Lulino Boulos','zzzzzzzzzzzzzz');

INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Ciro Lulino Boulos'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Cidade Canção'),
'RUA',
'Carlos Gomes',
1875,
33333333,
'Residencial');

 INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Ciro Lulino Boulos'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Cidade Canção'),
'AV',
'Kakogawa',
982,
33333333,
'Comercial');


/*9 -Insira duas pessoas na base de dados. Cada uma destas pessoas deve ter dois enderecos (um comercial e outro residencial). 
As cidades que devem ser usadas são do estado de SP (você escolhe).*/

INSERT INTO pessoa (nome, documento)
values 
('Marina Sônia','aaaaaaaaaaaaaa');

INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Marina Sônia'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Buritama'),
'RUA',
'Rivelino',
621,
44444444,
'Residencial');

 INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Marina Sônia'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Buritama'),
'AV',
'Getúlio Vargas',
561,
44444444,
'Comercial');

INSERT INTO pessoa (nome, documento)
values 
('Meire Maria','bbbbbbbbbbbbbb');

INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Meire Maria'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Buritama'),
'RUA',
'Ronaldo Ribeiro',
621,
44444444,
'Residencial');

 INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Meire Maria'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Buritama'),
'AV',
'Getúlio Vargas',
561,
44444444,
'Comercial');


/*10 - Insira duas pessoas na base de dados. Cada uma destas pessoas deve ter um endereco do tipo comercial. As cidades que devem ser usadas são do estado de SC (você escolhe).*/

INSERT INTO pessoa (nome, documento)
values 
('Mauro Pereira','cccccccccccccc');

INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Mauro Pereira'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Blumenau'),
'RUA',
'Everton Robson',
963,
55555555,
'Residencial');

 INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Mauro Pereira'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Blumenau'),
'AV',
'Floriano Peixoto',
11989,
55555555,
'Comercial');

INSERT INTO pessoa (nome, documento)
values 
('Vera Eleonora','dddddddddddddd');

INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Vera Eleonora'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Chapecó'),
'RUA',
'Amarildo',
755,
66666666,
'Residencial');

 INSERT INTO endereco
(pessoa_id,
cidade_id,
tipoLogradouro,
logradouro,
numero,
cep,
tipo)
VALUES
((SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Vera Eleonora'),
(SELECT cidade.id FROM cidade WHERE cidade.nome = 'Chapecó'),
'AV',
'Marechal Deodoro',
1333,
66666666,
'Comercial');

/*11 - Faça um select que retorne o nome das pessoas e seus respectivos enderecos (com cidade e estado). Ordene por nome de pessoa, nome do estado e nome da cidade*/

 SELECT * FROM endereco INNER JOIN pessoa ON pessoa.id = endereco.pessoa_id INNER JOIN cidade ON cidade.id = endereco.cidade_id INNER JOIN uf ON uf.id = cidade.uf_id ORDER BY pessoa.nome;
 SELECT * FROM endereco INNER JOIN pessoa ON pessoa.id = endereco.pessoa_id INNER JOIN cidade ON cidade.id = endereco.cidade_id INNER JOIN uf ON uf.id = cidade.uf_id ORDER BY uf.nome;
 SELECT * FROM endereco INNER JOIN pessoa ON pessoa.id = endereco.pessoa_id INNER JOIN cidade ON cidade.id = endereco.cidade_id INNER JOIN uf ON uf.id = cidade.uf_id ORDER BY cidade.nome;
 
 
 /*12 - remova todas as pessoas que tem endereço da cidade de Ribeirão Preto (atenção: irá gerar um problema de constraint no banco... pessoas sem endereço) */
  
 /*DELETE FROM pessoa WHERE pessoa.id IN (SELECT endereco.pessoa_id FROM endereco WHERE endereco.cidade_id = (SELECT cidade.id FROM cidade WHERE cidade.nome = 'Ribeirão Preto'));*/
 
 
 /*13 - Mude todos os endereços residenciais do sistema. Eles devem ter cep 00000000 */
 
 UPDATE endereco
SET
cep = '00000000'
WHERE endereco.tipo = 'Residencial';

/*14 - altere o nome da coluna prestador_fk para cliente_fk. */

ALTER TABLE recibo CHANGE COLUMN prestador_fk cliente_fk INTEGER;

/*15 - Insira dois recibos sendo que eles devem ter clientes residentes no PR e o prestador de servico deve ser o mesmo (não importando o estado). Exemplo: 
* cliente fusca, da cidade curitiba, no PR. Prestador: DB1, estado PR.
* cliente tamara, da cidade maringá, no PR. Prestador: DB1, estado PR.*/

INSERT INTO recibo
(valor,
cliente_fk,
emitente_fk,
dataemissao,
numero)
VALUES
(150000,
(SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'João Maciel Silva'),
(SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Meire Maria'),
'2018-06-21',
221);


INSERT INTO recibo
(valor,
cliente_fk,
emitente_fk,
dataemissao,
numero)
VALUES
(150000,
(SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Ciro Lulino Boulos'),
(SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Meire Maria'),
'2018-07-14',
631);

/*16 - Insira dois recibos sendo que eles devem ter clientes residentes no PR e prestadores de serviços diferentes. Exemplo: 
* cliente fusca, da cidade curitiba, no PR. Prestador: FCV, estado PR.
* cliente tamara, da cidade maringá, no PR. Prestador: USP, estado SP */

INSERT INTO recibo
(valor,
cliente_fk,
emitente_fk,
dataemissao,
numero)
VALUES
(150000,
(SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'João Maciel Silva'),
(SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Marina Sônia'),
'2018-05-11',
984);


INSERT INTO recibo
(valor,
cliente_fk,
emitente_fk,
dataemissao,
numero)
VALUES
(150000,
(SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Arlequino Pinguino Duascarildo'),
(SELECT pessoa.id FROM pessoa WHERE pessoa.nome = 'Mauro Pereira'),
'2018-03-02',
325);

/*17 - Realize uma consulta na base de dados e exiba os seguintes dados:
* numero do recibo
* data emissao do recibo
* valor do recibo
* nome do cliente 
* estado do cliente
* nome do emitente
* estado do emitente

ordene por data de recibo, nome do cliente e nome do emitente */

SELECT cliente.*, emitente.Emitente, emitente.Estado FROM (

SELECT recibo.numero AS Numero, recibo.valor AS Valor, recibo.dataemissao AS 'Data' , pessoa.nome AS Cliente, uf.nome AS Estado FROM recibo INNER JOIN pessoa ON recibo.cliente_fk = pessoa.id 
INNER JOIN cidade ON cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.cliente_fk) 
INNER JOIN uf ON uf.id IN (SELECT cidade.uf_id FROM cidade WHERE cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.cliente_fk))
) cliente

INNER JOIN (
SELECT recibo.numero AS Numero, pessoa.nome AS Emitente, uf.nome AS Estado FROM recibo INNER JOIN pessoa ON recibo.emitente_fk = pessoa.id 
INNER JOIN cidade ON cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.emitente_fk) 
INNER JOIN uf ON uf.id IN (SELECT cidade.uf_id FROM cidade WHERE cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.emitente_fk))
) emitente

ON cliente.Numero = emitente.Numero ORDER BY cliente.Data;


SELECT cliente.*, emitente.Emitente, emitente.Estado FROM (

SELECT recibo.numero AS Numero, recibo.valor AS Valor, recibo.dataemissao AS 'Data' , pessoa.nome AS Cliente, uf.nome AS Estado FROM recibo INNER JOIN pessoa ON recibo.cliente_fk = pessoa.id 
INNER JOIN cidade ON cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.cliente_fk) 
INNER JOIN uf ON uf.id IN (SELECT cidade.uf_id FROM cidade WHERE cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.cliente_fk))
) cliente

INNER JOIN (
SELECT recibo.numero AS Numero, pessoa.nome AS Emitente, uf.nome AS Estado FROM recibo INNER JOIN pessoa ON recibo.emitente_fk = pessoa.id 
INNER JOIN cidade ON cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.emitente_fk) 
INNER JOIN uf ON uf.id IN (SELECT cidade.uf_id FROM cidade WHERE cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.emitente_fk))
) emitente

ON cliente.Numero = emitente.Numero ORDER BY cliente.Cliente;

SELECT cliente.*, emitente.Emitente, emitente.Estado FROM (

SELECT recibo.numero AS Numero, recibo.valor AS Valor, recibo.dataemissao AS 'Data' , pessoa.nome AS Cliente, uf.nome AS Estado FROM recibo INNER JOIN pessoa ON recibo.cliente_fk = pessoa.id 
INNER JOIN cidade ON cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.cliente_fk) 
INNER JOIN uf ON uf.id IN (SELECT cidade.uf_id FROM cidade WHERE cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.cliente_fk))
) cliente

INNER JOIN (
SELECT recibo.numero AS Numero, pessoa.nome AS Emitente, uf.nome AS Estado FROM recibo INNER JOIN pessoa ON recibo.emitente_fk = pessoa.id 
INNER JOIN cidade ON cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.emitente_fk) 
INNER JOIN uf ON uf.id IN (SELECT cidade.uf_id FROM cidade WHERE cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.emitente_fk))
) emitente

ON cliente.Numero = emitente.Numero ORDER BY emitente.Emitente;


/*18 - Faça uma consulta que mostre:
* quantidade de recibos emitidos no PR
* valor total de recibos emitidos no PR*/


SELECT COUNT(recibos.Estado) FROM (
SELECT uf.nome AS Estado FROM recibo INNER JOIN pessoa ON recibo.emitente_fk = pessoa.id 
INNER JOIN cidade ON cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.emitente_fk) 
INNER JOIN uf ON uf.id IN (SELECT cidade.uf_id FROM cidade WHERE cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.emitente_fk))
)recibos
WHERE recibos.Estado = 'PR';


SELECT sum(recibos.Valor) FROM (
SELECT recibo.valor AS Valor FROM recibo INNER JOIN pessoa ON recibo.emitente_fk = pessoa.id 
INNER JOIN cidade ON cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.emitente_fk) 
INNER JOIN uf ON uf.id IN (SELECT cidade.uf_id FROM cidade WHERE cidade.id IN (SELECT endereco.cidade_id FROM endereco WHERE endereco.pessoa_id = recibo.emitente_fk))
)recibos;

