package com.findit.repository;

import com.findit.documents.Helloworld;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HelloworldRepository extends SolrCrudRepository<Helloworld, Long> {

    List<Helloworld> findBySegmentType(String segType);

    @Query("trigger_id:*?0* OR segmentType:*?0*")
    List<Helloworld> findByCustomQuery(String searchTerm);

    @Query(name = "helloworld.findByNamedQuery")
    Page<Helloworld> findByNamedQuery(String searchTerm, Pageable pageable);
}
