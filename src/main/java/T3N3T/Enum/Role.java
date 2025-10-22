package T3N3T.Enum;

public enum Role
{
    ANYONE(0),
    USER(1),
    ADMIN(2),
    MODERATOR(3);

    protected final int roleCode;
    Role(int roleCode){
        this.roleCode = roleCode;
    }


    protected int
    get()
    {
        return this.roleCode;
    }

    // Method overload of [isAccessAllowed(int attemptedAccess, int requiredAccess)]
    protected static boolean
    isAccessAllowed(Role attemptedAccess, Role requiredAccess)
    {
        return isAccessAllowed(attemptedAccess.get(), requiredAccess.get());
    }

    protected static boolean
    isAccessAllowed(int attemptedAccess, int requiredAccess)
    {
// TODO     If user has a 'roleCode' HIGHER or EQUAL to 'accessCode'. This method will return true.
// TODO     Id user has a 'roleCode' LOWER than 'accessCode'. This method will return false.
        return (attemptedAccess >= requiredAccess) ? true : false;
    }
}
