
class TextFormatter {

  
  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";

  private int maxLength;

  public static void main(String[] args) {
    TextFormatter formatter = new TextFormatter(30);
    //formatter.print(text);
    formatter.printRightAlign(text);
 
    
  }

  // Konstruktor
  public TextFormatter(int maxLineLength) {
   maxLength = maxLineLength;
  }


  // Ausgabe
  public void print(String aText) {
    String[] words = aText.split(" ");
    int characterCounter = 0;
      for(int i = 0; i < words.length; i++) {
        int wordLength = words[i].length();
          if(characterCounter + wordLength <= maxLength) {
            characterCounter += wordLength + 1;
            System.out.print(words[i] + " ");
          }else{
            System.out.print("\n" + words[i] + " ");
            characterCounter = wordLength + 1;
          }
      }
      System.out.println();
  }
 

 public void printRightAlign(String aText) {
    String[] words = aText.split(" ");
    String line = "";
    int characterCounter = 0;
      for (int i = 0; i < words.length; i++) {
        int wordLength = words[i].length();
          if (characterCounter + wordLength <= maxLength) {
            characterCounter += wordLength + 1;
            line += " " + words[i];
          } else {
            while (line.length() < maxLength) {
              line = " " + line;
            }
            System.out.print(line + "\n");
            characterCounter = wordLength + 1;
            line = " " + words[i];
          }
        }
          while(line.length() < maxLength){
          line = " " + line;
          }
        System.out.println(line);
      }


}
