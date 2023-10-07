package vn.edu.iuh.fit.Week5.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "candidate")
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "can_id")
    private long can_id;
    @Column(name = "dob")
    private Date dob;
    @OneToOne
    private Address address;
    @Column(name = "phone",length = 15)
    private String phone;
    @Column(name = "email",length = 255)
    private String email;
    @Column(name = "full_name")
    private String full_name;
}
