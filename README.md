# Compiladores-Trabalho-II
Esta versão faz as análises léxica, sintática e semântica.  
Ela está de acordo com a gramática abaixo.  

## Gramática Modificada
PROGRAM     ::= programa ID BLOCK '.' EOF  
BLOCK       ::= inicio STMTS fim  
STMTS       ::= STMT; STMTS | ε  
STMT        ::= BLOCK | DECL | ASSIGN | WRITE | IF  
DECL        ::= TYPE ID  
ASSIGN      ::= ID = EXPR | ID += EXPR | ID -= EXPR | ID *= EXPR  
WRITE       ::= escreva(ID)  
IF          ::= se (EXPR) STMT  
EXPR        ::= EXPR "|" REL | REL  
REL         ::= REL < ARITH | REL <= ARITH | REL > ARITH | ARITH  
ARITH       ::= ARITH + TERM | ARITH - TERM | TERM  
TERM        ::= TERM * FACTOR | FACTOR  
FACTOR      ::= (EXPR) | LIT_INT | LIT_REAL | LIT_BOOL | ID  

## Definições Regulares
LETTER      ::= a | b | ... | z | A | B | ... | Z | _  
DIGIT       ::= 0 | 1 | ... | 9  
ID          ::= LETTER (LETTER | DIGIT)*  
LIT_INT     ::= DIGIT+ | 0b(0|1)+  
LIT_REAL    ::= DIGIT+ . DIGIT+  
LIT_BOOL    ::= verdadeiro | falso  
TYPE        ::= inteiro | real | booleano

## Como executar o código

1. **Navegue até a pasta do código-fonte:**
   ```
   cd /c/Compiladores-Trabalho-II/src
   ```

2. **Compile o projeto:**
   ```
   javac dl/DL.java
   ```

3. **Volte para a pasta raiz:**
   ```
   cd /c/Compiladores-Trabalho-II
   ```

4. **Execute o analisador:**
   ```
   java -cp src dl.DL
   ```