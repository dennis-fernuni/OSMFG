<?php
$nix = exec("./cat_all_ebnf.sh", $rueckgabe);


foreach ($rueckgabe as $eingabe) {
 if (preg_match('/=/', $eingabe) == 0 && $eingabe != "")
  die ("keine Zuweisung: $eingabe");

 if ($eingabe != "") {
  $z = preg_split("/=/",$eingabe,2);
  $l = trim($z[0]);
  $r = trim($z[1]);
  $ergebnis[$l] = " " . $r;
  $suche[] = "/ $l /";
  $ersetze[] = " $l() ";
 }
}

$suche[] = "/{/";
$ersetze[] = "(";
$suche[] = "/}/";
$ersetze[] = ")*";


$fastfertig = preg_replace($suche, $ersetze, $ergebnis);
$fertig = preg_replace($suche, $ersetze, $fastfertig);
$pre = '
PARSER_BEGIN(SyntaxChecker)

public class SyntaxChecker {
    public static void main(String[] args) {
        try {
            new SyntaxChecker(new java.io.StringReader(args[0])).S();
            System.out.println("Syntax is okay");
        } catch (Throwable e) {
            // Catching Throwable is ugly but JavaCC throws Error objects!
            System.out.println("Syntax check failed: " + e.getMessage());
        }
    }
}

PARSER_END(SyntaxChecker)

SKIP:  { "\t" | "\n" | "\r"                    }
TOKEN: { "(" | ")" | "+" | "*" | <NUM: (["0"-"9"])+> }
 

void S(): {} { NODE() <EOF>           }';

echo $pre . "\n\n";
foreach ($fertig as $key => $value) {
 echo "void $key() : {}{" . str_replace(';' , '', str_replace('' , '', $value)) . "} \n";
}

  

?>
