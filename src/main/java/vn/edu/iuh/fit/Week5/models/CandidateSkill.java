package vn.edu.iuh.fit.Week5.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.Week5.enums.SkillLevel;
import vn.edu.iuh.fit.Week5.pks.CandidateSkillPK;

@Entity
@Data
@Table(name = "candidate_skill")
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CandidateSkillPK.class)
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Column(name = "skill_level")
    private SkillLevel skillLevel;
    @Column(name = "more_infos",length = 1000)
    private String more_infos;
}
