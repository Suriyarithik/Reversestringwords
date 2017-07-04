# Reversestringwords
import java.io.*;
import java.util.*;
 import java.lang.*;

public class Reversestringwords{  
  
  public static void main(String[] args)throws IOException {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str;
    str=br.readLine();
    String revstring="";
    
    for(int i=str.length()-1;i>=0;--i){
      revstring +=str.charAt(i);
    }
    
  System.out.println(revstring);
  }
  }
