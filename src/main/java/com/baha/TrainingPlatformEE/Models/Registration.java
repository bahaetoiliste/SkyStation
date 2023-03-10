package com.baha.TrainingPlatformEE.Models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Builder
@Table(name = "RegistrationTable")
public class Registration extends AbstractEntity{
    @Id
    private Long  numRegistration ;
    private int numWeek ;
    @ManyToOne()
    @JoinColumn(name = "NumCourse")
    private Course course ;

    @ManyToOne()
    @JoinColumn(name = "NumSkier")
    private Skier skier ;
}
