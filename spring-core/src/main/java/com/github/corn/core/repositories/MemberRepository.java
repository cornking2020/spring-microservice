package com.github.corn.core.repositories;

import com.github.corn.core.models.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "members", path = "members")
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
}
