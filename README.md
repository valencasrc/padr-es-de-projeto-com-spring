Projeto de Demonstração de Padrões de Projeto com Spring
Este projeto demonstra a implementação de alguns padrões de projeto clássicos do GoF (Gang of Four) e abstrações do Spring Framework.

Padrões de Projeto Implementados:
Singleton: Garante que uma classe tenha apenas uma instância e que esta possa ser acessada globalmente.
Strategy: Permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis.
Facade: Fornece uma interface simplificada para um sistema complexo.
API REST: Implementa uma API RESTful para acesso aos recursos do sistema.
Tecnologias Utilizadas:
Java 17
Spring Boot 3.0.0
Maven
Lombok
Estrutura do Projeto:

src/main/java
├── com
│   ├── example
│   │   ├── service
│   │   │   ├── CalculadoraService.java
│   │   │   ├── CalculadoraServiceImpl.java
│   │   │   └── CalculadoraFacade.java
│   │   ├── model
│   │   │   ├── Operacao.java
│   │   │   ├── Soma.java
│   │   │   └── Subtracao.java
│   │   └── controller
│   │       └── CalculadoraController.java
│   ├── config
│   │   ├── CalculadoraConfig.java
│   │   └── ApplicationConfig.java
│   └── util
│       └── Singleton.java
└── com
    └── example
        └── CalculadoraApplication.java

# Projeto de Demonstração de Padrões de Projeto com Spring

Este projeto demonstra a implementação de alguns padrões de projeto clássicos do GoF (Gang of Four) e abstrações do Spring Framework.

## Padrões de Projeto Implementados:

* **Singleton:** Garante que uma classe tenha apenas uma instância e que esta possa ser acessada globalmente.
* **Strategy:** Permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis.
* **Facade:** Fornece uma interface simplificada para um sistema complexo.
* **API REST:** Implementa uma API RESTful para acesso aos recursos do sistema.

## Tecnologias Utilizadas:

* Java 17
* Spring Boot 3.0.0
* Maven
* Lombok

## Executando o Projeto:

1. Clone o repositório.
2. Execute `mvn clean install` para construir o projeto.
3. Execute `mvn spring-boot:run` para iniciar a aplicação.
4. Acesse a API REST em `http://localhost:8080/somar/10/5` para somar 10 e 5.
5. Acesse a API REST em `http://localhost:8080/subtrair/10/5` para subtrair 10 e 5.

## Licença

Este projeto está licenciado sob a licença MIT.

        
