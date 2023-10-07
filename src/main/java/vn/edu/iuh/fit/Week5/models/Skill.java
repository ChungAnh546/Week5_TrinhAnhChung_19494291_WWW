package vn.edu.iuh.fit.Week5.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.Week5.enums.SkillType;

@Entity
@Data
@Table(name = "skill")
@AllArgsConstructor
@NoArgsConstructor

public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private long id;
    @Column(name = "skill_type")
    private SkillType skill_type;

}
