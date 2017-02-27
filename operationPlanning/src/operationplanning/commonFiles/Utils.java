/*
 * Copyright (C) 2017 Diana Botez <dia.botez at gmail.com> - All Rights Reserved
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * Althering the content of this licence under any circumstances
 * is strictly forbidden.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 */
package operationplanning.commonFiles;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @abstract
 *
 * @author Diana Botez <dia.botez at gmail.com>
 */
public class Utils {
    /**/
    public static int doctorTeamsNumber = 5;

    /**/
    public static int operatingRoomNumber = 4;

    /**/
    public enum UserType {
        HEAD_OF_DEPARTMENT,
        MEDIC,
        UNKNOWN_TYPE
    }

    /**/
    public enum ValidateUser {
        VALIDATION_OK,
        UNKNOWN_USER,
        WRONG_PASSWORD,
        USER_ALREADY_EXISTS,
        INVALID_DATA
    }
//
//    public enum ValidateMedicName {
//        VALIDATION_OK,
//        UNKNOWN_COORDINATOR_NAME,
//
//    }
}
