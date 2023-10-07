package vn.edu.iuh.fit.Week5.pks;

import vn.edu.iuh.fit.Week5.enums.SkillLevel;
import vn.edu.iuh.fit.Week5.models.Candidate;
import vn.edu.iuh.fit.Week5.models.Skill;

import java.io.Serializable;

public class CandidateSkillPK implements Serializable {
    private Candidate candidate;
    private Skill skill;
}
