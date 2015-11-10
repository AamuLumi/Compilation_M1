import java_cup.runtime.*;
import java.util.Stack;
%%

%class PatateCompilateurLexer
%line
%column
%cupsym PatateCompilateurSymbol
%cup

%{
/* On ajoute 1 à la ligne et la colonne car un éditeur de texte commence
  à la ligne 1 et la colonne 1, tandis que le lexeur commence à 0:0.
  */
private Symbol symbol (int type) {
        return new Symbol (type, yyline+1, yycolumn+1);
}

private Symbol symbol (int type, Object value) {
        return new Symbol (type, yyline+1, yycolumn+1, value);
}

public class Pile{

  Stack<Character> s = new Stack<Character>();

  public Pile(){

  }

  public boolean isOpeningSymbol(char c)
  {
    return c == '(' || c == '{' || c == '[';
  }

  public boolean isClosingSymbol(char c)
  {
    return c == ')' || c == '}' || c == ']';
  }

  public void checkMismatch(char c)
  {
    if (isOpeningSymbol(c))
      s.push(c);

    else if (isClosingSymbol(c))
    {
      try
      {
        if ((c == ')' && s.peek() == '(') ||
            (c == '}' && s.peek() == '{') ||
            (c == ']' && s.peek() == '['))
        {
          s.pop();
        }
        else throw new RuntimeException();
      }catch(RuntimeException e)
      {
        System.out.println("Erreur " + c + yyline + yycolumn);
      }
    }
  }
}

Pile p = new Pile();
%};

id      = [a-zA-Z][a-zA-Z0-9_]*
nb      = 0|[1-9][0-9]*
nbv     = 0|[1-9][0-9]*"."[0-9]*

%%


/* -------------------------------------------------
        Separateurs Operateurs
   ------------------------------------------------- */

"("      { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.LPAR); }
")"      { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.RPAR); }
"+"    	 { return symbol(PatateCompilateurSymbol.PLUS); }
"*"      { return symbol(PatateCompilateurSymbol.MULT); }
";"      { return symbol(PatateCompilateurSymbol.SEMIC); }
","       { return symbol(PatateCompilateurSymbol.COMMA); }
"{"	     { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.LACC); }
"}"	     { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.RACC); }
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
"+="	   { return symbol(PatateCompilateurSymbol.ADD_ASSIGN); }
"-="	   { return symbol(PatateCompilateurSymbol.SUB_ASSIGN); }
"*="	   { return symbol(PatateCompilateurSymbol.MUL_ASSIGN); }
"/="	   { return symbol(PatateCompilateurSymbol.DIV_ASSIGN); }
"%="	   { return symbol(PatateCompilateurSymbol.MOD_ASSIGN); }
"&="	   { return symbol(PatateCompilateurSymbol.AND_ASSIGN); }
"^="	   { return symbol(PatateCompilateurSymbol.XOR_ASSIGN); }
"["      { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.LBRA); }
"]"      { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.RBRA); }
"."      { return symbol(PatateCompilateurSymbol.POINT); }
"->"     { return symbol(PatateCompilateurSymbol.ARROW); }
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
"else"        { return symbol(PatateCompilateurSymbol.ELSE); }
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

/* -------------------------------------------------
        Variables, Entiers
   ------------------------------------------------- */


{id}     { return symbol(PatateCompilateurSymbol.ID, yytext()); }
{nb}     { return symbol(PatateCompilateurSymbol.NB, Integer.parseInt(yytext())); }
{nbv}    { return symbol(PatateCompilateurSymbol.NBV, Double.parseDouble(yytext())); }


 /* -------------------------------------------------
        Caracteres non pris en compte
   ------------------------------------------------- */

/* Comments : Ne pas les prendre */
"//".*    {}
"/*"([^*]|\*+[^/])*\*+"/" {}

[\t|\n|\r|\r\n]                  {}


/* -------------------------------------------------
        Erreurs
   ------------------------------------------------- */
. {}
