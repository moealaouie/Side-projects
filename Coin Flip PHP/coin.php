<?php 
    
$heads=0;
$tails=0;
$num=0;   
    for($i=0;$i<20;$i++)
    {
        $result=rand(0,1);
    
        if($result==0)
        {
            $num=$i+1;
            $tails=$tails+1;
            
            echo "Flip # $num: tails ";
            echo '<img src="/~mhalaouie/cis122/images/tails.png"/>';
            echo "<br>";
        
        }
        else
        {
            $num=$i+1;
            $heads=$heads+1;
            echo "Flip # $num : heads";
            echo '<img src="/~mhalaouie/cis122/images/heads.png"/>';
            echo "<br>";
        }
    }
   
    $totalheads=($heads/20)*100;
    $totaltails=($tails/20)*100;

        echo "Number of coins flipped heads: $heads ($totalheads)";
        echo "Number of coins flipped tails: $tails ($totaltails)";


?>