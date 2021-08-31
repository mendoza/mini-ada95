%%

%unicode
%class Lexer
%int
%line
%column


//Tipos de datos
digit=[0-9]
letter = [a-zA-Z]|"_"
Integer = {digit}+
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
EOL = [\r\n|\n]

//Operadores
assignment = ":="
equals = "="
not = "/="
and="and"
or="or"
OpeR = {not}|{equals}|"<"|">"|"<="|">="|{and}|{or}
OpeA_exp = "**"
OpeA_sum = "+"|"-"
OpeA_mult = "*"|"/"

id = {letter}({digit}|{letter})*

%{
    int errores = 0;
%}

%state COMMENT_LINE

%%


<YYINITIAL>{
    "procedure"         { System.out.println("procedure"); }
    "begin"          { System.out.println("begin");}
    "end"          { System.out.println("end");}
    "is"           { System.out.println("is");}
    "for"           { System.out.println("for");}
    "loop"           { System.out.println("loop");}
    "while"           { System.out.println("while");}
    "Float"           { System.out.println("Float");}
    "Integer"           { System.out.println("Type integer");}
    "Boolean"           { System.out.println("Type boolean");}
    "while"           { System.out.println("while");}
    "if"            { System.out.println("if");}
    "then"            { System.out.println("then");}
    "elsif"         { System.out.println("elsif");}
    "else"          { System.out.println("else");}
    "put"          { System.out.println("put");}
    {Boolean}          { System.out.println("Boolean: "+yytext());}
    {Integer}           { System.out.println("Integer: "+yytext());}
    {Float}           { System.out.println("Float: "+yytext());}
    {id}            { System.out.println("id: "+yytext());}
    {not}           { }
    {and}           { }
    {or}           { }
    
    {OpeR}          { System.out.println("operador relacional"); }

    //operador aritmeticos
    {OpeA_sum}      { }
    {OpeA_mult}     { }
    //{MOD}           { }

    //operador logico
    {assignment}    { }
    
    {puntos}        { }
    {puntoC}        { }
    {parentesisA}   { }
    {parentesisC}   { }
    {abrirC}        { }
    {cerrarC}       { }
    {comma}         { }
    {bracketA}      { }
    {bracketC}      { }
    {punto}         { }

    "--"                {yybegin(COMMENT_LINE);}
    {espacio}       {}
    .               {System.out.println("Falla en lexico, char o variable no aceptada: " +yytext()+" Linea: "+(yyline + 1)+ ", Columna: "+(yycolumn+1));
							errores++;}
}

<COMMENT_LINE>
{
    {EOL}        {yybegin(YYINITIAL);}
    .           {}
}