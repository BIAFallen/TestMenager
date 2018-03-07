package pl.fallen.testmenager.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TestCase")
public class TestCase {

    @Id
    @Column(name = "UID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Column(name = "Step")
    private Integer Step;

    @Column(name = "Summary")
    private String Summary;

    @Column(name = "ExpectedResult")
    private String ExpectedResult;

    @Column(name = "ExecutionType")
    private String ExecutionType;

    @ManyToOne
    @JoinColumn(name = "testsuite_id")
    private TestSuite testSuite;


}
