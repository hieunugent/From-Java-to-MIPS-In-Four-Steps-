import java.util.*;
import java.io.IOException;
import Token.Token;


public class Parse{
    
    static Token A = new Token();       
//    static String input = A.inputReadText();
//    static String[] tInput = A.convertToken(input);
  //  static StringTokenizer tokStream = A.makeToken(tInput);  
    static StringTokenizer tokStream;
    static String token = "";
    static Boolean result = true;
    private static void getToken(){
        token = tokStream.nextToken();
    }
    private static void getNextToken(){
        if (!token.equals("EOF")){
        token = tokStream.nextToken();
        }
        else if (result){
            result = true;
        }
        else { 
            result = false;
        //System.out.println("false to print out");
        }
    }
    private static void eat(String str){
        if (token.equals(str)){
            getNextToken();
           // System.out.println(str);
        }
        else {
            result = false;
           // System.out.println("false to print out");
        }
         // System.out.println("Parse error"); 
    }
    private static Boolean checkHasMoreToken(String args){
        String libraryText = "LBRACE RBRACE PRINT LPAREN RPAREN SEMI IF ELSE WHILE TRUE FALSE BANG ";
        return libraryText.contains(args);
        

            
    }
   
    private static void S(){
        if (token.equals("LBRACE")){
                eat("LBRACE");
                L();
                eat("RBRACE");
                if(checkHasMoreToken(token)){
                    result = false;
                }
                
        }
        else if (token.equals("PRINT")){
                eat("PRINT");
                if (token.equals("LPAREN")){
                    eat("LPAREN");
                    E();
                    eat("RPAREN");
                    eat("SEMI");
                }
        }
        else if (token.equals("IF")){
            eat("IF");
            eat("LPAREN");
            E();
            eat("RPAREN");
            S();
            eat("ELSE");
            S();
        }
        else if (token.equals("WHILE")){
            eat("WHILE");
            eat("LPAREN");
            E();
            eat("RPAREN");
            // take care double bracket test case 10 and 6
            if (token.equals("LBRACE"))
            {  
                eat("LBRACE");
                L();
                eat("RBRACE");
            }
            else
                S();
            
        }
        else {
            result = false;
           // System.exit(0);
           //System.out.println("Parse error"); 
        
        }
       
    }
    private static void L(){
        if (token.equals("EOF") && result ){
            eat("EOF");
            
        }
       else if (token.equals("LBRACE")||token.equals("PRINT")||token.equals("IF")||token.equals("WHILE"))
        {    
           S();    
           L();
        }
       
    
    }
    private static void E(){
        if(token.equals("TRUE")){
        eat("TRUE");
        }
        else if(token.equals("FALSE")){
            eat("FALSE");
        }
        else if(token.equals("BANG")){
            eat("BANG");
            E();
        }
        else {
            result = false;
            //System.exit(0);
            
           //System.out.println("Parse error");
        }
        
    }
    
    
    
    public static void main(String[] args) 
  {     
       
       //List<String> a = Arrays.asList(tInput);
       //Token A = new Token();       
     String input = A.inputReadText();
     String[] tInput = A.convertToken(input);
     tokStream = A.makeToken(tInput); 
     token = tokStream.nextToken();
    try {
//        for(String str : tInput){
//            System.out.println(str);
//        }
        // start symbols
          S();
        if (result)
          System.out.println("Program parsed successfully");
        else 
          System.out.println("Parse error");  
//        System.out.println("Start of List ");
//        System.out.println( tokStream.nextToken());
//        System.out.println(  tokStream.nextToken());
//        if (token.equals("IF")){
//             System.out.println("OK");
//            eat("IF");
//            System.out.println("1");
//            eat("LPAREN");
//              System.out.println("2");
//            eat("TRUE");
//              System.out.println("3");
//            eat("RPAREN");
//              System.out.println("4");
//            eat("PRINT");
//              System.out.println("5");
//            eat("LPAREN");
//              System.out.println("6");
//            eat("BANG");
//              System.out.println("7");
//            eat("FALSE");
//              System.out.println("8");
//            eat("RPAREN");
//              System.out.println("9");
//            eat("SEMI");
//              System.out.println("10");
//            eat("ELSE");
//              System.out.println("11");
//            eat("PRINT");
//              System.out.println("12");
//            eat("LPAREN");
//              System.out.println("13");
//            eat("FALSE");
//              System.out.println("14");
//            eat("RPAREN");
//              System.out.println("15");
//            eat("SEMI");
//              System.out.println("16_ok");
//            eat("EOF");   
//            System.out.println("Parse program successful");
//        }
        
    } catch (Exception e) {
      System.out.println("Parse error");
    }
  }
    
}