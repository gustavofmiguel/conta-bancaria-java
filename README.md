# 🏦 Conta Bancária — Simulador em Java

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Tipo](https://img.shields.io/badge/Tipo-Exercício%20de%20Estudo-blue?style=flat)

Projeto desenvolvido como exercício prático. O objetivo é simular operações básicas de uma conta bancária via terminal, aplicando conceitos fundamentais de Orientação a Objetos em Java.

---

## 📋 Funcionalidades

| # | Operação | Descrição |
|---|----------|-----------|
| 1 | **Consultar saldo** | Exibe o saldo atual da conta |
| 2 | **Consultar cheque especial** | Exibe o limite disponível do cheque especial |
| 3 | **Depositar** | Adiciona valor ao saldo com regras de atualização do limite |
| 4 | **Sacar** | Debita valor do saldo, podendo usar o cheque especial |
| 5 | **Pagar boleto** | Realiza pagamento com validação de saldo disponível |
| 6 | **Verificar cheque especial** | Informa se a conta está no negativo |
| 0 | **Sair** | Encerra o programa |

---

## 🧠 Conceitos de POO Aplicados

- **Encapsulamento** — atributos `private` com acesso via getters públicos
- **Construtores** — inicialização de objetos com parâmetros
- **Métodos de instância** — comportamentos coesos na classe `Conta`
- **Separação de responsabilidades** — `Main` cuida da interface; `Conta` cuida da lógica

---

## 🔍 Detalhes de Implementação

**Regras de negócio implementadas:**

- **Depósito < R$ 500** → saldo aumenta e limite do cheque especial sobe R$ 50
- **Depósito ≥ R$ 500** → saldo aumenta e limite sobe 50% do valor depositado
- **Saque / Boleto** → permitido até `saldo + limiteChequeEspecial`
- **Cheque especial ativo** → quando `saldo < 0`

### `Main.java`

Menu interativo com loop `do-while` e `switch-case`, usando `Scanner` para leitura de entrada do usuário. Valores monetários formatados com `printf("%.2f")`.


---

## 📚 Aprendizados

Este exercício reforçou na prática:

- A importância do `break` em estruturas `switch-case`
- Como definir corretamente condições de contorno (`>=` vs `>`)
- A diferença entre **estado de negócio** (saldo negativo) e **limiar arbitrário** na modelagem de regras
- Boas práticas de encapsulamento em Java
