public class newDriver{
  public static void main(String[] args){
    SuperArray poop = new SuperArray(2);
    poop.add("hi");
    poop.add("bye");
    poop.add("hellobye");
    poop.add("okay");
    System.out.println(poop);
    poop.add(0, "lol");
    System.out.println(poop);
    System.out.println(poop.contains("lol"));
    System.out.println(poop.indexOf("hi"));
    poop.add("lol");
    System.out.println(poop.lastIndexOf("lol"));
  }
}
