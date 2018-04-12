package be.niels.jpaskeleton.domain.division;

import javax.persistence.*;

@Entity
@Table(name="DIVISIONS")
public class Division {

    @Id
    @Column(name="ID")
    @SequenceGenerator(name="division_seq", sequenceName = "DIVISIONS_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "division_seq")
    private Integer id;
    @Column(name="NAME")
    private String name;
    @Column(name="ORIGINALNAME")
    private String originalName;
    @Column(name="DIRECTOR")
    private String director;
    @Column(name="PARENTDIVISION")
    private Integer parentDivision;

    private Division() {
    }

    public Division(String name, String originalName, String director, Integer parentDivision) {
        this.name = name;
        this.originalName = originalName;
        this.director = director;
        this.parentDivision = parentDivision;
    }

    public Division(String name, String originalName, String director) {
        this.name = name;
        this.originalName = originalName;
        this.director = director;
    }


    public Integer getId() {
        return id;

    }
}
