import axios from 'axios';
import { useEffect, useState } from 'react';
import { BASE_URL } from "utils/requests";
import { User } from "types/user";
import Navbar from 'components/Navbar';
import UserInformation from 'components/UserInformation';
import CareerAndEducation from 'components/CareerAndEducation';
import SkillsAndLanguages from 'components/SkillsAndLanguages';
import './styles.css';
import { useParams } from 'react-router-dom';

function MainPage() {

  const [user, setUser] = useState<User>();
  console.log(window.location);
  const param = useParams();
  useEffect(() => {
    axios.get(`${BASE_URL}/users/${param.id}`)
      .then(response => {
        setUser(response.data)
        console.log(response.data);
      });
  }, [param.id]);

  return (

    <body className="body">

      <Navbar user={user} />

      <main className="container">

        <UserInformation user={user} />

        <CareerAndEducation />

        <SkillsAndLanguages />

      </main>

    </body>

  );

}

export default MainPage;