package shin.spring.mvc.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shin.spring.mvc.mapper.BoardMapper;
import shin.spring.mvc.vo.BoardVO;

import javax.annotation.Resource;


@Service
public class IndexService {

    @Autowired
    BoardMapper mapper;

    public BoardVO getList() {
        return mapper.getList().get(0);
    }
}
