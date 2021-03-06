package muiz.demo.abac.data.repositories;

import muiz.demo.abac.data.entities.Department;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends Neo4jRepository<Department, Long> {
}
