<?php
/**

Midterm - template.php
Author: Mohamed Alaouie
Link: --
Description: This is the template code to do a page setup for the animal themed midterm.
Created: 10.14.19
Last Edited: 10.14.19

 **/
$siteName = "Animal Midterm";
$email = "WeLoveAnimals@gmail.com";
$serviceNumber = "734-547-7049";
$contactInfo = "Contact us: ".$email." / ".$serviceNumber;
?>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" type="text/css" href="styles.css">

    <title>Midterm</title>
</head>

    <header>

        <nav class="navigation">
            <ul>
                <li><a href="index.php">Home</a></li>
                <li><a href="insertfriend.php">Insert Friend</a></li>
                <li><a href="updatefriend.php">Update Friend</a></li>
                <li><a href="removefriend.php">Remove Friend</a></li>
                <li><a href="findfriend.php">Find Friend</a></li>
            </ul>
        </nav>

        <div id="banner">
            <div id="logo"><a href="index.php"><img src="cover.png" alt="Page logo, image of many animals in a line"></a></div>
        </div>
    </header>

    <footer>
        <?php echo $siteName.' -- Copyright '.date('y').'<br>'.$contactInfo; ?>
    </footer>

</html>