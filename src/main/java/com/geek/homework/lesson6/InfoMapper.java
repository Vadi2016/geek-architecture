package com.geek.homework.lesson6;

import java.sql.Connection;
import java.util.List;

public interface InfoMapper {

    boolean insert(Info info);

    List<Info> readAllInfo();

    boolean update(Info info);

    boolean delete(Info info);


}
