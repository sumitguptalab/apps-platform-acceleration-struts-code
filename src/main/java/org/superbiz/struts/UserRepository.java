package org.superbiz.struts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public List<User> findAllByFirstName(String firstName);
    public List<User> findAllByFirstNameOrderByLastName(String firstName);

    @Query("Select * where id between :startId and :endId")
    public List<User> findWhereIdBetween(Long startId, Long endId);

}
