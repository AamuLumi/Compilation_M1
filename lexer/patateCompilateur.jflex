import java_cup.runtime.*;

%%

%class PatateCompilateurLexer
%line
%column
%cupsym PatateCompilateurSymbol
%cup

%{
private Symbol symbol (int type) {
        return new Symbol (type, yyline, yycolumn);
}

private Symbol symbol (int type, Object value) {
        return new Symbol (type, yyline, yycolumn, value);
}
%}

id      = [a-zA-Z][a-zA-Z0-9_]*
nb      = 0|[1-9][0-9]*
nbv     = 0|[1-9][0-9]*"."[0-9]* 

%%


/* -------------------------------------------------
        Separateurs Operateurs
   ------------------------------------------------- */

"("      { return symbol(PatateCompilateurSymbol.LPAR); }
")"      { return symbol(PatateCompilateurSymbol.RPAR); }
"+"    	 { return symbol(PatateCompilateurSymbol.PLUS); }
"*"      { return symbol(PatateCompilateurSymbol.MULT); }
";"      { return symbol(PatateCompilateurSymbol.SEMIC); }
","       { return symbol(PatateCompilateurSymbol.COMA); }
"{"	     { return symbol(PatateCompilateurSymbol.LACC); }
"}"	     { return symbol(PatateCompilateurSymbol.RACC); }
"++"	   { return symbol(PatateCompilateurSymbol.INC_OP); }
"--"	   { return symbol(PatateCompilateurSymbol.DEC_OP); }
"&"	     { return symbol(PatateCompilateurSymbol.AND); }
"-"	     { return symbol(PatateCompilateurSymbol.MINUS); }
"~"	     { return symbol(PatateCompilateurSymbol.TILDE); }
"!"	     { return symbol(PatateCompilateurSymbol.NE); }
"/"	     { return symbol(PatateCompilateurSymbol.DIV); }
"%"	     { return symbol(PatateCompilateurSymbol.MOD); }
"<<"	   { return symbol(PatateCompilateurSymbol.LEFT_OP); }
">>"	   { return symbol(PatateCompilateurSymbol.RIGHT_OP); }
"<"	     { return symbol(PatateCompilateurSymbol.LEFT); }
">"	     { return symbol(PatateCompilateurSymbol.RIGHT); }
"<="	   { return symbol(PatateCompilateurSymbol.LE_OP); }
">="	   { return symbol(PatateCompilateurSymbol.GE_OP); }
"=="	   { return symbol(PatateCompilateurSymbol.EQ_OP); }
"!="	   { return symbol(PatateCompilateurSymbol.NE_OP); }
"^"	     { return symbol(PatateCompilateurSymbol.XOR); }
"|"	     { return symbol(PatateCompilateurSymbol.OR); }
"&&"	   { return symbol(PatateCompilateurSymbol.AND_OP); }
"||"	   { return symbol(PatateCompilateurSymbol.OR_OP); }
"="	     { return symbol(PatateCompilateurSymbol.EQ); }
"(op)="	   { return symbol(PatateCompilateurSymbol.OP_ASSIGN); }
"["      { return symbol(PatateCompilateurSymbol.LBRA); }
"]"      { return symbol(PatateCompilateurSymbol.RBRA); }
"."      { return symbol(PatateCompilateurSymbol.POINT); }
"->"     { return symbol(PatateCompilateurSymbol.ARRAW); }
"'"       { return symbol(PatateCompilateurSymbol.SINGLEQUOTE); }
""" //"   { return symbol(PatateCompilateurSymbol.QUOTE); }
":"       { return symbol(PatateCompilateurSymbol.COLON); }

"integer" { return symbol(PatateCompilateurSymbol.INT); }
"character"   { return symbol(PatateCompilateurSymbol.CHARACTER); }
"float"    { return symbol(PatateCompilateurSymbol.FLOAT); }
"string"   { return symbol(PatateCompilateurSymbol.STRING); }
"type"  { return symbol(PatateCompilateurSymbol.TYPE); }

"procedure"	  { return symbol(PatateCompilateurSymbol.PROCEDURE); }
"in"          { return symbol(PatateCompilateurSymbol.IN); }


"foreach"	   { return symbol(PatateCompilateurSymbol.FOREACH); }
"return"   { return symbol(PatateCompilateurSymbol.RETURN); }
"structure"   { return symbol(PatateCompilateurSymbol.STRUCTURE); }
"list of"   { return symbol(PatateCompilateurSymbol.LISTOF); }
"if"        { return symbol(PatateCompilateurSymbol.IF); }
"stop"      { return symbol(PatateCompilateurSymbol.STOP); }
"break"     { return symbol(PatateCompilateurSymbol.BREAK); }
"repeat"    { return symbol(PatateCompilateurSymbol.REPEAT); }
"while"     { return symbol(PatateCompilateurSymbol.WHILE); }

"null"  { return symbol(PatateCompilateurSymbol.NULL); }
"boolean"	   { return symbol(PatateCompilateurSymbol.BOOLEAN); }
"true"  { return symbol(PatateCompilateurSymbol.TRUE); }
"false"	   { return symbol(PatateCompilateurSymbol.FALSE); } 

"static"  { return symbol(PatateCompilateurSymbol.STATIC); }
"function"  { return symbol(PatateCompilateurSymbol.FUNCTION); }
"class" { return symbol(PatateCompilateurSymbol.CLASS); }
"private" { return symbol(PatateCompilateurSymbol.PRIVATE); }
"public"  { return symbol(PatateCompilateurSymbol.PUBLIC); }

"main"  { return symbol(PatateCompilateurSymbol.MAIN); }

/* -------------------------------------------------
        Variables, Entiers
   ------------------------------------------------- */


{id}     { return symbol(PatateCompilateurSymbol.ID); }
{nb}     { return symbol(PatateCompilateurSymbol.NB); }
{nbv}    { return symbol(PatateCompilateurSymbol.NBV); }

"//".*    
"/*"([^*]|\*+[^/])*\*+"/"

 /* -------------------------------------------------
        Caracteres non pris en compte
   ------------------------------------------------- */

[\t|\n|\r|\r\n]                  {}

   
/* -------------------------------------------------
        Erreurs
   ------------------------------------------------- */
. {}
