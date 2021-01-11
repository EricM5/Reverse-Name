class Main {
  public static void main(String[] args) {
    char[] firstArray = {'E','r', 'i', 'c', ' ', 'M','a','r','z','o','u','k','\0'};
    char[] secondArray = new char [firstArray.length];
    //to print name first time:
    int counter = 11;
    System.out.print("Displaying the original array:\n");
    for (int i = 0; i < firstArray.length; i++) {
      System.out.print(firstArray[i]);
    }
    System.out.println("\n");
    System.out.println("Now reversing the words:\n");
    System.out.println("Now displaying the second array in reverse order:");
    for (int i = 0; i < secondArray.length; i++) {
      secondArray[i] = firstArray[counter];
      System.out.print(secondArray[i]);
      counter--;
      if (counter < 0)
        break;
    }
    System.out.println("\n\nDisplaying the original array once more: ");
    for (int i = 0; i < firstArray.length; i++) {
      System.out.print(firstArray[i]);
    }
  }
}