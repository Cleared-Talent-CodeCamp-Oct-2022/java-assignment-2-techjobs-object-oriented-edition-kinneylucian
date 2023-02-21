package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Job)) {
            return false;
        }
        Job other = (Job) obj;
        return this.id == other.id;
    }

    public int hashCode() {
        return Integer.hashCode(id);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String idString = "ID: " + id;
        String nameString = "Name: " + (name != null && !name.isEmpty() ? name : "Data not available");
        String employerString = "Employer: " + (employer != null && employer.getValue() != null && !employer.getValue().isEmpty() ? employer.getValue() : "Data not available");
        String locationString = "Location: " + (location != null && location.getValue() != null && !location.getValue().isEmpty() ? location.getValue() : "Data not available");
        String positionTypeString = "Position Type: " + (positionType != null && positionType.getValue() != null && !positionType.getValue().isEmpty() ? positionType.getValue() : "Data not available");
        String coreCompetencyString = "Core Competency: " + (coreCompetency != null && coreCompetency.getValue() != null && !coreCompetency.getValue().isEmpty() ? coreCompetency.getValue() : "Data not available");

        return "\n" + idString + "\n" + nameString + "\n" + employerString + "\n" + locationString + "\n" + positionTypeString + "\n" + coreCompetencyString + "\n";
    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
