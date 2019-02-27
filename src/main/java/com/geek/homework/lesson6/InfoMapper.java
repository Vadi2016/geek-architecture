package com.geek.homework.lesson6;

import java.util.Map;

public interface InfoMapper {

    boolean insert(Info info);

    Map<Long, Info> readAllInfo(Info info);

    boolean update(Info info);

    boolean delete(Info info);


}
