import { User } from 'types/user';
import './styles.css';

type UserInformationProps = {
    user: User | undefined;
}

function CareerAndEducation() {


    return (

        <section className="career-and-education-boxes">
            <div>
                <p>
                    <header className="career-and-education-boxes-title">Experiência Profissional</header>

                    <p id="career-second"></p>
                    <p id="career-third"></p>
                </p>
            </div>
            <div>
                <p>
                    <header className="career-and-education-boxes-title">Educação</header>
                    <p id="education-first"></p>
                    <p id="education-second"></p>
                </p>
            </div>
        </section>
    );

}

export default CareerAndEducation;