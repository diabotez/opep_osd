
package operationplanning;

/**
 * @abstract
 *
 * @author Diana Botez
 */
public
    class Utils
{
    /**/
    public static
        int doctorTeamsNumber = 5;

    /**/
    public static
 int operatingRoomNumber = 4;

    /**/
    public
        enum UserType
    {
        HEAD_OF_DEPARTMENT,
        MEDIC,
        UNKNOWN_TYPE
    }

    /**/
    public
        enum ValidateUser
    {
        VALIDATION_OK,
        UNKNOWN_USER,
        WRONG_PASSWORD,
        USER_ALREADY_EXISTS,
        INVALID_DATA
    }
}
