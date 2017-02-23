
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
    public static final
        int MAX_NUMBER_OF_TEAMS = 20;

    /**/
    public static final
        int MAX_NUMBER_OF_OR = 20;

    /**/
    public static
        int doctorTeamsNumber = 5;

    /**/
    public static
        int operatingRoomNumber = 3;

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
