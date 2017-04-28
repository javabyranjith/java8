package jbr.java8.designpatterns.builder;

/**
 * An example program for Builder Design Pattern.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class BuilderPattern {

  public static void main(String[] args) {
    Mail mail = new Mail();
    mail.from("Ranjith");
    mail.to("Sekar");
    mail.subject("Hello");
    mail.body("How are you?");
    mail.send();
  }

}

class Mail {

  public void from(String from) {
    System.out.println("from: " + from);
  }

  public void to(String to) {
    System.out.println("to: " + to);
  }

  public void subject(String subject) {
    System.out.println("subject: " + subject);
  }

  public void body(String body) {
    System.out.println("body: " + body);
  }

  public void send() {
    System.out.println("mail sent..");
  }

}
