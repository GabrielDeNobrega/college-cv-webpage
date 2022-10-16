import { User } from "types/user";
import "./styles.css";

type UserInformationProps = {
  user: User | undefined;
};

function SkillsAndLanguages({ user }: UserInformationProps) {
  return (
    <section className="skills-and-languages-boxes">
      <div>
        <div className="skills">
          <header className="skills-title">
            <b>Habilidades</b>
          </header>
          <div className="skills-name">
            {user?.skills.map((skill) => (
              <p key={skill.id} className="skills-name-padding">
                {skill.name}
              </p>
            ))}
          </div>
        </div>
      </div>

      <div className="languages">
        <header>
          <b>Línguas</b>
        </header>
        <table>
          <thead>
            <tr>
              <th>
                <div className="languages-single-header">Idiomas</div>
              </th>
              <th>
                <div className="languages-single-header">Fala</div>
              </th>
              <th>
                <div className="languages-single-header">Leitura</div>
              </th>
              <th>
                <div className="languages-single-header">Escrita</div>
              </th>
              <th>
                <div className="languages-single-header">Escuta</div>
              </th>
            </tr>
          </thead>
          <tbody>
            {user?.languages.map((language) => (
              <tr key={language.id}>
                <td>
                  <div className="languages-single-item">
                    <b>{language.name}</b>
                  </div>
                </td>
                <td>
                  <div className="languages-single-item">
                    {language.speaking}
                  </div>
                </td>
                <td>
                  <div className="languages-single-item">
                    {language.reading}
                  </div>
                </td>
                <td>
                  <div className="languages-single-item">
                    {language.reading}
                  </div>
                </td>
                <td>
                  <div className="languages-single-item">
                    {language.listening}
                  </div>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </section>
  );
}

export default SkillsAndLanguages;
