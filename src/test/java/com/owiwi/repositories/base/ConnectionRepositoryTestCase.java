package com.owiwi.repositories.base;


import com.owiwi.model.Connection;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertNotNull;

public class ConnectionRepositoryTestCase
{
    private static ConnectionRepository repository = new ConnectionRepository();

    @Test
    public void testGetAll() throws Exception {
        assertTrue(repository.getAll().size() > 0);
    }

    @Test
    public void testFindById() throws Exception {
        Connection con = repository.findById(1l);
        assertNotNull(con);
    }
}
