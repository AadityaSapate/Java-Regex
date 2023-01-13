package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MatcherAppend {

  public static void main(String[] args) {
    final String input = "<n1=v1 n2=v2 n3=v3> n1=v1 n2=v2 abc=123 < v = pq id = abc > v = pq";

    // pattern1 to find all matches between < and >
    final Pattern pattern = Pattern.compile("<[^>]+>");

    // pattern1 to find each name=value pair
    final Pattern pairPattern = Pattern.compile("(\\w+)=(\\w+)");

    Matcher enclosedPairs = pattern.matcher(input);

    StringBuilder sbuf = new StringBuilder();

    // call find in a loop and call appendReplacement for each match
    while (enclosedPairs.find()) {
      Matcher pairMatcher = pairPattern.matcher(enclosedPairs.group());
      enclosedPairs.appendReplacement(sbuf,
          pairMatcher.replaceAll("$2=$1"));
    }

    // appendTail to append remaining character to buffer
    enclosedPairs.appendTail(sbuf);

    System.out.println(sbuf);
  }
}