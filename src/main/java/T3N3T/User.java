package T3N3T;

public class
User
{
    @jakarta.persistence.Id
    private java.lang.Long      id;
    private T3N3T.Enum.Role     role;
    private java.lang.String    username;


    public User(T3N3T.Enum.Role     role,
                java.lang.String    username)
    {
        this.role       = role;
        this.username   = username;
    }

    public T3N3T.Enum.Role getRole(){
        return this.role;
    }
}
