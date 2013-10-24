package org.gitlab.api.models;

import org.codehaus.jackson.annotate.JsonProperty;

public class GitlabMergeRequest {
    public static final String URL = "/merge_requests";

    private Integer _id;
    private Integer _iid;
    private String _title;
    private String _state;
    private boolean _closed;
    private boolean _merged;
    private GitlabUser _author;
    private GitlabUser _assignee;

    @JsonProperty("target_branch")
    private String _targetBranch;

    @JsonProperty("source_branch")
    private String _sourceBranch;

    @JsonProperty("target_project_id")
    private Integer _targetProjectId;

    @JsonProperty("source_project_id")
    private Integer _sourceProjectId;

    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        _id = id;
    }
    
    public Integer getIid() {
        return _iid;
    }
    
    public void setIid(Integer iid) {
        _iid = iid;
    }

    public String getTargetBranch() {
        return _targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        _targetBranch = targetBranch;
    }

    public String getSourceBranch() {
        return _sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        _sourceBranch = sourceBranch;
    }

    public Integer getTargetProjectId() {
        return _targetProjectId;
    }

    public void setTargetProjectId(Integer projectId) {
        _targetProjectId = projectId;
    }

    public Integer getSourceProjectId() {
        return _sourceProjectId;
    }

    public void setSourceProjectId(Integer projectId) {
        _sourceProjectId = projectId;
    }


    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public boolean isClosed() {
        return _closed;
    }

    public void setClosed(boolean closed) {
        _closed = closed;
    }

    public boolean isMerged() {
        return _merged;
    }

    public void setMerged(boolean merged) {
        _merged = merged;
    }

    public GitlabUser getAuthor() {
        return _author;
    }

    public void setAuthor(GitlabUser author) {
        _author = author;
    }

    public GitlabUser getAssignee() {
        return _assignee;
    }

    public void setAssignee(GitlabUser assignee) {
        _assignee = assignee;
    }

    public String getState() {
        return _state;
    }

    public void setState(String state) {
        _state = state;
        if(state != null) {
            _closed = state.equals("closed");
            _merged = state.equals("merged");
        }
    }
}
