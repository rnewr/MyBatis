package com.ohgiraffers.section01.xmlmapper;


import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlmapper.Template.getSqlSession;

public class TestService {

    private static ElementTestMapper mapper;

    public static void selectAllEmp() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<EmpDTO> empList = mapper.selectAllEmp();

        for(int i = 0; i < empList.size(); i++){
            System.out.println(empList);
        }

    }
}
