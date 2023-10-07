package vn.edu.iuh.fit.Week5.enums;

public enum SkillType {
    SOFT_SKILL(1),TECHNICAL_SKILL(2),UNSPECIFIC(0);

    private int value;
     SkillType(int value){
    this.value = value;
    }
    public int getValue(){
         return value;
    }
}
