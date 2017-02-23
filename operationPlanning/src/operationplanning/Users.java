/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationplanning;

import java.util.Vector;

/**
 * This class contains the usernames, passwords and types for each username.
 * This is a singleton class.
 * 
 * @author Diana Botez
 */
public
    class Users
{
    private static
        Users instance = null;

    /**
     * TODO: Encrypt them.
     */
    private static
        Vector<String> users = new Vector<String>(2);
    private static
        Vector<String> passwords = new Vector<String>(2);
    private static
        Vector<Utils.UserType> userTypes = new Vector<Utils.UserType>(2);

    /**
     * The constructor of this class.
     */
    private
        Users()
    {
        users.add("admin");
        users.add("user");
        passwords.add("1234");
        passwords.add("1234");
        userTypes.add(Utils.UserType.HEAD_OF_DEPARTMENT);
        userTypes.add(Utils.UserType.MEDIC);
    }

    /**
     * This method returns the singleton instance of the class Users.
     * 
     * @return the singleton instance of the class
     */
    public static
        Users GetInstance()
    {
        if (instance == null) {
            instance = new Users();
        }
        return instance;
    }

    /**
     * This method checks if there is any user in Data Base with the given name.
     *
     * @param userName - the given user name to be searched in the data base
     *
     * @return VALIDATION_OK - if the user name was found in the data base or UNKNOWN_USER if not
     */
    public static
        Utils.ValidateUser ValidateUserName(String userName)
    {
        if (userName == null)
        {
            return Utils.ValidateUser.UNKNOWN_USER;
        }
        
        for (String user : users) {
            if (user.equals(userName)) {
                return Utils.ValidateUser.VALIDATION_OK;
            }
        }

        return Utils.ValidateUser.UNKNOWN_USER;
    }

    /**
     * This method checks if the given user name is in the data base and if it has the given password.
     * 
     * @param userName - the given user name to be checked
     * @param userPassword - the given password to be checked
     *
     * @return VALIDATION_OK if there is a user name with the given password, WRONG_PASSWORD if the given password for the username is not the same with the one that exists in the data base, UNKNOWN_USER if there is no such user name in the data base
     */
    public static
        Utils.ValidateUser ValidateUserPassword(String userName, String userPassword)
    {
        if (userName == null)
        {
            return Utils.ValidateUser.UNKNOWN_USER;
        }
        else if (userPassword == null)
        {
            return Utils.ValidateUser.WRONG_PASSWORD;
        }
        
        for (String user : users) {
            if (user.equals(userName)) {
                int idx = users.indexOf(user);
                if (passwords.get(idx).equals(userPassword)) {
                    return Utils.ValidateUser.VALIDATION_OK;
                }
                else {
                    return Utils.ValidateUser.WRONG_PASSWORD;
                }
            }
        }

        return Utils.ValidateUser.UNKNOWN_USER;
    }

    /**
     * This method returns the type of the given user name.
     * 
     * @param userName - the given user name to be checked
     *
     * @return the type of the given user name or UNKNOWN_TYPE if there is no such user name
     */
    public static
        Utils.UserType GetUserType(String userName)
    {
        for (String user : users) {
            if (user.equals(userName)) {
                int idx = users.indexOf(user);
                return userTypes.get(idx);
            }
        }

        return Utils.UserType.UNKNOWN_TYPE;
    }

    /**
     * This method adds a new user in the data base, along with it's password and type.
     * 
     * @param userName - the given user name for the new user
     * @param password - the given password for the new user
     * @param userType - the given type for the new user
     *
     * @return USER_ALREADY_EXISTS if the user name already exists in the data base or VALIDATION_OK if the user was successfully added
     */
    public static
        Utils.ValidateUser AddNewUser(String userName, String password, Utils.UserType userType)
    {
        if (userName == null || password == null || userType == null)
        {
            return Utils.ValidateUser.INVALID_DATA;
        }
        
        if (users.contains(userName)) {
            return Utils.ValidateUser.USER_ALREADY_EXISTS;
        }

        /* Add the new user. */
        users.add(userName);
        passwords.add(password);
        userTypes.add(userType);

        return Utils.ValidateUser.VALIDATION_OK;
    }

    /**
     * This method sets a new password for the given user name.
     * 
     * @param userName - the given user name for the password to be change
     * @param newPassword - the new password for the given user name
     *
     * @return UNKNOWN_USER if the user name is not in the data base or VALIDATION_OK if the password was successfully modified
     */
    public static
        Utils.ValidateUser ChangePasswordForUser(String userName, String newPassword)
    {
        if (!users.contains(userName)) {
            return Utils.ValidateUser.UNKNOWN_USER;
        }
        
        int idx = users.indexOf(userName);
        passwords.set(idx, newPassword);
        
        return Utils.ValidateUser.VALIDATION_OK;
    }
     
    /**
     *  This method changes the type of the given user name.
     * 
     * @param userName - the given user name for the type to be change
     * @param newType - the new type for the given user name
     * 
     * @return UNKNOWN_USER if the user name is not in the data base or VALIDATION_OK if the user type was successfully modified
     */
    public static
        Utils.ValidateUser ChangePasswordForUser(String userName, Utils.UserType newType)
    {
        if (!users.contains(userName)) {
            return Utils.ValidateUser.UNKNOWN_USER;
        }
        
        int idx = users.indexOf(userName);
        userTypes.set(idx, newType);
        
        return Utils.ValidateUser.VALIDATION_OK;
    }

}
