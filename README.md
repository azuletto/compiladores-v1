<div style="background-color: #f4f4f4; padding: 20px; border-radius: 5px;">
  <h1 style="text-align: center;">DAS Compiler</h1>
  <p>DAS Compiler é um compilador desenvolvido com a ferramenta ANTLR4 que tem a capacidade de compilar uma linguagem de programação personalizada chamada Linguagem DAS.</p>

  <h2>Como compilar a Linguagem DAS?</h2>
  <p>Para compilar a Linguagem DAS, você precisa usar o seguinte comando:</p>

  <pre><code>antlr4 -Dlanguage=CSharp DAS.g4</code></pre>
  <p>Este comando irá gerar a pasta Grammar contendo LangLexer.cs, LangParser.cs e LangVisitor.cs.</p>

  <h2>Sintaxe da Linguagem DAS</h2>
  <p>A linguagem de programação DAS possui as seguintes estruturas de controle:</p>

  <h3>Input and Output Commands</h3>
  <pre><code>
    write "message";
    read variable;
  </code></pre>

  <p>If the input does not respect the type, a loop starts to verify the type until the type is correct.</p>

  <h3>FOR loop</h3>
  <pre><code>
    for(variable; condition; increment){
    //code block
    }
  </code></pre>

  <h3>WHILE loop</h3>
  <pre><code>
    while(condition){
    //code block
    }
  </code></pre>

  <h3>DO-WHILE loop</h3>
  <pre><code>
    do {
    //code block
    } while(condition);
  </code></pre>

  <h3>IF-ELSE decision structure</h3>
  <pre><code>
    if(condition){
    //code block
    } else {
    //code block
    }
  </code></pre>

  <h2>Example of DAS Language Program</h2>
  <pre><code>
function multiplicacao(num1, num2,num3){
    write num1 * num2 / num3;
}

write "Digite o primeiro número:";
read num1;
write "Digite o segundo número:";
read num2;
write "Digite o terceiro número:";
read num3;

write "Chamando a função multiplicacao";
multiplicacao(num1,num2,num3);

function CalcFatorial (fatorial,n){

      for (numero i = 1;i <= n; numero i = (i + 1)) {
          numero fatorial = fatorial * i;
        }

      write fatorial;

}

numero fatorial = 1;
write "fatorial de quanto?";
numero read n;

write "chamando a função CalcFatorial...";
CalcFatorial(fatorial, n);

write "informe um número:";
numero read x;
write "informe outro número:";
numero read y;

write "começo do FOR";
for(numero i; i < 10; numero i = i + 1){
    numero x = (x + 1);
    write x;
};

write "informe um número:";
numero read x;
write "informe outro número:";
numero read y;

write "começo do WHILE";
while(i < 10){
    numero x = (x + 1);
    write x;
};

write "informe um número:";
numero read x;
write "informe outro número:";
numero read y;

write "Começo DoWhile";
do {
    numero x = x + 1;
    write x;
}
while (i < 10);

write "informe um número:";
numero read x;
write "informe outro número:";
numero read y;
if (x > y) then {
  write "X é maior que Y";
} else { 
  if (x < y) then {
    write "Y é maior que X";
  } else {
    write "Y e X são iguais"; 
  }
}
  </code></pre>

  <h2>Conclusion</h2>
 <h1 align="center">Relatório de Construção do DAS Compiler com ANTLR4</h1>
<p align="justify">O processo de construção do DAS Compiler utilizando o ANTLR4 foi uma experiência robusta e esclarecedora. ANTLR (ANother Tool for Language Recognition) é uma ferramenta amplamente utilizada para gerar analisadores sintáticos a partir de gramáticas formais escritas em uma notação específica.</p>
    
<h2>Definição da Gramática DAS</h2>
<p>A primeira etapa envolveu a definição da gramática da linguagem DAS, incluindo suas regras sintáticas e semânticas. Isso incluiu a identificação de tokens, regras de produção e estruturas de controle da linguagem.</p>

<h2>Utilização do ANTLR4 para Gerar Analisadores</h2>
<p>O ANTLR4 foi usado para processar a gramática DAS e gerar analisadores sintáticos automaticamente. Isso incluiu a definição de lexer e parser, responsáveis por tokenizar e analisar a entrada de acordo com a gramática definida.</p>

<h2>Implementação de Visitantes e Listeners</h2>
<p>Com base nos analisadores gerados pelo ANTLR4, implementamos visitantes e listeners personalizados para percorrer a árvore de análise sintática. Isso permitiu a execução de ações específicas em resposta a estruturas sintáticas encontradas durante a análise do código-fonte DAS.</p>

<h2>Tratamento de Erros e Recuperação de Falhas</h2>
<p>Implementamos estratégias para lidar com erros sintáticos durante a compilação, permitindo uma recuperação suave em caso de entrada inválida. Isso foi crucial para melhorar a experiência do usuário e fornecer feedback claro sobre possíveis problemas no código fonte.</p>

<h2>Geração de Código Executável</h2>
<p>Por fim, utilizamos os dados analisados e processados pelo ANTLR4 para gerar código executável em C#, permitindo que os programas escritos na linguagem DAS fossem compilados e executados em ambientes compatíveis.</p>

<p>No geral, a construção do DAS Compiler com o ANTLR4 demonstrou a eficácia dessa ferramenta na geração de analisadores sintáticos e na simplificação do processo de desenvolvimento de compiladores. O ANTLR4 proporcionou uma abordagem estruturada e eficiente para lidar com a complexidade da análise sintática, permitindo a criação de um compilador funcional e robusto para a linguagem DAS.</p>

</div>
```
