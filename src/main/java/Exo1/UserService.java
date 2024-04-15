package Exo1;

public class UserService {
    UserRepository UR;
    public Utilisateur getUserById(long id){

        return UR.findUserById(id);
    };

    public void setUR(UserRepository UR) {
        this.UR = UR;
    }
}
