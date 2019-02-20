package rgb.Controller;

public class StringController {
    String content = "Example content: Lorem ipsum Lorem ipsum";


    public boolean getCharInText(char seachCharacter){

        return content.indexOf(seachCharacter)==-1 ? false : true;
    }


    public int countAllCharacters(char c){
        int charCounter = 0;
        for(int i=0; i<content.length(); i++){
            if (content.charAt(i)==c){
                charCounter++;
            }

        }
        return charCounter;
    }
  // 65 90

  public int countAllUpperCases(){
      int charCounter = 0;
      for(int i=0; i<content.length(); i++){
          if ((int)content.charAt(i)>=65 && (int)content.charAt(i)<=90 ){
              charCounter++;
          }
      }
      return charCounter;
  }




}
