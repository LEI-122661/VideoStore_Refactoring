# VideoStore Refactoring

Exemplo de projeto Java de refatoração de videoclube.

## Estrutura
- `src/` contém o código-fonte (várias versões de refactoring).
- `lib/` contém dependências externas (db4o jar).
- `database/` contém base de dados de exemplo.

## Como compilar e correr (linha de comando)

```bash
# Compilar
javac -cp lib/db4o-8.0.249.16098-core-java5.jar -d out $(find src -name "*.java")

# Executar (exemplo com a versão demo)
java -cp out:lib/db4o-8.0.249.16098-core-java5.jar demo.Main
```

## Notas
- Projeto inicialmente criado em Eclipse, adaptado para IntelliJ/Java puro.
- Usa encoding UTF-8.
