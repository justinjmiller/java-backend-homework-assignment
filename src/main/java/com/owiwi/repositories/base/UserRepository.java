package com.owiwi.repositories.base;

import com.owiwi.data.UserDatabase;
import com.owiwi.model.User;

import java.util.List;
import java.util.Objects;

public class UserRepository extends BaseRepository<Long, User>
{

    public UserRepository()
    {
        this.dataList = UserDatabase.generateUsers();
    }

    public List<User> getAll()
    {
        return dataList;
    }

    public User findById(Long id)
    {
        return dataList.stream().filter(x -> Objects.equals(x.getId(), id)).findFirst().orElse(null);
    }
}
