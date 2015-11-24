

public enum EnumTag { 
    
    NE ("!"), 
    AND ("&"),
    OR ("|"),
    AND_OP ("&&"), 
    OR_OP ("||"), 
    XOR ("^"),

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
    OR_ASSIGN ("|="),


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
    IFELSE ("IFELSE"),
    THENELSE ("THENELSE"), 
    WHILE ("WHILE"),
    RETURN ("RETURN"),
    STOP ("STOP"),
    BREAK ("BREAK"),
    FOREACH ("FOREACH"),
    REPEAT ("REPEAT"),
    
    BLOCK ("BLOCK"),

    LISTOF("list of"),
    SUCC("SUCC"),

    IDENTIFIER ("IDENTIFIER"),
    CHARACTER ("CHARACTER"), 
    INTEGER ("INTEGER"), 
    FLOAT ("FLOAT"), 
    STRING("STRING"),
    BOOLEAN("BOOLEAN"),
    TYPE ("TYPE"),
    PROCEDURE ("PROCEDURE"),
    
    STATEMENT ("STATEMENT"),
    EXPRESSION ("EXPRESSION"),
    EXPRESSION_STATEMENT ("EXPRESSION_STATEMENT"),
    MULT_EXPRESSION ("MULT_EXPRESSION"),
    ADD_EXPRESSION ("ADD_EXPRESSION"),
    SHIFT_EXPRESSION ("SHIFT_EXPRESSION"),
    RELATIONAL_EXPRESSION ("RELATIONAL_EXPRESSION"),
    EQUALITY_EXPRESSION ("EQUALITY_EXPRESSION"),
    LOGICAL_EXPRESSION ("LOGICAL_EXPRESSION"),
    ASSIGNEMENT_EXPRESSION ("ASSIGNEMENT_EXPRESSION"),
    POSTFIX_EXPRESSION ("POSTFIX_EXPRESSION"),
    
    ARRAY ("ARRAY"),
    DECLARATION("DECLARATION"),
    VAR("VARIABLE"),
    VAR_ARRAY ("VAR_ARRAY"),
    CALL ("CALL"),
    CONST("CONSTANT");


    private final String tag;

    EnumTag(String s){
            tag = s;
    }

    public String toString(){
            return tag;
    }


}

