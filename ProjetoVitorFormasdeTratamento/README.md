# tarefa-cinco
<b> Quinto exercício do Curso de Orientação a Objetos com Java, oferecido pelo Instituto Tecnológico da Aeronáutica 
em parceria com o Coursera. </b>

<b>Enunciado: </b> </br>
Crie uma interface chamada FormatadorNome que possui o método String formatarNome(String nome, String sobrenome).

Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome e uma instância de FormatadorNome. Essa classe deve possuir um método getTratamento() que delega a formatação do nome para a instância de FormatadorNome.

Crie a seguintes implementações da interface FormatadorNome: </br>
</br>
Informal: retorna somente o primeiro nome </br>
Respeitoso: deve receber em seu construtor a informação se é masculino ou feminino, e retornar "Sr." ou "Sra." seguido do sobrenome</br>
ComTítulo: deve receber em seu construtor o título e retornar o título seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral"</br>
Crie testes de unidade que fazem os testes da classe Autoridade com cada uma das implementações da interface.</br>
</br>
<b> IDE Eclipse </b>
