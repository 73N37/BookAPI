package T3N3T.User;

@lombok.Getter
public class
UserEntity
{
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private java.lang.Long      userId;
    private T3N3T.Enum.Role     role;
    private java.lang.String    username;


    public UserEntity(T3N3T.Enum.Role     role,
                      java.lang.String    username)
    {
        this.role       = role;
        this.username   = username;
    }
}
