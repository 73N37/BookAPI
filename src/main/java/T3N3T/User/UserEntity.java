package T3N3T.User;

@lombok.AllArgsConstructor
@lombok.RequiredArgsConstructor
@lombok.Setter
@lombok.Getter
@jakarta.persistence.Entity
public class
UserEntity
{
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
                    java.lang.Long                          userId;
    private static  Class<UserEntity>                       myClass;
                    T3N3T.Enum.Role                         role;
                    java.lang.String                        username;
                    java.lang.String                        hashedPassword;
                    java.util.Set<T3N3T.Book.BookEntity>    books;

    public
    UserEntity(T3N3T.Enum.Role     role,
                      java.lang.String    username)
    {
        this.role       = role;
        this.username   = username;
    }

    T3N3T.Book.BookEntity
    getBookByTitle(java.lang.String title)
    {
        java.lang.String methodLocation = myClass.getName()+".getBookByTitle(String)";
        return ( () -> {books.stream()
                .filter(book -> book.getTitle().equals(title)
                        .findFirst()
                                .elseThrow(new Exception("An error happen in" + methodLocation)))});
    }

    T3N3T.Book.BookEntity
    getBookById(java.lang.Integer id)
    {
        java.lang.String methodLocation = myClass.getName()+".getBookById(int)";
        return ( () -> {books.stream()
                .filter(book -> book.getBookId().equals(id)
                        .findFirst()
                                .elseThrow(new Exception("An error happen in" + methodLocation)))});
    }
}
