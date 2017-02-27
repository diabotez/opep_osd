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
 * @abstract This class contains the medical teams. This is a singleton class.
 *
 * @author Diana Botez <dia.botez at gmail.com>
 */
public class MedicalTeams {
    private static MedicalTeams instance;

    private static List<Vector<MedicIdentifiers>> medicalTeams = new LinkedList<>();
    private static Vector<MedicIdentifiers> medicalTL = new Vector<>();

    private MedicalTeams() {
        int initialNumberOfTeamMembers = 5;

        for (int i = 0; i < Utils.doctorTeamsNumber; i++) {
//            MedicIdentifiers coordinator = new MedicIdentifiers("lastName", "firstName", "department");
            medicalTL.add(new MedicIdentifiers("lastName", "firstName", "department"));

            Vector<MedicIdentifiers> team = new Vector<>();
            for (int j = 0; j < initialNumberOfTeamMembers; j++) {
//                MedicIdentifiers member = new MedicIdentifiers(String.format("lastName " + (i + 1)), "firstName " + (j + 1), "department");
                team.add(new MedicIdentifiers(String.format("lastName " + (i + 1)), "firstName " + (j + 1), "department"));
            }
            medicalTeams.add(team);
        }
    }

    /**
     * This method returns the singleton instance of the MedicalTeams class.
     *
     * @return the singleton instance
     */
    public static MedicalTeams getInstance() {
        if (instance == null) {
            instance = new MedicalTeams();
        }
        return instance;
    }

    public static MedicIdentifiers getMedicCoordinator(int index) {
        return medicalTL.elementAt(index);
    }

    public static Vector<MedicIdentifiers> getMedicalTeam(int index) {
        return medicalTeams.get(index);
    }

    public static boolean existsTeamWithThisCoordinator(MedicIdentifiers coordinator) {
        if (medicalTL == null || medicalTL.isEmpty()) {
            return false;
        }
        for (MedicIdentifiers medicalTeamLead : medicalTL) {
            if (medicalTeamLead.getLastName().equals(coordinator.getLastName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean existsTeamWithThisMember(MedicIdentifiers member) {
        if (medicalTL == null || medicalTL.isEmpty()) {
            return false;
        }
        for (Vector<MedicIdentifiers> team : medicalTeams) {
            for (MedicIdentifiers teamMember : team) {
                if (teamMember.lastName.equals(member.lastName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * Check the names before using this method.
     *
     * @param coordinator
     * @param member
     */
    public static void addNewMedicalTeam(MedicIdentifiers coordinator, MedicIdentifiers member) {

        Vector<MedicIdentifiers> team = new Vector<>();

        if (medicalTL == null || medicalTL.isEmpty()) {
            //there is no medical team lead and should be no medical team
            //add the new members
            medicalTL = null;
            medicalTeams = null;

            medicalTL = new Vector<>();
            medicalTeams = new LinkedList<>();
        }

        team.add(member);
        medicalTL.add(coordinator);
        medicalTeams.add(team);
    }

    public static void addNewMedicToMedicalTeam(MedicIdentifiers coordinator, MedicIdentifiers member) {
        if (medicalTL == null || medicalTL.isEmpty()) {
            //there is no medical team lead and should be no medical team
            //add the new members
            medicalTL = null;
            medicalTeams = null;

            medicalTL = new Vector<>();
            Vector<MedicIdentifiers> team = new Vector<>();
            medicalTeams = new LinkedList<>();

            team.add(member);
            medicalTL.add(coordinator);
            medicalTeams.add(team);

            return;
        }

        for (MedicIdentifiers medicalTeamLead : medicalTL) {
            if (medicalTeamLead.lastName.equals(coordinator.lastName)) {
                //the coordinator was found. Add a new member to the team
                int idx = medicalTL.indexOf(medicalTeamLead);
                Vector<MedicIdentifiers> team = medicalTeams.get(idx);
                team.add(member);
                medicalTeams.set(idx, team);

                return;
            }
        }

        // the coordinator was not found. It means it is a new team. Add it.
        medicalTL.add(coordinator);
        Vector<MedicIdentifiers> team = new Vector<>();
        team.add(member);
        medicalTeams.add(team);
    }
}
