package T3N3T.User;

@lombok.Getter
public class UserDTO
{
    java.lang.String                    username;
    java.lang.Integer                   userId;
    java.util.Set<T3N3T.Book.BookDTO>   books;

    public UserDTO(java.lang.String                     username,
                   java.lang.Integer                    userId,
                   java.util.Set<T3N3T.Book.BookDTO>    books)
    {
        this.username = username;
        this.userId = userId;
        this.books = books;
    }
}
