package hello;

class HelloWorld
{
  String username = "silly";
  String password = "insecure_password_123";
  
  public static void main(String[] args) {
    System.out.println("Hello, World!"); 
    System.out.println("Here is my " + username + "password! " + password);
  }
}