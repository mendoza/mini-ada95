package picoada;

import static picoada.Tokens.*;
import java.util.LinkedList;
%%

%unicode
%class Lexer
%type Tokens
%line
%column

%{

    String comment = "";
    String cadena = "";

    public String lexema;
    /* Lista con errores lexicos */
    public static LinkedList<String> ErroresLexicos=new LinkedList<String>();
%}

//Tipos de datos
digit=[0-9]
letter = [a-zA-Z]
Integer = {digit}+ ("_"{digit}+)* {digit}+ | {digit}+

string = {comillas}+ {id} {comillas}+

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

comillas = \\\"

//Operadores
assignment = ":="
equals = "="
diff = "/="
not = "not"
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
    "procedure"         { lexema = yytext(); return procedure;}
    "begin"          { lexema = yytext(); return begin;}
    "end"          { lexema = yytext(); return end; }
    "is"           { lexema = yytext(); return is;}
    "for"           { lexema = yytext(); return For;}
    "loop"           { lexema = yytext(); return loop;}
    "while"           { lexema = yytext(); return While;}
    "Float"           { lexema = yytext(); return TypeFloat;}
    "Integer"           { lexema = yytext(); return TypeInteger;}
    "Boolean"           { lexema = yytext(); return TypeBoolean;}
    "if"            {lexema = yytext(); return If;}
    "then"            { lexema = yytext(); return then;}
    "elsif"         { lexema = yytext(); return elsif;}
    "else"          { lexema = yytext(); return Else;}
    "Put"          { lexema = yytext(); return Put;}
    "Put_Line"          { lexema = yytext(); return Put_Line;}
    "Get"          { lexema = yytext(); return Get;}
    {Boolean}          { lexema = yytext(); return Boolean;}
    {Integer}           { lexema = yytext(); return Integer;}


    {string}                 { yybegin(STRING);}


    {Float}           { lexema = yytext(); return Float;}
    {not}           { lexema = yytext(); return not;}
    {and}           { lexema = yytext(); return and;}
    {or}           { lexema = yytext(); return or;}
    {diff}          {lexema = yytext(); return diff;}
    
    {OpeR}          { lexema = yytext(); return OperadorRelacional;}
    {id}            {lexema = yytext(); return Id;}

    //operador aritmeticos
    {OpeA_sum}      {lexema = yytext(); return OperadorSuma; }
    {OpeA_mult}     { lexema = yytext(); return OperadorMultiplicacion;}

    //operador logico
    {assignment}    { lexema = yytext(); return asignacion;}
    
    {puntos}        { lexema = yytext(); return DosPuntos;}
    {puntoC}        {lexema = yytext(); return PuntoComa; }
    {parentesisA}   { lexema = yytext(); return AbrirParentesis;}
    {parentesisC}   { lexema = yytext(); return CerrarParentesis;}
    {abrirC}        { lexema = yytext(); return AbrirCorchete;}
    {cerrarC}       { lexema = yytext(); return CerrarCorchete;}
    {comma}         {lexema = yytext(); return coma; }
    {bracketA}      {lexema = yytext(); return AbrirBracket;}
    {bracketC}      { lexema = yytext(); return CerrarBracket;}
    {punto}         {lexema = yytext(); return punto; }

    

    "--"                { yybegin(COMMENT_LINE); }

    {espacio}       {}
    .               {lexema = yytext(); return ERROR;}
}

<COMMENT_LINE>
{
    {EOL}        { yybegin(YYINITIAL); lexema = comment; comment =""; return comentario; }
    .           { ; comment = comment + yytext(); }
}

<STRING>
{
    {comillas}         {yybegin(YYINITIAL); lexema = cadena; cadena = ""; return string; }
    .           {cadena = cadena + yytext();}
}