package gdsc.backend.jpa;

import gdsc.backend.jpa.Doctor;
import gdsc.backend.jpa.Patient;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import java.util.Date;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reservation {
    @Getter
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date time;

    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patients;

    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctors;

    public void setId(Long id) {
        this.id = id;
    }

}
