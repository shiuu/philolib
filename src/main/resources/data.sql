INSERT INTO persons (FirstName, LastName, Email, Phone) VALUES
  ('Alice', 'Davidson', 'alice@gmail.com', '0412123456'),
  ('Bill', 'Perkins', 'bill@hotmail.com', '0412847222'),
  ('Carol', 'Tyrrell', 'carol@gmail.com', '0412384229'),
  ('Nigel', 'Zhou', 'shiuu@gmail.com', '0412788051');

INSERT INTO books (Title, Author, ISBN) VALUES
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

INSERT INTO loans (BookId, PersonId) VALUES
  (1, 1),
  (2, 2),
  (4, 4),
  (6, 1),
  (7, 2),
  (9, 2),
  (11, 2),
  (12, 1),
  (13, 2);