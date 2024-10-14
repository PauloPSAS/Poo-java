<h1>Exercício 1</h1>

Crie uma classe <code>Estudante</code> com atributos para nome, matrícula e três notas.
Implemente métodos para calcular a média das notas e determinar se o aluno foi aprovado ou reprovado,
considerando que a média para ser aprovado é 70. Crie objetos Estudante e imprima informações dos objetos.
<ul>
    <li> A classe <code>Estudante</code> deve possuir o construtor <code>Estudante(String nome, 
    int matricula, double n1, double n2, double n3)</code>.</li>
    <li>A classe <code>Estudante</code> deve possuir o método <code>double getMedia()</code> 
    que retorna o cálculo da média das notas do estudante.</li>
    <li>A classe <code>Estudante</code> deve possuir um método <code>void setNotas(double n1, double n2, double n3)</code>
    para definir as três notas de uma vez</li>
    <li>A classe <code>Estudante</code> deve possuir métodos <code>double getNota1()</code>,
    <code>double getNota2()</code> e <code>double getNota3()</code></li>
    <li>Crie uma exceção <code>NotaInvalidaException</code>,
    que deve ser lançada quando uma nota negativa é passada para os métodos que recebem nota</li>
    <li>Crie um caso de teste para testar o método <code>double getMedia()</code></li>
    <li>Crie um caso de teste para testar os métodos <code>void setNotas(double n1, double n2, double n3)</code>>,
    <code>double getNota1()</code>, <code>double getNota2()</code> e <code>double getNota3()</code></li>
</ul>