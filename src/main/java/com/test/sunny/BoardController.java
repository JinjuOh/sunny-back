package com.test.sunny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class BoardController {

    @Autowired
    private BoardDao boardDao;

    @RequestMapping("/board/list")
    public List<Board> list() {
        return boardDao.findAll();
    }

    @RequestMapping("/board/write")
    public String write(@RequestBody Board board) {
        board.setDate(new Date());
        return "/detail/"+boardDao.save(board).getIdx();
    }

    @RequestMapping("/board/detail/{idx}")
    public Board detail(@PathVariable Integer idx) {
        return boardDao.findByIdx(idx);
    }

}
