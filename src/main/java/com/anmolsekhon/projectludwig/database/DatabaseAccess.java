package com.anmolsekhon.projectludwig.database;

import com.anmolsekhon.projectludwig.beans.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatabaseAccess {

    @Autowired
    protected NamedParameterJdbcTemplate jdbc;

    public List<Song> getAllFilenames() {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        String query = "SELECT * From Songs";

        return jdbc.query(query, parameterSource, new BeanPropertyRowMapper<Song>(Song.class));
    }
    public void insertSong(Song song) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        String query = "INSERT INTO SONGS VALUES (NULL, :filename)";
        parameterSource.addValue("filename", song.getFilename());

        jdbc.update(query, parameterSource);
    }
}
