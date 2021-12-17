USE mhalaouie;

CREATE TABLE midterm_animals(animalID int AUTO_INCREMENT NOT NULL, animalName VARCHAR(50) NOT NULL, animalType VARCHAR(25) NOT NULL,
breed VARCHAR(25) NOT NULL, checkinDate DATETIME NOT NULL, phone VARCHAR(16) NOT NULL, email VARCHAR(25) DEFAULT NULL, checkoutDate DATETIME DEFAULT NULL);

INSERT INTO midterm_animals
(animalID, animalName, animalType, breed, phone, checkinDate)
VALUES
(1, "Hund", "Dog", "Golden", "+1(234)234-2341", NOW());

INSERT INTO midterm_animals
(animalID, animalName, animalType, breed, phone, checkinDate)
VALUES
(2, "Mistress", "Cat", "Tabbi", "+1(534)233-2345", NOW());

INSERT INTO midterm_animals
(animalID, animalName, animalType, breed, phone, checkinDate)
VALUES
(3, "Kyle", "Reptile", "Turtle", "+1(734)239-4893", NOW());

INSERT INTO midterm_animals
(animalID, animalName, animalType, breed, phone, checkinDate)
VALUES
(4, "Marvin", "Cetacea", "Dolphin", "+1(322)123-7564", NOW());