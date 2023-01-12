package practice;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchResults {

  public static void main(String[] args) {
    String httpMessage = "Http/1\\.[01] (\\d+) [a-zA-Z]+";
    Pattern pattern = Pattern.compile(httpMessage);
    String input = "Http/1.1 302 Found";
    Matcher matcher = pattern.matcher(input);
    if (matcher.matches()) {
      MatchResult matchResult = matcher.toMatchResult();
      System.out.println("matchResult.start() = " + matchResult.start());
      System.out.println("matchResult.end() = " + matchResult.end());
      System.out.println("matchResult.group() = " + matchResult.group());
      System.out.println("matchResult.group(1) = " + matchResult.group(1));
      System.out.println("matchResult.groupCount() = " + matchResult.groupCount());
      System.out.println("matchResult.start(1) = " + matchResult.start(1));
      System.out.println("matchResult.end(1) = " + matchResult.end(1));
    }

  }
}

