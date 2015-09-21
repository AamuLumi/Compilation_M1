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
"+"    { return symbol(PatateCompilateurSymbol.PLUS); }
"*"      { return symbol(PatateCompilateurSymbol.MULT); }
";"      { return symbol(PatateCompilateurSymbol.SEMIC); }
"integer" { return symbol(PatateCompilateurSymbol.INT); }

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
