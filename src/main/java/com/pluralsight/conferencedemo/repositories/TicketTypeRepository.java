package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.TicketTypesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketTypeRepository extends JpaRepository<TicketTypesEntity, Long> {




}
