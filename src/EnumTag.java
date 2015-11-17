

public enum EnumTag { 
    
    NE ("!"), 
    AND ("&"),
    AND_OP ("&&"), 
    OR ("||"), 

    LEFT ("<"), 
    RIGHT (">"), 
    LE_OP ("<="), 
    GE_OP (">="), 
    LEFT_OP ("<<"),
    RIGHT_OP (">>"),

    EQ_OP ("=="), 
    NE_OP ("!="),
    ADD_ASSIGN ("+="),
    SUB_ASSIGN ("-="),
    MUL_ASSIGN ("*="),
    DIV_ASSIGN ("/="),
    MOD_ASSIGN ("%="),
    AND_ASSIGN ("&="),
    XOR_ASSIGN ("^="),


    PLUS ("+"), 
    MINUS ("-"), 
    MINUS_U ("-"), 
    MULT ("*"), 
    DIV ("/"), 
    MOD ("%"), 
    LPAR ("("),
    RPAR (")"),
    SEMIC (";"),
    COMMA (","),
    LACC ("{"),
    RACC ("}"),
    INC_OP ("++"),
    DEC_OP ("--"),
    TILDE ("~"),
    LBRA ("["),
    RBRA ("]"),
    POINT ("."),
    ARROW ("->"),
    SINGLEQUOTE ("'"),
    QUOTE ("\""),
    COLON (":"),


    EQ ("="), 
    IF ("IF"), 
    THENELSE ("THENELSE"), 
    WHILE ("WHILE"), 

    LISTOF("list of"),
    SUCC("SUCC"),

    IDENTIFIER ("IDENTIFIER"),
    CHARACTER ("CHARACTER"), 
    INTEGER ("INTEGER"), 
    FLOAT ("FLOAT"), 
    STRING("STRING"),
    BOOLEAN("BOOLEAN"),
    TYPE ("TYPE"),
    PROCEDURE ("PROCEDURE");


    private final String tag;

    EnumTag(String s){
            tag = s;
    }

    public String toString(){
            return tag;
    }


}

