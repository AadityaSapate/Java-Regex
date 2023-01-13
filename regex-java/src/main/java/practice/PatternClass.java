package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClass {


  public static void main(String[] args) {
    String patternRegex = "\\+91[\\d]{10}";
    final Pattern indianMobilePattern = Pattern.compile(patternRegex);
    String inputNumber = "+918668964701";
    Matcher matcher = indianMobilePattern.matcher(inputNumber);

    if (matcher.matches()) {
      System.out.println("matcher.group() = " + matcher.group());
    }

    // using quote
    String patternRegexQuoted = Pattern.quote("+91");
    final Pattern indianMobilePattern1 = Pattern.compile(patternRegexQuoted + "[\\d]{10}");
    String inputNumber1 = "+918668964701";
    Matcher matcher1 = indianMobilePattern1.matcher(inputNumber1);

    if (matcher1.matches()) {
      System.out.println("matcher1.group() = " + matcher1.group());
    }
  }
}
