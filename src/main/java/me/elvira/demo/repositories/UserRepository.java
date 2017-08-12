package me.elvira.demo.repositories;

import me.elvira.demo.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>
{

}