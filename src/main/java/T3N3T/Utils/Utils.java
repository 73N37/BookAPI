package T3N3T.Utils;

public class Utils
{
    /**
     *
     * @param plainPassword plain text password go through param before being saved to the Database
     * @return a String of the hashed and salted password, meaning even though two users use '1234' as their password,
     * in the database both will be unique
     */

    public static String hashPassword(String plainPassword) {
        return org.mindrot.jbcrypt.BCrypt.hashpw(   plainPassword,
                                                    org.mindrot.jbcrypt.BCrypt.gensalt());
    }

    /**
     *
     * @param plainPassword users plaintext password
     * @param hashedPasswordFromDB the hashed password generated via the hashPassword method
     * @return returns true if the passwords are matching and false if they are not
     */

    public static boolean checkPassword(String plainPassword,
                                        String hashedPasswordFromDB) {
        return org.mindrot.jbcrypt.BCrypt.checkpw(  plainPassword,
                                                    hashedPasswordFromDB);
    }
}
