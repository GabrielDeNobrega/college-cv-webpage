let text = '{ "person" : [' +
    '{ "firstName":"Gabriel " , "lastName":"de Nóbrega Araújo", '
    + '"email":"sr.gabrielnobrega@hotmail.com", "phone":"+55 (011) 98270-7597", "location":"São Paulo, Brazil",' 
    + '"goal":"Java Developer", "linkedin":"https://br.linkedin.com/in/gabriel-n%C3%B3brega-9b8260169?original_referer=https%3A%2F%2Fwww.google.com%2F",' 
    + '"github":"https://github.com/GabrielDeNobrega" } ]}';


const obj = JSON.parse(text);

document.getElementById("main-title").innerHTML =
obj.person[0].firstName + " " + obj.person[0].lastName;