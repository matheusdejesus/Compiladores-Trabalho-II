package lexer;

public enum Tag {
	// Reserved Words
	PROGRAM("PROGRAM"), BEGIN("BEGIN"), END("END"),
	INT("INT"), REAL("REAL"), BOOL("BOOL"),
	WRITE("WRITE"), IF("IF"),
	// Assign
	ASSIGN("ASSIGN"),
	PLUS_ASSIGN("PLUS_ASSIGN"), // +=
	MINUS_ASSIGN("MINUS_ASSIGN"), // -=
	MUL_ASSIGN("MUL_ASSIGN"), // *=
	// Arithmetical Operators
	SUM("SUM"), SUB("SUB"), MUL("MUL"),
	// Logical Operators
	OR("OR"),
	// Relational Operators
	LT("LT"), LE("LE"), GT("GT"),
	// Symbols
	SEMI("SEMI"), DOT("DOT"), LPAREN("LPAREN"), RPAREN("RPAREN"),
	// Literals and Identifiers
	LIT_INT("LIT_INT"), LIT_REAL("LIT_REAL"), ID("ID"),
	TRUE("TRUE"), FALSE("FALSE"),
	// Others
	EOF("EOF"), UNK("UNK"), TEMP("TEMP");

	private String name;

	private Tag(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public boolean isInt() {
		return this == Tag.INT;
	}

	public boolean isReal() {
		return this == Tag.REAL;
	}

	public boolean isBool() {
		return this == Tag.BOOL;
	}

	public boolean isNum() {
		return (isInt() || isReal());
	}

	public boolean isType() {
		return isNum() || isBool();
	}
}
