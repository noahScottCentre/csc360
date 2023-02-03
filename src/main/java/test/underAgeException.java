package test;

public class underAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public underAgeException(){super("parent is too young");}
	public underAgeException(String mesg){super(mesg);}
	
}
