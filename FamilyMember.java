class FamilyMember {
  static String surname = "Lai/Wong";
  String name;
  int age;

  public static void main(String[] arguments){
      FamilyMember dad = new FamilyMember();
      System.out.println("Family's surname is: " + dad.surname);
      System.out.println("Family's surname is: " + FamilyMember.surname);
  }
}
