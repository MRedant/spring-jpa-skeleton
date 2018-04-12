package be.niels.jpaskeleton.repository.division;

import be.niels.jpaskeleton.Application;
import be.niels.jpaskeleton.domain.division.Division;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class DivisionRepositoryTest {

    @Autowired
    private DivisionRepository divisionRepository;

//    public DivisionRepositoryTest() {
//    }

//    @Autowired
//    public DivisionRepositoryTest(DivisionRepository divisionRepository) {
//        this.divisionRepository = divisionRepository;
//    }

    @Test
    public void save_createDivisionReturnsDivisionWithId() {
        //GIVEN

        //WHEN
        Division returnedDivision = divisionRepository.save(new Division("DivisionABC","SomeOldName","Maarten Supreme Leader"));
        //THEN
        Assertions.assertThat(returnedDivision).isNotNull();
        Assertions.assertThat(returnedDivision.getId()).isNotZero();
    }

}

