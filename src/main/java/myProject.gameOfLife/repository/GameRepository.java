package myProject.gameOfLife.repository;

import myProject.gameOfLife.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Long> {
}
