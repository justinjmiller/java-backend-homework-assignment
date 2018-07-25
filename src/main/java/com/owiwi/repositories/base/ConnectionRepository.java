package com.owiwi.repositories.base;

import com.owiwi.data.ConnectionDatabase;
import com.owiwi.model.Connection;

import java.util.List;
import java.util.Objects;

public class ConnectionRepository extends BaseRepository<Long, Connection>
{

    public ConnectionRepository()
    {
        this.dataList = ConnectionDatabase.generateConnections();
    }

    public List<Connection> getAll()
    {
        return dataList;
    }

    public Connection findById(Long id)
    {
        return dataList.stream().filter(x -> Objects.equals(x.getId(), id)).findFirst().orElse(null);
    }
}
