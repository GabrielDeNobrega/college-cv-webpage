import { User } from "types/user";
import "./styles.css";

type UserInformationProps = {
  user: User | undefined;
};

function CareerAndEducation({ user }: UserInformationProps) {
  return (
    <section className="career-and-education-boxes">
      <div>
        <header className="career-and-education-boxes-title">
          Experiência Profissional
        </header>
        {user?.professionalExperiences.map((experience) => (
          <p key={experience.id}>
            <b>{experience.jobPosition}</b> {experience.description} From{" "}
            {experience.since} until {experience.until}.
          </p>
        ))}
      </div>
      <div>
        <header className="career-and-education-boxes-title">Educação</header>
        {user?.educationalExperiences.map((experience) => (
          <p
            key={experience.id}
          >{`${experience.institution} - ${experience.courseName} - ${experience.graduationYear}`}</p>
        ))}
      </div>
    </section>
  );
}

export default CareerAndEducation;
