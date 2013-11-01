class ScopeTestForInstanceVariable {
  int test = 10;

  void printTest() {
    int test = 20;
    System.out.println("Test: " + this.test);
  }

  public static void main(String[] arguments) {
    ScopeTestForInstanceVariable st = new ScopeTestForInstanceVariable();
    st.printTest();
  }
}
