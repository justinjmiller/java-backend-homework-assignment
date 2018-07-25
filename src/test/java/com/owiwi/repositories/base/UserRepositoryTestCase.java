package com.owiwi.repositories.base;

import com.owiwi.model.User;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class UserRepositoryTestCase
{
    private static UserRepository repository = new UserRepository();

    @Test
    public void testGetAll() throws Exception {
        assertTrue(repository.getAll().size() > 0);
    }

    @Test
    public void testFindById() throws Exception {
        User user = repository.findById(1l);
        assertNotNull(user);
    }

}
