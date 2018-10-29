package com.itss.spring.mapper;

import com.itss.spring.entities.Tutorial;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TutorialRowMapper implements RowMapper<Tutorial> {

    @Override
    public Tutorial mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
