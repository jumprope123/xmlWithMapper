package shin.spring.mvc.mapper;

import shin.spring.mvc.config.MapperInterface;
import shin.spring.mvc.vo.BoardVO;

import java.util.List;

@MapperInterface
public interface BoardMapper {

    List<BoardVO> getList();

}
