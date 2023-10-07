package vn.edu.iuh.fit.Week5.enums;

import vn.edu.iuh.fit.Week5.models.Skill;

public enum SkillLevel {
    MASTER(1),
        BEGINER(2),
            ADVANCED(3),
                PROFESSIONAL(4),
                    IMTERMEDIATE(5);
    private int type;
    SkillLevel(int type){
        this.type = type;
    }
    public int getType()
    {
        return type;
    }

}
