package T3N3T.User;

@lombok.AllArgsConstructor
@lombok.RequiredArgsConstructor
@lombok.Setter
@lombok.Getter
public class
UserEntity
{
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private         java.lang.Long                          userId;
    private static  Class<UserEntity>                       myClass;
    private         T3N3T.Enum.Role                         role;
    private         java.lang.String                        username;
    private         java.lang.String                        hashedPassword;
    private         java.lang.Set<T3N3T.Book.BookEntity>    books;

    public UserEntity(T3N3T.Enum.Role     role,
                      java.lang.String    username)
    {
        this.role       = role;
        this.username   = username;
    }

    BookEntity getBookByTitle(java.lang.String title)
    {
        java.lang.String methodLocation = myClass.getName()+".getBookByTitle(String)";
        return ( () -> {books.stream()
                .filter(book -> book.getTitle().equals(title)
                        .findFirst()
                                .elseThrow(new Exception("An error happen in" + methodLocation)))});
    }

    BookEntity getBookById(int id)
    {
        java.lang.String methodLocation = myClass.getName()+"getBookById(int)";
        return ( () -> {books.stream()
                .filer(book -> book.getBookId().equals(id)
                        .findFirst()
                                .elseThrow(new Exception("An error happen in" + methodLocation)))});
    }
}
