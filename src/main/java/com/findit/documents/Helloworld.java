package com.findit.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SolrDocument(collection = "helloworld")
public class Helloworld {

    @Id
    @Indexed(name = "trigger_id", type = "Long")
    private Long triggerId;

    @Indexed(name = "source", type = "Long")
    private Long source;

    @Indexed(name = "uniqueId", type = "Long")
    private Long uniqueId;

    @Indexed(name = "segmentId", type = "Long")
    private Long segmentId;

    @Indexed(name = "segmentType", type = "String")
    private String segmentType;

    @Indexed(name = "journeyId", type = "Long")
    private Long journeyId;

    @Indexed(name = "actions", type = "String")
    private String actions;
}
