package by.rubakhin.entity;

import java.sql.Date;
import java.util.Objects;

public class Tasks {
    private int id;
    private String summary;
    private Date startDate;
    private Date endDate;
    private String assignee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasks tasks = (Tasks) o;
        return id == tasks.id &&
                Objects.equals(summary, tasks.summary) &&
                Objects.equals(startDate, tasks.startDate) &&
                Objects.equals(endDate, tasks.endDate) &&
                Objects.equals(assignee, tasks.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, summary, startDate, endDate, assignee);
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", assignee='" + assignee + '\'' +
                '}';
    }
}
