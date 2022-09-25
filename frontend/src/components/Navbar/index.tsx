import { User } from 'types/user';
import './styles.css';

type UserInformationProps = {
    user: User | undefined;
}

function Navbar({ user }: UserInformationProps) {

    return (

        <header className="owners-name">
            <h1>{user?.fullName}</h1>
        </header>
    );

}

export default Navbar;