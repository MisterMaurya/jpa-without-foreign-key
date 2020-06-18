package io.pro.jpawithoutforeignkey.repository;

import io.pro.jpawithoutforeignkey.domain.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/***
 * @author Pawan Maurya
 * @since June 16, 2020
 */

@Repository
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
}
