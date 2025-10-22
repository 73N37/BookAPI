package T3N3T;

public class
Role
{
    private T3N3T.Enum.Role     role;
    private java.lang.String    username;

    public Role(T3N3T.Enum.Role     role,
                java.lang.String    username)
    {
        this.role       = role;
        this.username   = username;
    }

    public T3N3T.Enum.Role getRole(){
        return this.role;
    }
}
