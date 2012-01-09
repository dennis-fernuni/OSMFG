<?php
$nix = exec("./cat_all_ebnf.sh", $rueckgabe);
$rueckgabe = implode($rueckgabe);
$input = '"OSM" {' . str_replace(";" ,".", $rueckgabe) . "}";
?>
