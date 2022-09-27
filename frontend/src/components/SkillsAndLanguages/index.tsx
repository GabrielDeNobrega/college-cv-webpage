import { User } from 'types/user';
import './styles.css';

type UserInformationProps = {
    user: User | undefined;
}

function SkillsAndLanguages({ user }: UserInformationProps) {

    return (

        <section className="skills-and-languages-boxes">
            <div>
                <div className="skills">
                    <header><b>Habilidades</b></header>
                    <div style={{ display: "flex" }}>
                        {user?.skills.map((skill) => <p key={skill.id}>{"       " + skill.name + "          "}</p>)}
                    </div>
                </div>
            </div>

            <div className="languages">
                <header><b>Línguas</b></header>
                <table>
                    <tr>
                        <th>Idiomas</th>
                        <th>Fala</th>
                        <th>Leitura</th>
                        <th>Escrita</th>
                        <th>Escuta</th>
                    </tr>
                    <tr>
                        <td id="first-language-name"></td>
                        <td id="first-speaking"></td>
                        <td id="first-reading"></td>
                        <td id="first-writing"></td>
                        <td id="first-listening"></td>
                    </tr>
                    <tr>
                        <td id="second-language-name"></td>
                        <td id="second-speaking"></td>
                        <td id="second-reading"></td>
                        <td id="second-writing"></td>
                        <td id="second-listening"></td>
                    </tr>
                </table>

            </div>

        </section>
    );

}

export default SkillsAndLanguages;