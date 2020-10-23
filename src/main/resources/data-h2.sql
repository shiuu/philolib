DROP TABLE IF EXISTS TEST;
CREATE TABLE TEST(ID INT PRIMARY KEY,
   NAME VARCHAR(255));

DROP TABLE IF EXISTS persons;
CREATE TABLE persons (
  Id INT AUTO_INCREMENT  PRIMARY KEY,
  Name VARCHAR(250) NOT NULL,
  Email VARCHAR(250) NOT NULL,
  Phone VARCHAR(100) NOT NULL
);

INSERT INTO persons (name, email, phone) VALUES
  ('Alice', 'alice@gmail.com', '0412123456'),
  ('Bill', 'bill@hotmail.com', '0412847222'),
  ('Carol', 'carol@gmail.com', '0412384229'),
  ('Nigel', 'shiuu@gmail.com', '0412788051');

DROP TABLE IF EXISTS books;
CREATE TABLE books (
  `Id` INT AUTO_INCREMENT  PRIMARY KEY,
  `Title` varchar(255) NOT NULL,
  `Author` varchar(100) NOT NULL,
  `ISBN` varchar(20) NOT NULL,
  `Status` INT NOT NULL default 0
);

INSERT INTO books (title, author, ISBN) VALUES
  ('The Mind Made Flesh: Frontiers of Psychology and Evolution', 'Nicholas Humphrey', '0192802275'),
  ('Buddhism as Philosophy: An Introduction', 'Mark Siderits', '0872208737'),
  ('Wittgenstein', 'Anthony Kenny', '1405136553'),
  ('Second Treatise of Government', 'John Locke', '0915144867'),
  ('An Introduction to Non-Classical Logic: From If to Is', 'Graham Priest', '0521670268'),
  ('Bayesian Reasoning and Machine Learning', 'David Barber', '1107439957'),
  ('1984', 'George Orwell', '1783190612'),
  ('Critique Of Pure Reason', 'Kant Immanuel', '9780230013384'),
  ('An Introduction to Game Theory', 'Osborne, M.', '0195128958'),
  ('The Oxford Dictionary of Philosophy', 'Blackburn', '9780198735304'),
  ('Mortal Questions', 'Thomas Nagel', '1107604710'),
  ('Thinking and Deciding', 'Jonathan Baron', '0521680433'),
  ('A History of the Mind: Evolution and the Birth of Consciousness', 'Nicholas Humphrey', '0387987193'),
  ('On The Genealogy Of Morals: A Polemic', 'Friedrich Nietzsche', '9780141195377');
