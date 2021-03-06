package org.iplatform.microservices.core.documentservice.bean;

import java.util.List;

public class DocumentListResponse {
	private List<DocumentDO> documents;
	private Integer size;
	private Boolean success = Boolean.TRUE;
	private String message;

	public List<DocumentDO> getDocuments() {
		return documents;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public void setDocuments(List<DocumentDO> documents) {
		this.documents = documents;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
