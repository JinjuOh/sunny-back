package com.test.sunny;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDao  extends JpaRepository<Board, Integer> {
    Board findByIdx(int idx);
}
