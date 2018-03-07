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
@Table(name = "TestSuite")
public class TestSuite {

    @Id
    @Column(name = "UID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Column(name = "TestSuiteName")
    private String testSuiteName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "testSuite")
    private List<TestCase> testCaseList;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;





}
