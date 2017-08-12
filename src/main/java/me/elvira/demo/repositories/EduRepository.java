package me.elvira.demo.repositories;

import me.elvira.demo.Educations;
import org.springframework.data.repository.CrudRepository;

public interface EduRepository extends CrudRepository<Educations,Long>
{

}