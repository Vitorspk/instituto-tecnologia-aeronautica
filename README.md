# ITA - Instituto de Tecnologia Aeronáutica - Java Programming Projects

## Overview

This repository contains a comprehensive collection of Java programming projects and exercises developed for educational purposes at ITA (Instituto de Tecnologia Aeronáutica). The projects demonstrate fundamental to intermediate Java programming concepts including Object-Oriented Programming (OOP), inheritance, interfaces, exception handling, and design patterns.

## Repository Structure

The repository is organized into multiple project folders, each focusing on specific programming concepts:

### Core Programming Concepts

#### **AntesDepois**
- Demonstrates before/after state manipulation patterns
- Focus on state changes and temporal operations

#### **Banco (Banking System)**
- Implementation of a simple banking system
- Classes: `ContaCorrente` (Checking Account) and `ContaEspecial` (Special Account)
- Demonstrates inheritance and method overriding
- Basic operations: deposits, withdrawals, and balance management

#### **CadeiaConstrutores (Constructor Chaining)**
- Demonstrates constructor chaining in Java
- Multi-level inheritance hierarchy
- Classes: `Veiculo` → `Carro` with constructor propagation
- Illustrates object initialization patterns

#### **Carros (Racing Cars)**
- Abstract class implementation with `CarroDeCorrida`
- Concrete implementations: `CarroSoma` and `CarroMult`
- Racing simulation with different acceleration strategies
- Unit tests included for validation

#### **Comercio (Commerce)**
- Shopping and purchase management system
- `Compra` class with payment calculations
- Demonstrates composition and aggregation patterns

#### **Concurso (Competition/Contest)**
- Candidate management system
- Scoring and ranking functionality
- Data structure usage for participant management

#### **Escola (School Management)**
- Student management system with `Aluno` class
- Grade verification system (`VerificadoraNotas`)
- Educational records handling

#### **Excecoes (Exception Handling)**
- Custom exception creation and handling
- Error management best practices
- Try-catch-finally patterns demonstration

#### **ExperienciaAcesso (Access Modifiers)**
- Package structure: `pacote` and `outro`
- Demonstrates Java access modifiers (public, private, protected, package-private)
- Cross-package access patterns

#### **Interfaces**
- Interface definition and implementation
- `Barulhento` (Noisy) interface
- Multiple implementations: `Carro`, `Cachorro`, `Vuvuzela`, `Bateria`
- Demonstrates polymorphism through interfaces

#### **Login (Authentication System)**
- User authentication implementation
- Custom `LoginException` for authentication errors
- `Autenticador` class for credential validation
- Security pattern implementation

#### **PilhaEncapsulada (Encapsulated Stack)**
- Stack data structure implementation
- Encapsulation principles
- LIFO (Last In, First Out) operations
- Data hiding and controlled access

### Student Projects

#### **ProjetoVitorIMC (BMI Calculator)**
- Body Mass Index (BMI) calculator
- `Paciente` class with weight and height attributes
- Diagnostic system based on BMI ranges
- Health classification implementation

#### **ProjetoVitorPizza (Pizza Shop)**
- Pizza ordering system
- Dynamic pricing based on ingredients
- Shopping cart functionality
- Ingredient tracking with HashMap

#### **ProjetoVitorCompra (Purchase System)**
- Purchase management with installment payments
- `CompraParcelada` extending base `Compra` class
- Financial calculations and payment scheduling

#### **ProjetoVitorDatas (Date Management)**
- Date and time operations
- Age calculation and zodiac sign determination
- `Pessoa` and `Relogio` classes
- Unit tests for date operations

#### **ProjetoVitorFormasdeTratamento (Name Formatting)**
- Name formatting system with different treatment styles
- Strategy pattern implementation
- Interfaces: `FormatadorNome`, `Informal`, `Respeitoso`, `ComTitulo`
- `Autoridade` class for formal titles

#### **ProjetoTesteClassePizzaECarrinhoDeCompras (Pizza & Shopping Cart Tests)**
- Comprehensive testing suite
- Unit tests for Pizza and Shopping Cart classes
- Test-driven development examples

### Additional Features

#### **pontuacao (Points System)**
- User points and bonus calculation system
- `RegistroPontos` for tracking user achievements
- `CalculadoraBonus` for bonus computation
- Gamification patterns

## Technical Stack

- **Language**: Java
- **Concepts Covered**:
  - Object-Oriented Programming (OOP)
  - Inheritance and Polymorphism
  - Abstract Classes and Interfaces
  - Exception Handling
  - Design Patterns (Strategy, Factory, etc.)
  - Data Structures (Stack, HashMap, ArrayList)
  - Unit Testing
  - Encapsulation and Access Control

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or text editor
- Basic understanding of Java programming

### Installation

1. Clone the repository:
```bash
git clone https://github.com/Vitorspk/instituto-tecnologia-aeronautica.git
```

2. Navigate to any project folder:
```bash
cd instituto-tecnologia-aeronautica/[ProjectName]
```

3. Compile the Java files:
```bash
javac src/*.java
```

4. Run the main class (usually `Principal.java` or test classes):
```bash
java -cp src Principal
```

## Project Structure Pattern

Most projects follow this structure:
```
ProjectName/
├── src/
│   ├── Main classes (.java files)
│   └── Supporting classes
└── teste/ (when applicable)
    └── Test classes
```

## Usage Examples

### Banking System Example
```java
ContaCorrente conta = new ContaCorrente();
conta.depositar(1000);
conta.sacar(500);
```

### BMI Calculator Example
```java
Paciente paciente = new Paciente(70.0, 1.75);
double imc = paciente.calcularIMC();
String diagnostico = paciente.diagnostico();
```

### Pizza Ordering Example
```java
Pizza pizza = new Pizza();
pizza.adicionaIngrediente("Mozzarella");
pizza.adicionaIngrediente("Tomato");
double preco = pizza.getPreco();
```

## Learning Objectives

This repository serves as a comprehensive learning resource for:

1. **Java Fundamentals**: Variables, data types, control structures
2. **OOP Principles**: Classes, objects, inheritance, polymorphism
3. **Software Design**: Clean code, SOLID principles, design patterns
4. **Testing**: Unit testing, test-driven development
5. **Real-world Applications**: Banking, e-commerce, health systems

## Contributing

This is an educational repository. If you're a student or educator interested in contributing:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/NewProject`)
3. Commit your changes (`git commit -m 'Add new educational project'`)
4. Push to the branch (`git push origin feature/NewProject`)
5. Open a Pull Request

## License

This repository is for educational purposes. Please check with ITA for specific usage rights and academic policies.

## Author

**Vitor Schiavo** - Initial work and project development

## Acknowledgments

- Instituto de Tecnologia Aeronáutica (ITA) for the educational framework
- Java programming instructors and mentors
- Fellow students for collaboration and feedback

## Contact

For questions or suggestions regarding this educational repository, please open an issue or contact through GitHub.

---

*This repository represents academic work and learning exercises in Java programming at ITA.*