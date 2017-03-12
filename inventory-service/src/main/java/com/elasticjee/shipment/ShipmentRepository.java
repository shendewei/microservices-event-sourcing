package com.elasticjee.shipment;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * @author chaokunyang
 */
@Repository
public interface ShipmentRepository extends GraphRepository<Shipment> {
}