package pl.fallen.testmenager.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Project")
public class Project {

    @Id
    @Column(name = "UID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Column(name = "ProjectName")
    private String projectName;

    @Column(name = "Description")

    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
    private List<TestSuite> testSuiteList;

    




}


