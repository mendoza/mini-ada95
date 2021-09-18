package picoada;

import java_cup.runtime.Symbol;
import static picoada.Tokens.*;
import java.util.LinkedList;
%%

%unicode
%cup
%class LexerCup
%int
%line
%column
%type java_cup.runtime.Symbol

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

//Tipos de datos
digit=[0-9]
letter = [a-zA-Z]
Integer = {digit}+ ("_"{digit}+)* {digit}+ | {digit}+
Float = {digit}+"."{digit}+
Boolean = "True" | "False"

//Caracteres especiales
espacio  = [ \n\r\t]+
comma = ","
punto="."
puntos = ":"
puntoC = ";"
parentesisA = "("
parentesisC = ")"
abrirC = "<"
cerrarC = ">"
bracketA = "["
bracketC = "]"
EOL = [\r|\n|\r\n]

//Operadores
assignment = ":="
equals = "="
not = "/="
and="and"
or="or"
OpeR = {not}|{equals}|"<"|">"|"<="|">="
OpeA_exp = "**" 
OpeA_sum = "+"|"-"
OpeA_mult = "*"|"/"

id = {letter}+("_"{letter}+{digit}*)* ({letter}+ | {digit}+ ) | {letter}+("_"{digit}+{letter}*)* ({letter}+ | {digit}+ ) | {letter}+

%{
    int errores = 0;
%}

%state COMMENT_LINE
%state STRING

%%


<YYINITIAL>{
    "procedure"         {return new Symbol (sym.procedure, yycolumn, yyline, yytext()); }
    "begin"          { return new Symbol (sym.begin, yycolumn, yyline, yytext()); }
    "end"          { return new Symbol (sym.end, yycolumn, yyline, yytext()); }
    "is"           { return new Symbol (sym.is, yycolumn, yyline, yytext()); }
    "for"           { return new Symbol (sym.For, yycolumn, yyline, yytext()); }
    "loop"           { return new Symbol (sym.loop, yycolumn, yyline, yytext()); }
    "while"           { return new Symbol (sym.While, yycolumn, yyline, yytext()); }
    "Float"           { return new Symbol (sym.TypeFloat, yycolumn, yyline, yytext()); }
    "Integer"           { return new Symbol (sym.TypeInteger, yycolumn, yyline, yytext()); }
    "Boolean"           { return new Symbol (sym.TypeBoolean, yycolumn, yyline, yytext()); }
    "if"            {return new Symbol (sym.If, yycolumn, yyline, yytext()); }
    "then"            { return new Symbol (sym.then, yycolumn, yyline, yytext()); }
    "elsif"         { return new Symbol (sym.elsif, yycolumn, yyline, yytext()); }
    "else"          { return new Symbol (sym.Else, yycolumn, yyline, yytext()); }
    "put"          { return new Symbol (sym.put, yycolumn, yyline, yytext()); }
    {Boolean}          { return new Symbol (sym.TypeBoolean, yycolumn, yyline, yytext()); }
    {Integer}           { return new Symbol (sym.TypeInteger, yycolumn, yyline, yytext()); }
    {Float}           { return new Symbol (sym.TypeFloat, yycolumn, yyline, yytext());}
    {not}           { return new Symbol (sym.not, yycolumn, yyline, yytext());}
    {and}           { return new Symbol (sym.and, yycolumn, yyline, yytext());}
    {or}           { return new Symbol (sym.or, yycolumn, yyline, yytext());}
    
    {OpeR}          { return new Symbol (sym.OperadorRelacional, yycolumn, yyline, yytext()); }
    {id}            { return new Symbol (sym.Id, yycolumn, yyline, yytext()); }

    //operador aritmeticos
    {OpeA_sum}      { return new Symbol (sym.OperadorSuma, yycolumn, yyline, yytext()); }
    {OpeA_mult}     { return new Symbol (sym.OperadorMultiplicacion, yycolumn, yyline, yytext()); }

    //operador logico
    {assignment}    { return new Symbol (sym.asignacion, yycolumn, yyline, yytext()); }
    
    {puntos}        { return new Symbol (sym.DosPuntos, yycolumn, yyline, yytext()); }
    {puntoC}        { return new Symbol (sym.PuntoComa, yycolumn, yyline, yytext()); }
    {parentesisA}   { return new Symbol (sym.AbrirParentesis, yycolumn, yyline, yytext()); }
    {parentesisC}   { return new Symbol (sym.CerrarParentesis, yycolumn, yyline, yytext()); }
    {abrirC}        { return new Symbol (sym.AbrirCorchete, yycolumn, yyline, yytext()); }
    {cerrarC}       { return new Symbol (sym.CerrarCorchete, yycolumn, yyline, yytext()); }
    {comma}         { return new Symbol (sym.coma, yycolumn, yyline, yytext()); }
    {bracketA}      { return new Symbol (sym.AbrirBracket, yycolumn, yyline, yytext()); }
    {bracketC}      { return new Symbol (sym.CerrarBracket, yycolumn, yyline, yytext()); }
    {punto}         { return new Symbol (sym.punto, yycolumn, yyline, yytext()); }

    \\\"                {return new Symbol (sym.comillas, yycolumn, yyline, yytext());}
    

    "--"                {return new Symbol (sym.comentario, yycolumn, yyline, yytext());}
    {espacio}       {}
    .               {return new Symbol (sym.ERROR, yycolumn, yyline, yytext());}
}

<COMMENT_LINE>
{
    {EOL}        { yybegin(YYINITIAL);}
    .           {}
}

<STRING>
{
    \\\"        {System.out.println(); yybegin(YYINITIAL);}
    .           {System.out.print(yytext());}
}