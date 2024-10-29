importorg.apache.commons.lang3.StringUtils;
 
publicclassApp{
  publicstaticvoidmain(String[]args){
  Stringtext="Hello,Maven!";
  StringreversedText=StringUtils.reverse(text);
  System.out.println(reversedText);
  }
 }
