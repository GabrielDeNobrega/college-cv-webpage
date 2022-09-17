var obj = {};

var x = new XMLHttpRequest();

x.open('GET', './js/infos.json', true);
x.onreadystatechange = function () {
    if (x.readyState == 4) {
        console.log(x.responseText)
        obj = JSON.parse(x.responseText);
        fillPage(obj);
    }
};

x.send();

function fillPage(obj) {

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

}


