class Main {
  public static void main(String[] args) {
    System.out.println("Programm started: \n");
    
    User user = new User("EmSome@com", "Michael", "Jonhs");
    User user1 = new User("mrLove@com", "Skibidu", "Deer");
    User user2 = new User("indepentFool@com", "Babuina", "Makaka");
    User user3 = new User("italienMafia@ia", "Casa", "Nostra");
    User user4 = new User("indepenting@ourjob.com", "Rusvelt", "Tramp");
    User user5 = new User("repairFaucet@com", "Mastera", "Nevysyvaly");
    User user6 = new User("Welcometotha@ShadowFog.uk", "Smoker", "Weed");
    System.out.println(user.toString());
    System.out.println(user1.toString());
    System.out.println(user2.toString());
    System.out.println(user3.toString());
    System.out.println(user4.toString());
    System.out.println(user5.toString());
    System.out.println(user6.toString());
    
    System.out.println("онлайн всего: " + User.usersOnline);

  }
}