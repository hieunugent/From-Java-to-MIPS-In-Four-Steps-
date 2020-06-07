package Token;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Token {
    //int x = 6;
  public static String inputReadText(){
//         Scanner scanner = new Scanner(" if (true)\n  System.out.println(!false);\nelse\n System.out.println(false);\n");
//         Scanner scanner = new Scanner(" { if (true) System.out.println(!false);else System.out.println(false); while (true) { System.out.println(!!false); System.out.println(true);}}");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("");
        String content = new String();
        while (scanner.hasNext()){
            content += scanner.next();
        }
        return content;
    }
  public static String [] splitInput(String args){
      String [] result = args.split(""); 
      return result;
  }
  public static StringTokenizer makeToken(String [] args){
      String argsStr =""; 
      for(String str : args){
            //System.out.println(str);
            argsStr = argsStr + " " + str;
        }
      
      StringTokenizer result = new StringTokenizer(argsStr);
      return result;
  }
 
  public static String[] convertToken(String strargs){
      String [] args = strargs.split("");
      
      List<String> a = new ArrayList<String>();
        for(int i = 0 ; i < args.length; i++){
            if(args[i].equals("i")){
                i++;
                if(args[i].equals("f"))
                {
                   
                    a.add("IF");
                }
             }
             else if (args[i].equals("e")) { 
                i++;
                 if(args[i].equals("l")){ 
                     i++;
                     if(args[i].equals("s")){
                         i++;
                        if(args[i].equals("e")){
                            
                             a.add("ELSE");
                    }
                }
            }
        }     
            else if (args[i].equals("S")){
                i++;
                if(args[i].equals("y")){
                    i++;
                    if(args[i].equals("s")){
                        i++;
                        if(args[i].equals("t")){
                            i++;
                            if(args[i].equals("e")){
                                i++;
                                if(args[i].equals("m")){
                                    i++;
                                    if(args[i].equals(".")){
                                        i++;
                                        if(args[i].equals("o")){
                                            i++;
                                            if(args[i].equals("u")){
                                                i++;
                                                if(args[i].equals("t")){
                    i++;
                    if(args[i].equals(".")){
                        i++;
                        if(args[i].equals("p")){
                            i++;
                            if(args[i].equals("r")){
                                i++;
                                if(args[i].equals("i")){
                                    i++;
                                    if(args[i].equals("n")){
                                        i++;
                                        if(args[i].equals("t")){
                                            i++;
                                            if(args[i].equals("l")){
                                                i++;
                                                if(args[i].equals("n")){
                                                    a.add("PRINT");
                                                
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        } // end system.out.println
        
        else if (args[i].equals("w")){
            i++;
            if (args[i].equals("h")){
                i++;
                    if(args[i].equals("i")){
                        i++;
                        if(args[i].equals("l")){
                            i++;
                            if(args[i].equals("e")){
                                a.add("WHILE");
                        }
                    }
                }
            }
        } 
            
        else if (args[i].equals("f")){
            i++;
            if (args[i].equals("a")){
                i++;
                    if(args[i].equals("l")){
                        i++;
                        if(args[i].equals("s")){
                            i++;
                            if(args[i].equals("e")){
                                a.add("FALSE");
                        }
                    }
                }
            }
        }    
         else if (args[i].equals("t")){
            i++;
            if (args[i].equals("r")){
                i++;
                    if(args[i].equals("u")){
                        i++;
                        if(args[i].equals("e")){
                            a.add("TRUE");
                    }
                }
            }
        }       
            
        else if (args[i].equals("}"))
        {
            a.add("RBRACE");
        }
        else if (args[i].equals("{"))
        {
            a.add("LBRACE");
        }  
        else if (args[i].equals("("))
        {
            a.add("LPAREN");
        }   
         else if (args[i].equals(")"))
        {
             a.add("RPAREN");
        }  
         else if (args[i].equals(";"))
        {
             a.add("SEMI");
        } 
        else if (args[i].equals("!"))
        {
            a.add("BANG");
        }     
        }
      a.add("EOF");
      String [] result = new String[a.size()];
      //convert list to Array token;
      a.toArray(result);
      return result;
         
          
  }
    
 
}