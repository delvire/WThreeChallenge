package me.elvira.demo.repositories;

import me.elvira.demo.Experiences;
import org.springframework.data.repository.CrudRepository;

public interface ExpRepository extends CrudRepository<Experiences,Long>
{

}