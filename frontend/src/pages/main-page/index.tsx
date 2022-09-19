import Navbar from 'components/Navbar';
import UserInformation from 'components/UserInformation';
import CareerAndEducation from 'components/CareerAndEducation';
import SkillsAndLanguages from 'components/SkillsAndLanguages';
import './styles.css';


function MainPage() {

  return (

    <body className="body">

      <Navbar />

      <main className="container">

        <UserInformation user={{
          id: 0,
          fullName: '',
          pictureLink: '',
          email: '',
          cellPhone: '',
          location: '',
          goal: '',
          linkedInLink: '',
          gitHubLink: ''
        }} />

        <CareerAndEducation />

        <SkillsAndLanguages />

      </main>

      <script src="./js/index.js" type="module"></script>
    </body>

  );

}

export default MainPage;