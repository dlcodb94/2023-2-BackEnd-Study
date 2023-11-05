package gdsc.backend.jpa;

import gdsc.backend.jpa.Doctor;
import gdsc.backend.jpa.Hospital;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class medicalDepartment {
    @Getter
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Hospital hospital;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Doctor> doctors;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

}