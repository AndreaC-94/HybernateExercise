package co.develhope.HybernateExercise.entities;

import javax.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long enrollmentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "student_id")
    private Student students;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "class_id")
    private Class classes;
}
