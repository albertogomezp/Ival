# IvAl - Marketplace
New project in collab with <a href="https://github.com/ivanperezmolina" target="_blank">Iván Pérez Molina</a> <br>
IvAl is our brand new Marketplace test project. We are usign the following technologies: <br>
<ul>
    <li>MySQL</li>
    <li>Java Servlet</li>
    <li>Hibernate Framework<li>
    <li>More... (we will update this list, i promiss)</li>
</ul>

<h1>First things first... Our Database:</h1>
We have designed it using <a href="https://erdplus.com" target="_blank">ERDPlus</a> for the E/R Diagram and Relational Schema, as following:
<img src="Files/ERDiagram.png">
And it generated from the Relational Schema, this SQL Query (which we edited):

```SQL
CREATE TABLE Producto
(
  CodPro INT NOT NULL AUTO_INCREMENT,
  NomPro VARCHAR(50) NOT NULL,
  DescPro VARCHAR(100),
  PrePro FLOAT NOT NULL ,
  StockPro INT NOT NULL,
  PRIMARY KEY (CodPro)
);

CREATE TABLE Carrito
(
  CodCar INT NOT NULL AUTO_INCREMENT,
  FechCar DATE NOT NULL,
  TotCar FLOAT NOT NULL,  
  PRIMARY KEY (CodCar)
);

CREATE TABLE Contiene
(
  CodPro INT NOT NULL,
  CodCar INT NOT NULL,
  PRIMARY KEY (CodPro, CodCar),
  FOREIGN KEY (CodPro) REFERENCES Producto(CodPro),
  FOREIGN KEY (CodCar) REFERENCES Carrito(CodCar)
);
```

<h1>Let's build!: Creating the Eclipse project</h1>
Okay... things are getting serious. We have already create the project, imported some hibernate libs and created classes and config file.
<h1> Control time: DAO, servlet, hibernate.... </h1>
Hibernate is configured, DAO is created, corrected and given an interface. Servlet is created with some functions and prepared for the "action"s functions
