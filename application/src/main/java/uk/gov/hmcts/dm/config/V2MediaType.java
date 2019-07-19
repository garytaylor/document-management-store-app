package uk.gov.hmcts.dm.config;

import org.springframework.http.MediaType;

public class V2MediaType extends MediaType {

    public static final String V2_HAL_DOCUMENT_AND_METADATA_COLLECTION_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.document-and-metadata-collection.v2+hal+json;charset=UTF-8";

    public static final MediaType V2_HAL_DOCUMENT_AND_METADATA_COLLECTION_MEDIA_TYPE =
            valueOf(V2_HAL_DOCUMENT_AND_METADATA_COLLECTION_MEDIA_TYPE_VALUE);

    public static final String V2_HAL_DOCUMENT_PAGE_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.document-page.v2+hal+json;charset=UTF-8";

    public static final MediaType V2_HAL_DOCUMENT_PAGE_MEDIA_TYPE = valueOf(V2_HAL_DOCUMENT_PAGE_MEDIA_TYPE_VALUE);

    public static final String V2_HAL_DOCUMENT_COLLECTION_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.document-collection.v2+hal+json;charset=UTF-8";

    public static final MediaType V2_HAL_DOCUMENT_COLLECTION_MEDIA_TYPE =
            valueOf(V2_HAL_DOCUMENT_COLLECTION_MEDIA_TYPE_VALUE);

    public static final String V2_HAL_DOCUMENT_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.document.v2+hal+json;charset=UTF-8";

    public static final MediaType V2_HAL_DOCUMENT_MEDIA_TYPE = valueOf(V2_HAL_DOCUMENT_MEDIA_TYPE_VALUE);

    public static final String V2_HAL_FOLDER_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.folder.v2+hal+json;charset=UTF-8";

    public static final MediaType V2_HAL_FOLDER_MEDIA_TYPE = valueOf(V2_HAL_FOLDER_MEDIA_TYPE_VALUE);

    public static final String V2_HAL_DOCUMENT_CONTENT_VERSION_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.documentContentVersion.v2+hal+json;charset=UTF-8";

    public static final MediaType V2_HAL_DOCUMENT_CONTENT_VERSION_MEDIA_TYPE =
            valueOf(V2_HAL_DOCUMENT_CONTENT_VERSION_MEDIA_TYPE_VALUE);

    public static final String V2_HAL_AUDIT_ENTRY_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.auditEntry.v2+hal+json;charset=UTF-8";

    public static final MediaType V2_HAL_AUDIT_ENTRY_MEDIA_TYPE = valueOf(V2_HAL_AUDIT_ENTRY_MEDIA_TYPE_VALUE);

    public static final String V2_HAL_AUDIT_ENTRY_COLLECTION_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.auditEntry-collection.v2+hal+json;charset=UTF-8";

    public static final MediaType V2_HAL_AUDIT_ENTRY_COLLECTION_MEDIA_TYPE =
            valueOf(V2_HAL_AUDIT_ENTRY_COLLECTION_MEDIA_TYPE_VALUE);

    public static final String V2_DOCUMENT_COLLECTION_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.document-collection.v2+json;charset=UTF-8";

    public static final MediaType V2_DOCUMENT_COLLECTION_MEDIA_TYPE =
            valueOf(V2_DOCUMENT_COLLECTION_MEDIA_TYPE_VALUE);

    public static final String V2_DOCUMENT_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.document.v2+json;charset=UTF-8";

    public static final MediaType V2_DOCUMENT_MEDIA_TYPE = valueOf(V2_DOCUMENT_MEDIA_TYPE_VALUE);

    public static final String V2_FOLDER_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.folder.v2+json;charset=UTF-8";

    public static final MediaType V2_FOLDER_MEDIA_TYPE = valueOf(V2_FOLDER_MEDIA_TYPE_VALUE);

    public static final String V2_DOCUMENT_CONTENT_VERSION_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.documentContentVersion.v2+json;charset=UTF-8";

    public static final MediaType V2_DOCUMENT_CONTENT_VERSION_MEDIA_TYPE =
            valueOf(V2_DOCUMENT_CONTENT_VERSION_MEDIA_TYPE_VALUE);

    public static final String V2_AUDIT_ENTRY_MEDIA_TYPE_VALUE =
            "application/vnd.uk.gov.hmcts.dm.auditEntry.v2+json;charset=UTF-8";

    public static final MediaType V2_AUDIT_ENTRY_MEDIA_TYPE = valueOf(V2_AUDIT_ENTRY_MEDIA_TYPE_VALUE);

    public V2MediaType(String type, String subtype) {
        super(type, subtype);
    }


}
