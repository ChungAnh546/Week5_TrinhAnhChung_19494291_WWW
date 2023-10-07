package vn.edu.iuh.fit.Week5.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "job_skill")
@AllArgsConstructor
@NoArgsConstructor
public class JobSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private long id;
    @Id
    @Column(name = "job_id")
    private long job_id;
}
