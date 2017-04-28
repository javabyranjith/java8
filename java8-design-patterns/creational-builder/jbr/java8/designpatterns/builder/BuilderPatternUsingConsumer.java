package jbr.java8.designpatterns.builder;

import java.util.function.Consumer;

/**
 * An example program for Builder Design Pattern using Consumer Interface.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class BuilderPatternUsingConsumer {
	public static void main(String[] args) {

		Mailer.send(mailer -> mailer.from("ranjith").to("sekar").subject("hai").body("how are you"));
	}
}

class Mailer {
	public Mailer from(String from) {
		System.out.println("from: " + from);
		return this;
	}

	public Mailer to(String to) {
		System.out.println("to: " + to);
		return this;
	}

	public Mailer subject(String subject) {
		System.out.println("subject: " + subject);
		return this;
	}

	public Mailer body(String body) {
		System.out.println("body: " + body);
		return this;
	}

	public static void send(Consumer<Mailer> mailer) {
		Mailer newMailer = new Mailer();
		mailer.accept(newMailer);
		System.out.println("mail sent..");
	}

}
