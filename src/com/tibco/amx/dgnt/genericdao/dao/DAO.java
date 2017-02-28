package com.tibco.amx.dgnt.genericdao.dao;

import java.util.List;


public interface DAO {

    /**
     * Returns a list of all users from the database ordered by user ID. The list is never null and
     * is empty when the database does not contain any user.
     * @return A list of all users from the database ordered by user ID.
     * @throws DAOException If something fails at database level.
     */
    public List<?> list() throws DAOException;

}
