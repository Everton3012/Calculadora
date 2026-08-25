# Calculadora Java

Este é um projeto de uma calculadora simples desenvolvida em Java utilizando a biblioteca Swing para a interface gráfica.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **`src`**: Contém os arquivos-fonte do projeto.
- **`bin`**: Contém os arquivos compilados.
- **`lib`**: Pasta para dependências externas (se houver).
- **`.vscode`**: Configurações do Visual Studio Code.

## Funcionalidades

- Operações básicas: soma, subtração, multiplicação e divisão.
- Botões para números e comandos como "AC" (limpar), "+/-" (inverter sinal) e "," (vírgula para números decimais).
- Interface gráfica simples e funcional.

## Classes Principais

- **`Calculadora`**: Classe principal que inicializa a aplicação.
- **`Display`**: Responsável por exibir o valor atual da calculadora.
- **`Teclado`**: Contém os botões da calculadora e gerencia as ações dos mesmos.
- **`Botao`**: Representa um botão personalizado.
- **`Memoria`**: Gerencia os cálculos e o estado da calculadora.
- **`MemoriaObservador`**: Interface para observar mudanças no valor exibido.

## Como Executar

1. Certifique-se de ter o [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Compile o projeto:
   ```bash
   javac -d bin -sourcepath src src/br/com/Everton3012/calc/visao/Calculadora.java