package br.com.acrf.salareuniao.salareuniao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="meetingroom")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="date", nullable = false)
    private String date;

    @Column(name="starHour", nullable = false)
    private String startHour;

    @Column(name="endHour", nullable = false)
    private String endHour;

    @Override
    public String toString(){
        return " Room [id="+id+",name="+name
                +",date"+date+",starHour"+startHour
                +",endHour"+endHour +"]";
    }
}
