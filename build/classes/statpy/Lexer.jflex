

// ------------  Paquete e importaciones ------------
package statpy; 

import java_cup.runtime.*;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase

%{ 
%} 

// ------> Expresiones Regulares 

entero = [0-9]+
decimal=[0-9]+(\.[0-9]+)?
identificador = [a-zA-z][a-zA-z0-9_]*
textoentrecomillas=[\"]([^\"\n]|(\\\"))*[\"]




%%
// ------------  Reglas Lexicas -------------------

"*"         { return new Symbol(sym.POR, yycolumn, yyline, yytext());}
"/"         { return new Symbol(sym.DIVISION, yycolumn, yyline, yytext());}
"+"         { return new Symbol(sym.MAS, yycolumn, yyline, yytext());}
"-"         { return new Symbol(sym.MENOS, yycolumn, yyline, yytext());}
">"         { return new Symbol(sym.MAYOR, yycolumn, yyline, yytext());}
"<"         { return new Symbol(sym.MENOR, yycolumn, yyline, yytext());}
">="         { return new Symbol(sym.MAYORIGUAL, yycolumn, yyline, yytext());}
"<="         { return new Symbol(sym.MENORIGUAL, yycolumn, yyline, yytext());}
"=="         { return new Symbol(sym.IGUALIGUAL, yycolumn, yyline, yytext());}     
"!="         { return new Symbol(sym.DISTINTO, yycolumn, yyline, yytext());}
"&&"         { return new Symbol(sym.AND, yycolumn, yyline, yytext());}     
"||"         { return new Symbol(sym.OR, yycolumn, yyline, yytext());} 
"!"         { return new Symbol(sym.NOT, yycolumn, yyline, yytext());} 

//   --- Palabras y variables
"if"        { return new Symbol(sym.IF, yycolumn, yyline, yytext());} 
"else"    { return new Symbol(sym.ELSE, yycolumn, yyline, yytext());} 


"("         { return new Symbol(sym.PARENTESIS_A, yycolumn, yyline, yytext());}
")"         { return new Symbol(sym.PARENTESIS_C, yycolumn, yyline, yytext());}
";"         { return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext());}
"."         { return new Symbol(sym.PUNTO, yycolumn, yyline, yytext());  }
"\'"        { return new Symbol(sym.APOSTROFE, yycolumn, yyline, yytext());  }
"{"        { return new Symbol(sym.LLAVE_A, yycolumn, yyline, yytext());  }
"}"        { return new Symbol(sym.LLAVE_C, yycolumn, yyline, yytext());  }


"="         { return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());}
"mostrar"   { return new Symbol(sym.MOSTRAR, yycolumn, yyline, yytext());}
"console"   { return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext());}
"write"     { return new Symbol(sym.WRITE, yycolumn, yyline, yytext());}
"true"   { return new Symbol(sym.TRUE, yycolumn, yyline, yytext());}
"false"     { return new Symbol(sym.FALSE, yycolumn, yyline, yytext());}
"int"     { return new Symbol(sym.INT, yycolumn, yyline, yytext());}
"double"   { return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext());}
"char"     { return new Symbol(sym.CHAR, yycolumn, yyline, yytext());}
"bool"   { return new Symbol(sym.BOOL, yycolumn, yyline, yytext());}
"string"     { return new Symbol(sym.STRING, yycolumn, yyline, yytext());}


{entero}  { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{decimal}  { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext()); }
{identificador}  { return new Symbol(sym.ID, yycolumn, yyline, yytext()); }
{textoentrecomillas} { return new Symbol(sym.TEXTOENTRECOMILLAS, yycolumn, yyline, yytext()); }



//------> Ignorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);
                    data.Info.listaErrores.add(new data.Error("Error Lexico", "No reconocido el caracter "+ yytext() ,
                    yyline, yycolumn));
                     }

