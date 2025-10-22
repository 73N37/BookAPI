package T3N3T;

@lombok.Getter
public class
User
{
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private java.lang.Long      userId;
    private T3N3T.Enum.Role     role;
    private java.lang.String    username;


    public User(T3N3T.Enum.Role     role,
                java.lang.String    username)
    {
        this.role       = role;
        this.username   = username;
    }
}
