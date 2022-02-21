package kisa.team.exercisesservice.model;

import kisa.team.exercisesservice.model.sentence.Todo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data


@Entity
@Table(name = "EXERCISE")
public class Exercise {
    @Id
    @SequenceGenerator(
            name = "exercise_sequence",
            sequenceName = "exercise_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "exercise_sequence"
    )
    @Column(name = "ID", updatable = false)
    private Long id;
    @Column(name = "TITLE", nullable = false)
    private String title;
    private int selected;
    @OneToMany
    @JoinColumn(name = "EXERCISE_ID", referencedColumnName = "ID")
    private List<Todo> todos;
}
