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

/**
 *
 * @author Diana Botez <dia.botez at gmail.com>
 */
public class MedicIdentifiers {
    public String lastName;
    public String firstName;
    public String department;

    public MedicIdentifiers() {
        lastName = new String();
        firstName = new String();
        department = new String();
    }

    public MedicIdentifiers(String lastName, String firstName, String department) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param aLastName the lastName to set
     */
    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param aFirstName the firstName to set
     */
    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param aDepartment the department to set
     */
    public void setDepartment(String aDepartment) {
        department = aDepartment;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (!MedicIdentifiers.class.isAssignableFrom(obj.getClass())) {
//            return false;
//        }
//        final MedicIdentifiers other = (MedicIdentifiers) obj;
//        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
//            return false;
//        }
//        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
//            return false;
//        }
//        if ((this.department == null) ? (other.department != null) : !this.department.equals(other.department)) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 53 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
//        hash = 53 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
//        hash = 53 * hash + (this.department != null ? this.department.hashCode() : 0);
//
//        return hash;
//    }
}
