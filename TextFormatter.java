
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
  int length = formatter.maxLength;
    formatter.print(text, length);
    
  }

  // Konstruktor
  public TextFormatter(int maxLineLength) {
   maxLength = maxLineLength;
  }


  // Ausgabe
  public void print(String aText, int length ) {
     String formattedString = "";

    for (int currentPosition = 0; currentPosition < aText.length(); currentPosition++){
      if (currentPosition % length == 0){
        formattedString += "\n";
      }
      formattedString += aText.charAt(currentPosition); 
    }
    System.out.println(formattedString);    
  }

}
