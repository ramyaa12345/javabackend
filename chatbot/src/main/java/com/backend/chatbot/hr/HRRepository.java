package com.backend.chatbot.hr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface HRRepository extends CrudRepository<HR,Long>{

}
