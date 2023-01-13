# Java-Regex

Regex Best Practice in Java

## Grouping and Capturing

### Numbered Group
### Named Group 
    (?<name>RE)

### Non Capturing Group
    (?:RE)

## Back Reference
    (RE)\1 // where 1 is the group number 

For example, if we need to match a two-digit number with the restriction that both digits must be the same, then we need to capture the first digit and then use a back reference for the first captured group, as follows:
^(\d)\1$
Now, this regex will match any of these strings: 11, 22, 55, and 88.

## Pattern
    
### Pattern compile 

### Pattern quote
No need to escape the special character 

## Matcher 

### matches
    
### find 
finds all possible matches in the input 

### appendReplacement & appendTail
appendReplacement = replaces the found matches and appends to the buffer 
used with find 

appendTail appends the remaining text to the buffer 



