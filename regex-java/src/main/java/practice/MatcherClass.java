package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {

  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("<([^<>]*)>");
    String input = "Hello <name>, welcome to <place>.";
    Matcher matcher = pattern.matcher(input);
    while (matcher.find()) {
      System.out.println("matcher.group(1) = " + matcher.group(1)); // name, place
    }

  }
}
