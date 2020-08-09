DROP TABLE IF EXISTS basicinfo;
 
CREATE TABLE basicinfo (
  id INT PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  career VARCHAR(250) DEFAULT NULL,
  linkedinprofile VARCHAR(250) DEFAULT NULL,
  objective VARCHAR(500) DEFAULT NULL
  
);
 
INSERT INTO basicinfo (id, first_name, last_name, email, career, linkedinprofile, objective) VALUES
  (1, 'Afreen', 'Ekram', 'afreenekram@abc.com', 'Software Engineer', 'AfreenEkram', 'Looking forward to great opportunities for making my career in freelancing world');
  

  
  
DROP TABLE IF EXISTS educationalbg;
 
CREATE TABLE educationalbg (
  id INT PRIMARY KEY,
  degree VARCHAR(250) NOT NULL,
  degreetitle VARCHAR(250) NOT NULL,
  institute VARCHAR(250) DEFAULT NULL,
  passingyear VARCHAR(250) DEFAULT NULL,
  score VARCHAR(250) DEFAULT NULL
  
);
 
INSERT INTO educationalbg (id, degree, degreeTitle, institute, passingyear, score) VALUES
  (1, 'Bachelors', 'BS in Computer Science and Information Technology', 'NED UNIVERSITY of Engineering And Technology', '2018', '3.485GPA');
  
  
DROP TABLE IF EXISTS internship;
 
CREATE TABLE internship (
  id INT PRIMARY KEY,
  company VARCHAR(250) NOT NULL,
  year VARCHAR(250) NOT NULL

);
 
INSERT INTO internship (id, company, year) VALUES
  (1, 'PIA', '2017');
  
DROP TABLE IF EXISTS fyp;
 
CREATE TABLE fyp (
  id INT PRIMARY KEY,
  forcompany VARCHAR(250) NOT NULL,
  fypname VARCHAR(250) NOT NULL,
  technology VARCHAR(250) NOT NULL

);
 
INSERT INTO fyp (id, forcompany, fypname, technology) VALUES
  (1, 'SUPARCO', 'Automated Ionospheric Parameter Extraction From Ionogram', '-Python -imageProcessing -OpenCv');
  
  
DROP TABLE IF EXISTS jobexperience;
 
CREATE TABLE jobexperience (
  id INT PRIMARY KEY,
  companyinfo VARCHAR(250) NOT NULL,
  datefrm VARCHAR(250) NOT NULL,
  dateto VARCHAR(250) NOT NULL,
  wotechnology VARCHAR(250) NOT NULL

);
 
INSERT INTO jobexperience (id, companyinfo, datefrm, dateto, wotechnology) VALUES
  (1, 'Developing Risk Management Softwares for banks', 'DEC-2018', 'now', '-Spring Boot -Angular7+');
  
  
DROP TABLE IF EXISTS skills;
 
CREATE TABLE skills (
  id INT PRIMARY KEY,
  progrmglang VARCHAR(250) NOT NULL,
  weblang VARCHAR(250) NOT NULL,
  db VARCHAR(250) NOT NULL,
  framework VARCHAR(250) NOT NULL,
  technologies VARCHAR(250) NOT NULL,
  others VARCHAR(250) NOT NULL

);
 
INSERT INTO skills (id, progrmglang, weblang, db, framework, technologies, others) VALUES
  (1, '-JAVA -C', '-HTML -CSS -SCSS -Bootstrap -TypeScript -Javascript', '-Oracle -H2', 'Spring Boot -Angular7+ -Hibernate', '-JPA -REST -Angular-redux Store', '-Git -DevExtreme -MSWord -Prezi -JustinMind Prototyper');