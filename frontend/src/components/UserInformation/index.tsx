import { User } from "types/user";
import { BASE_URL } from "utils/requests";

import './styles.css';

type Props = {
    user: User;
}

function UserInformation({ user }: Props) {


    return (

        <div className="informations-box">
            <img className="informations-box-img" src={user.pictureLink} alt={user.fullName} />
            <div className="informations-box-p">
                <p className="informations-box-p-individual"><b>E-mail: </b> {user.email}</p>
                <p className="informations-box-p-individual"><b>Celular: </b> {user.cellPhone}</p>
                <p className="informations-box-p-individual"><b>Residência: </b> {user.location}</p>
                <p className="informations-box-p-individual"><b>Objetivo: </b> {user.goal}</p>
                <p className="informations-box-p-individual"><b>LinkedIn: </b> <a target="_blank"
                    href={user.linkedInLink}>Clique
                    aqui!</a></p>
                <p className="informations-box-p-individual"><b>Github: </b> <a target="_blank"
                    href={user.gitHubLink}>Clique aqui!</a></p>
            </div>
        </div>
    );

}

export default UserInformation;