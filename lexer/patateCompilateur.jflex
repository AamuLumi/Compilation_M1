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

%%

/* -------------------------------------------------
        Separateurs Operateurs
   ------------------------------------------------- */

"("      { return symbol(PatateCompilateurSymbol.LPAR); }
")"      { return symbol(PatateCompilateurSymbol.RPAR); }
"+"    	 { return symbol(PatateCompilateurSymbol.PLUS); }
"*"      { return symbol(PatateCompilateurSymbol.MULT); }
";"      { return symbol(PatateCompilateurSymbol.SEMIC); }
"{"	 { return symbol(PatateCompilateurSymbol.LACC); }
"}"	 { return symbol(PatateCompilateurSymbol.RACC); }
"++"	 { return symbol(PatateCompilateurSymbol.INC_OP); }
"--"	 { return symbol(PatateCompilateurSymbol.DEC_OP); }
"&"	 { return symbol(PatateCompilateurSymbol.AND); }
"-"	 { return symbol(PatateCompilateurSymbol.MOINS); }
"~"	 { return symbol(PatateCompilateurSymbol.TILD); }
"!"	 { return symbol(PatateCompilateurSymbol.NE); }
"/"	 { return symbol(PatateCompilateurSymbol.DIV); }
"%"	 { return symbol(PatateCompilateurSymbol.MOD); }
"<<"	 { return symbol(PatateCompilateurSymbol.LEFT_OP); }
">>"	 { return symbol(PatateCompilateurSymbol.RIGHT_OP); }
"<"	 { return symbol(PatateCompilateurSymbol.LEFT); }
">"	 { return symbol(PatateCompilateurSymbol.RIGHT); }
"<="	 { return symbol(PatateCompilateurSymbol.LE_OP); }
">="	 { return symbol(PatateCompilateurSymbol.GE_OP); }
"=="	 { return symbol(PatateCompilateurSymbol.EQ_OP); }
"!="	 { return symbol(PatateCompilateurSymbol.NE_OP); }
"^"	 { return symbol(PatateCompilateurSymbol.XOR); }
"|"	 { return symbol(PatateCompilateurSymbol.OR); }
"&&"	 { return symbol(PatateCompilateurSymbol.AND_OP); }
"||"	 { return symbol(PatateCompilateurSymbol.OR_OP); }
"="	 { return symbol(PatateCompilateurSymbol.EQ); }
"*="	 { return symbol(PatateCompilateurSymbol.MUL_ASSIGN); }
"/="	 { return symbol(PatateCompilateurSymbol.DIV_ASSIGN); }
"%="	 { return symbol(PatateCompilateurSymbol.MOD_ASSIGN); }
"+="	 { return symbol(PatateCompilateurSymbol.ADD_ASSIGN); }
"-="	 { return symbol(PatateCompilateurSymbol.SUB_ASSIGN); }
"<<="	 { return symbol(PatateCompilateurSymbol.RIGHT_ASSIGN); }
">>="	 { return symbol(PatateCompilateurSymbol.LEFT_ASSIGN); }
"&="	 { return symbol(PatateCompilateurSymbol.AND_ASSIGN); }
"^="	 { return symbol(PatateCompilateurSymbol.XOR_ASSIGN); }
"|="	 { return symbol(PatateCompilateurSymbol.OR_ASSIGN); }

"integer" { return symbol(PatateCompilateurSymbol.INT); }
"if"	  { return symbol(PatateCompilateurSymbol.IF); }

"auto"	  { return symbol(PatateCompilateurSymbol.AUTO); }
"break"	  { return symbol(PatateCompilateurSymbol.BREAK); }
"case"	  { return symbol(PatateCompilateurSymbol.CASE); }
"char"	  { return symbol(PatateCompilateurSymbol.CHAR); }
"const"	  { return symbol(PatateCompilateurSymbol.CONST); }
"continue" { return symbol(PatateCompilateurSymbol.CONTINUE); }
"default"  { return symbol(PatateCompilateurSymbol.DEFAULT); }
"do"	   { return symbol(PatateCompilateurSymbol.DO); }
"double"   { return symbol(PatateCompilateurSymbol.DOUBLE); }
"else"	   { return symbol(PatateCompilateurSymbol.ELSE); }
"enum"	   { return symbol(PatateCompilateurSymbol.ENUM); }
"extern"   { return symbol(PatateCompilateurSymbol.EXTERN); }
"float"	   { return symbol(PatateCompilateurSymbol.FLOAT); }
"for"	   { return symbol(PatateCompilateurSymbol.FOR); }
"goto"	   { return symbol(PatateCompilateurSymbol.GOTO); }
"long"	   { return symbol(PatateCompilateurSymbol.LONG); }
"register" { return symbol(PatateCompilateurSymbol.REGISTER); }
"return"   { return symbol(PatateCompilateurSymbol.RETURN); }
"short"	   { return symbol(PatateCompilateurSymbol.SHORT); }
"signed"   { return symbol(PatateCompilateurSymbol.SIGNED); }
"sizeof"   { return symbol(PatateCompilateurSymbol.SIZEOF); }
"static"   { return symbol(PatateCompilateurSymbol.STATIC); }
"struct"   { return symbol(PatateCompilateurSymbol.STRUCT); }
"switch"   { return symbol(PatateCompilateurSymbol.SWITCH); }
"typedef"  { return symbol(PatateCompilateurSymbol.TYPEDEF); }
"union"	   { return symbol(PatateCompilateurSymbol.UNION); }
"unsigned" { return symbol(PatateCompilateurSymbol.UNSIGNED); }
"void"	   { return symbol(PatateCompilateurSymbol.VOID); }
"volatile" { return symbol(PatateCompilateurSymbol.VOLATILE); }
"while"	   { return symbol(PatateCompilateurSymbol.WHILE); }

/* -------------------------------------------------
        Variables, Entiers
   ------------------------------------------------- */


{id}     { return symbol(PatateCompilateurSymbol.ID); }
 /* -------------------------------------------------
        Caracteres non pris en compte
   ------------------------------------------------- */

[\t|\n|\r|\r\n]                  {}

/* -------------------------------------------------
        Erreurs
   ------------------------------------------------- */
. {}
