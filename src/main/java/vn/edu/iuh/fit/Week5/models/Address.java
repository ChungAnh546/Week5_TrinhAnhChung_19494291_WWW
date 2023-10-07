package vn.edu.iuh.fit.Week5.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private long id;

    @Column(name = "country")
    private CountryCode country;
    @Column(name = "zipcode", length = 7)
    private String zipcode;
    @Column(name = "number", length = 20)
    private String number;
    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "street", length = 150)
    private String street;
    @OneToOne
    private Company company;
}
