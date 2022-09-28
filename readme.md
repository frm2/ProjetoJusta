# Desafio Justa
Seguem as minhas respostas para o projeto passado pela Justa.
## Desafio 1: Encontre as interseções
O seguinte desafio pede que receba um parâmetro de uma lista de String contendo dois elementos. Cada elemento contém uma string com sequência de números ordenados de forma crescente. O objetivo é retornar uma String contendo os números ordenados que aparecem nas duas listas.

Exemplos:
```
Entrada: ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"]
Saída: 1,4,13

Entrada: ["1, 3, 9, 10, 17, 18", "1, 4, 9, 10"]
Saída: 1,9,10
```
## Desafio 2: Palavra mais longa
Deve-se uma função, que receba uma String e retorne a palavra mais longa desta String.

Regras do programa:
- Se houver duas ou mais palavras com o mesmo comprimento, retorne a primeira palavra mais longa da String.
- Ignore as pontuações e a situação em que a String será vazia.
- As palavras também podem conter números, mas somente as letras serão consideradas no tamanho da palavra.
### Observações
Não tinha certeza como se deveria tratar retornar uma string que possuia dígitos como a resposta correta (se era para incluir os dígitos na entrega ou não). Então tomei a decisão de entregar a string como ela se encontra na entrada, apesar de o seu tamanho ser considerado sem os dígitos.

Ilustração:
```
Entrada: "Justino123 é o mascote da Justa"
Saída1: Justino123
Saída2: Justino
```
Nesse exemplo acima, o meu programa entregaria a Saída1.