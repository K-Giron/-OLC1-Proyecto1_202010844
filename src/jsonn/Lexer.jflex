

// ------------  Paquete e importaciones ------------
package jsonn; 

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

decimal=[0-9]+(\.[0-9]+)?
textoentrecomillas=[\"]([^\"\n]|(\\\"))*[\"]
comentariosimple="//".*
comentariomultiple=\/\/.|\/\*[\s\S]*?\*\/




%%
// ------------  Reglas Lexicas -------------------


":"         { return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());  }
","        { return new Symbol(sym.COMA, yycolumn, yyline, yytext());  }
"{"        { return new Symbol(sym.LLAVE_A, yycolumn, yyline, yytext());  }
"}"        { return new Symbol(sym.LLAVE_C, yycolumn, yyline, yytext());  }



{decimal}  { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext()); }
{textoentrecomillas} { return new Symbol(sym.TEXTOENTRECOMILLAS, yycolumn, yyline, yytext()); }



//------> Ignorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}
{comentariosimple} { /* Comentario simple se ignora */ }
{comentariomultiple} { /* Comentario múltiple se ignora */ }


//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);
                    data.Info.listaErroresJson.add(new data.Error("Error Lexico", "No reconocido el caracter: "+ yytext() ,
                    yyline, yycolumn));
                     }


