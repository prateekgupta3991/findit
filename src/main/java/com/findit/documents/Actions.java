package com.findit.documents;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@Data
@Builder
@SolrDocument(collection = "Helloworld")
public class Actions {

    @Indexed(name = "commType", type = "Integer")
    private Integer commTypeId;

    @Indexed(name = "content", type = "String")
    private String commContent;

    @Indexed(name = "eventTitle", type = "String")
    private String eventTitle;

    @Indexed(name = "meta", type = "String")
    private String meta;
}
