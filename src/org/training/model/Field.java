package org.training.model;

import java.util.List;

public class Field {

    private int classesId;
    private String className;
    private List<Integer> schools;

    public Field(int classesId, String className, List<Integer>schools){
        this.classesId=classesId;
        this.className = className;
        this.schools= schools;
    }

    public int getClassesId() {
        return classesId;
    }

    public void setClassesId(int classesId) {
        this.classesId = classesId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Integer> getSchools() {
        return schools;
    }

    public void setSchools(List<Integer> schools) {
        this.schools = schools;
    }
}
