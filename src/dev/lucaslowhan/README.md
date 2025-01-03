# Exercícios de Programação em Java - Classes, Objetos e Métodos

Este repositório contém uma série de exercícios para iniciantes em Java, focando no uso de **Classes**, **Objetos** e **Métodos**. Os exercícios têm o objetivo de ajudar a reforçar conceitos fundamentais de programação orientada a objetos.

## Exercícios

### 1. **Classe `Carro`**
Crie uma classe chamada `Carro` que possui os seguintes atributos:
- `marca` (String)
- `modelo` (String)
- `ano` (int)
- `cor` (String)

A classe deve ter os seguintes métodos:
- **Método `ligar()`**: Imprime "O carro está ligado."
- **Método `desligar()`**: Imprime "O carro está desligado."
- **Método `exibirInformacoes()`**: Exibe todos os atributos do carro.

**Objetivo:**  
Criar um objeto da classe `Carro`, ligar o carro e exibir suas informações.

---

### 2. **Classe `ContaBancaria`**
Crie uma classe chamada `ContaBancaria` com os seguintes atributos:
- `numeroConta` (String)
- `saldo` (double)

A classe deve ter os seguintes métodos:
- **Método `depositar(double valor)`**: Adiciona um valor ao saldo.
- **Método `sacar(double valor)`**: Subtrai um valor do saldo, desde que o saldo seja suficiente.
- **Método `exibirSaldo()`**: Exibe o saldo atual.

**Objetivo:**  
Criar um objeto da classe `ContaBancaria`, realizar um depósito, efetuar um saque e exibir o saldo.

---

### 3. **Classe `Pessoa`**
Crie uma classe chamada `Pessoa` com os seguintes atributos:
- `nome` (String)
- `idade` (int)
- `cpf` (String)

A classe deve ter os seguintes métodos:
- **Método `fazerAniversario()`**: Aumenta a idade em 1.
- **Método `exibirDados()`**: Exibe nome, idade e CPF da pessoa.

**Objetivo:**  
Criar um objeto da classe `Pessoa`, fazer a pessoa completar um aniversário e exibir os dados dela.

---

### 4. **Classe `Produto`**
Crie uma classe chamada `Produto` com os seguintes atributos:
- `nome` (String)
- `preco` (double)
- `quantidadeEmEstoque` (int)

A classe deve ter os seguintes métodos:
- **Método `vender(int quantidade)`**: Subtrai a quantidade vendida do estoque.
- **Método `repor(int quantidade)`**: Adiciona uma quantidade ao estoque.
- **Método `exibirDetalhes()`**: Exibe o nome, preço e a quantidade em estoque do produto.

**Objetivo:**  
Criar um objeto da classe `Produto`, realizar uma venda e uma reposição de estoque, e exibir os detalhes do produto.

---

### 5. **Classe `Livro`**
Crie uma classe chamada `Livro` com os seguintes atributos:
- `titulo` (String)
- `autor` (String)
- `numeroDePaginas` (int)
- `preco` (double)

A classe deve ter os seguintes métodos:
- **Método `exibirDetalhes()`**: Exibe o título, autor, número de páginas e preço do livro.
- **Método `desconto(double percentual)`**: Aplica um desconto no preço do livro com base em um percentual fornecido como argumento.

**Objetivo:**  
Criar um objeto da classe `Livro`, exibir seus detalhes e aplicar um desconto no preço.

---

## Como Rodar os Exercícios

1. Clone este repositório para o seu computador:
   ```bash
   git clone https://github.com/seuusuario/exercicios-java.git
