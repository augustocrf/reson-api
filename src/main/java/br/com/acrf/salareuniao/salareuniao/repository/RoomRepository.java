package br.com.acrf.salareuniao.salareuniao.repository;

import br.com.acrf.salareuniao.salareuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
