package service;

import com.example.ktnc_01.model.Sach;
import com.example.ktnc_01.service.sachService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class TestSach {
    List<Sach> list;
    Sach sach;

    @BeforeEach
    public void setUp() {
        list = new ArrayList<>();
        sach = new Sach("S001", "GD", "abc", 2005, 20000);
        list.add(sach);
    }

    sachService sachService = new sachService();

    @Test
    public void testUpdateValidTenSach(){
        sachService.update(list, new Sach("S001", "KH", "abc", 2005, 20000), 0);

        String exp = "KH";
        String act = list.get(0).getTenSach();

        Assertions.assertEquals(exp, act);

    }

    @Test
    public void testUpdateValidSach(){
        sachService.update(list, new Sach("S001", "KH", "abc", 2005, 20000), 0);

        String exp = "KH";
        String act = list.get(0).getTenSach();

        Assertions.assertEquals(exp, act);

    }


    @Test
    public void testUpdateInValidSach(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->{sachService.update(list, null,  0);});

        String exp = "Sach khong duoc de trong";
        String act = exception.getMessage();

        Assertions.assertEquals(exp, act);

    }

    @Test
    public void testUpdateInValidMa(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->{sachService.update(list, new Sach("", "GD", "abc", 2005, 20000),  0);});

        String exp = "Ma khong duoc de trong";
        String act = exception.getMessage();

        Assertions.assertEquals(exp, act);

    }

    @Test
    public void testUpdateInValidTen(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->{sachService.update(list, new Sach("S001", "", "abc", 2005, 20000),  0);});

        String exp = "Ten khong duoc de trong";
        String act = exception.getMessage();

        Assertions.assertEquals(exp, act);

    }
}
