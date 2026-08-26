package fr.univtln.bruno.samples.jpa.model;

import lombok.extern.java.Log;

import java.util.logging.Logger;

@Log
public class Bidon {

  static sealed class User permits Student, Teacher {
    String name = "Bidon";
  }

  static final class Student extends User {
  }

  static final class Teacher extends User {
    String titre = "Professeur";
  }



  //private static final Logger LOGGER = Logger.getLogger(Bidon.class.getName());

  public static void main(String[] args) {

      //User user = new Student();
    User user = new Teacher();

      String message = switch (user) {
        case Student student -> "hello "+student.name;
        case Teacher teacher-> "Bonjour "+teacher.titre+" "+teacher.name;
        default -> null;
      };

    System.out.println(message);
   }

}
