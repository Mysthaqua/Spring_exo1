package tibo.spring.exo.exo1.service;

import org.springframework.stereotype.Service;
import tibo.spring.exo.exo1.model.TODO;

import java.util.List;

@Service
public class TODOService {
    private final List<TODO> TODOs;

    public TODOService() {
        TODOs = List.of(
                new TODO("TODO1", "description1"),
                new TODO("TODO2", "description2"),
                new TODO("TODO3", "description3")
        );
        TODOs.get(2).setDone(true);
    }

    public TODO getOneTODO(String name) {
        return TODOs.stream().filter(todo -> todo.getName().equals(name)).findFirst().orElse(null);
    }

    public List<TODO> getAllTODOs() {
        return TODOs;
    }
}
