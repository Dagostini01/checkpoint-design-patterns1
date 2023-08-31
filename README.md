# checkpoint-design-patterns1
# Projeto Hambúrguer Decorator

Este é um exemplo simples de um projeto Java que demonstra o uso do padrão de design **Decorator**. O projeto simula um sistema de pedidos de hambúrgueres em um restaurante, onde os hambúrgueres podem ser personalizados com ingredientes extras.

## Estrutura do Projeto

O projeto é estruturado da seguinte maneira:

- `src/`: Diretório principal contendo o código-fonte Java.
  - `Main.java`: Arquivo de ponto de entrada do programa.
  - `Hamburger.java`: Interface que define o componente base Hambúrguer.
  - `BasicHamburger.java`: Implementação da classe básica de Hambúrguer.
  - `HamburgerDecorator.java`: Interface para os decoradores de Hambúrguer.
  - `CheeseDecorator.java`, `BaconDecorator.java`, `LettuceDecorator.java`: Implementações de decoradores de ingredientes.
  - `SizedHamburgerDecorator.java`: Implementação do decorador que adiciona tamanhos aos hambúrgueres.
  
## Como Executar

1. Certifique-se de ter o Java JDK instalado no seu sistema.
2. Clone ou baixe este repositório.
3. Abra o projeto no IntelliJ IDEA (ou sua IDE preferida).
4. Navegue até o arquivo `Main.java`.
5. Execute o método `main` para ver os resultados no console.

## Exemplo de Uso

```java
Hamburger basicHamburger = new BasicHamburger();
Hamburger cheeseLettuceHamburger = new LettuceDecorator(new CheeseDecorator(new BasicHamburger()));

System.out.println("Preço: " + basicHamburger.getPrice() + "; Descrição: " + basicHamburger.getDescription());
System.out.println("Preço: " + cheeseLettuceHamburger.getPrice() + "; Descrição: " + cheeseLettuceHamburger.getDescription());
