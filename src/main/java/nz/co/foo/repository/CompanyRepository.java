package nz.co.foo.repository;

/**
 * Created by u342597 on 08/01/2016.
 */
import nz.co.foo.domain.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company,Long>{
}