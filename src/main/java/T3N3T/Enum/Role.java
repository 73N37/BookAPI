package T3N3T.Enum;

public enum Role
{
    ANYONE(0),
    USER(1),
    ADMIN(2),
    MODERATOR(3);

    protected final int id;
    Role(int id){
        this.id = id;
    }


    protected int
    getId()
    {
        return this.id;
    }

    // Method overload of [isAccessAllowed(int attemptedAccess, int requiredAccess)]
    protected static boolean
    isAccessAllowed(Role attemptedAccess, Role requiredAccess)
    {
        return isAccessAllowed(attemptedAccess.getId(), requiredAccess.getId());
    }

    protected static boolean
    isAccessAllowed(int attemptedAccess, int requiredAccess)
    {
// TODO     If user has a 'roleCode' HIGHER or EQUAL to 'accessCode'. This method will return true.
// TODO     Id user has a 'roleCode' LOWER than 'accessCode'. This method will return false.
        return (attemptedAccess >= requiredAccess) ? true : false;
    }
}
