 $i=1

$files = Get-Childitem  
  
foreach ( $file in $files ) {  
Write-Output "$i. $file.Name"  
$i++  
}
