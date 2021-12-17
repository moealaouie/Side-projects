<?php
/**

Midterm - insertfriend.php
Author: Mohamed Alaouie
Description: This is the page where a user can insert an animal into the database.
Created: 10.14.19
Last Edited: 10.14.19

 **/
include_once('template.php');
$dbConnect = require('dbConnect.php');

if(isset($_POST['animalName']) && isset($_POST['animalType']) && isset($_POST['breed']) && isset($_POST['checkinDate']) && isset($_POST['phone']) && isset($_POST['email']) && isset($_POST['notes']))
{
    $animalName = $_POST['animalName'];
    $animalType = $_POST['animalType'];
    $breed = $_POST['breed'];
    $checkinDate = $_POST['checkinDate'];
    $phone = $_POST['phone'];
    $email = $_POST['email'];
    $notes = $_POST['notes'];
};

$qryInsert = "INSERT into Customer (animalName, animalType, breed, checkinDate, phone, email, notes)
VALUES ('$animalName', '$animalType', '$breed', '$checkinDate', '$phone', '$email', '$notes');";
?>
<html>
<h4>Please fill out the submission form below</h4>

<form action="dbConnect.php" method="post">
    <fieldset class="contactInfo">
        <legend> Submit your companion's information: </legend>

        <p>
            <label for="animalName"> Full Name:
                <input type="text" name="animalName" id="animalName" placeholder="Moose">
            </label><br>

            <label for="animalType"> Type:
                <input type="text" name="animalType" id="animalType" placeholder="Dog">
            </label><br>

            <label for="breed"> Breed:
                <input type="text" name="breed" id="breed" placeholder="Husky">
            </label><br>

            <label for="checkinDate"> Date your companion was check in:
                <input type="date" name="checkinDate" id="checkinDate" placeholder="10/14/2019">
            </label><br><br>
        </p>

        <p>
            <label for="phone"> Phone Number:
                <input type="text" name="phone" id="phone" placeholder="000-000-0000">
            </label>

            <label for="email"> Email:
                <input type="email" name="email" id="email" placeholder="exmp@example.com">
            </label><br>

            <label for="notes"> Anything you'd like to add about caring for your pet?
                <input type="text" name="notes" id="notes" placeholder="...">
            </label>
        </p>
    </fieldset>

    <fieldset class="submit">

        <input type="submit" value="Submit" id="submit">

    </fieldset>
</form>

<?php
    if(isset($name))
    {
        echo $name.", your data has been submitted. Thank you!";
    }
?>
</html>