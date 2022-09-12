let text = `{
    "person": [
      {
        "informations": {
          "fullName": "Gabriel de Nóbrega Araújo",
          "picture": "https://avatars.githubusercontent.com/u/84252664?v=4",
          "email": "sr.gabrielnobrega@hotmail.com",
          "phone": "+55 (011) 98270-7597",
          "location": "São Paulo, Brazil",
          "goal": "Java Developer",
          "linkedin": "https://br.linkedin.com/in/gabriel-n%C3%B3brega-9b8260169?original_referer=https%3A%2F%2Fwww.google.com%2F",
          "github": "https://github.com/GabrielDeNobrega"
        },
        "experience": {
          "first": "Professor de Inglês: Ministro aulas desde 2017, levando alunos de todas as idades à proficiência na língua.",
          "second": "Programador: Desenvolvi projetos baseados em Java, utilizando conceitos de POO e arquitetura de software.",
          "third": "Exemplos: jogo de xadrez e aplicação web de avaliação de filmes."
        },
        "education": {
          "first": "SENACSP - Tecnologia em Análise e Desenvolvimento de Sistemas (02/2021 - 06/2023)",
          "second": "UNIFESP - Química Industrial (02/2018 - 06/2019)"
        },
        "abilities": {
          "first": "Inglês - Java - Spring Boot - HTML - CSS - Javascript - Office Package - Conflict Resolution Approaches"
        },
        "languages": {
          "first": {
            "name": "Inglês",
            "speaking": "Fluente",
            "reading": "Fluente",
            "writing": "Fluente",
            "listening": "Fluente"
          },
          "second": {
            "name": "Francês",
            "speaking": "Básico",
            "reading": "Básico",
            "writing": "Básico",
            "listening": "Básico"
          }
        }
      }
    ]
  }`


const obj = JSON.parse(text);

document.getElementById("main-title").innerHTML =
    obj.person[0].informations.fullName;

document.getElementById("email").innerHTML =
    obj.person[0].informations.email;

document.getElementById("phone").innerHTML =
    obj.person[0].informations.phone;

document.getElementById("location").innerHTML =
    obj.person[0].informations.location;

document.getElementById("goal").innerHTML =
    obj.person[0].informations.goal;

document.getElementById("career-first").innerHTML =
    obj.person[0].experience.first;

document.getElementById("career-second").innerHTML =
    obj.person[0].experience.second;

document.getElementById("career-third").innerHTML =
    obj.person[0].experience.third;

document.getElementById("education-first").innerHTML =
    obj.person[0].education.first;

document.getElementById("education-second").innerHTML =
    obj.person[0].education.second;

document.getElementById("abilities").innerHTML =
    obj.person[0].abilities.first;

document.getElementById("first-language-name").innerHTML =
    obj.person[0].languages.first.name;

document.getElementById("first-speaking").innerHTML =
    obj.person[0].languages.first.speaking;
document.getElementById("first-reading").innerHTML =
    obj.person[0].languages.first.reading;
document.getElementById("first-writing").innerHTML =
    obj.person[0].languages.first.writing;
document.getElementById("first-listening").innerHTML =
    obj.person[0].languages.first.listening;

document.getElementById("second-language-name").innerHTML =
    obj.person[0].languages.second.name;

document.getElementById("second-speaking").innerHTML =
    obj.person[0].languages.second.speaking;
document.getElementById("second-reading").innerHTML =
    obj.person[0].languages.second.reading;
document.getElementById("second-writing").innerHTML =
    obj.person[0].languages.second.writing;
document.getElementById("second-listening").innerHTML =
    obj.person[0].languages.second.listening;
