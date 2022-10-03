package com.garage.eindopdracht.repository;

import com.garage.eindopdracht.model.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
}
