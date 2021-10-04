package it.coralmc.tebexpapi.tebex.communitygoals;

import java.time.OffsetDateTime;

public class CommunityGoal {
    private long id;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private long account;
    private String name;
    private String description;
    private String image;
    private String target;
    private String current;
    private long repeatable;
    private Object lastAchieved;
    private long timesAchieved;
    private String status;
    private long sale;

    public long getid() { return id; }
    public void setid(long value) { this.id = value; }

    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime value) { this.createdAt = value; }

    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(OffsetDateTime value) { this.updatedAt = value; }

    public long getAccount() { return account; }
    public void setAccount(long value) { this.account = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public String getImage() { return image; }
    public void setImage(String value) { this.image = value; }

    public String getTarget() { return target; }
    public void setTarget(String value) { this.target = value; }

    public String getCurrent() { return current; }
    public void setCurrent(String value) { this.current = value; }

    public long getRepeatable() { return repeatable; }
    public void setRepeatable(long value) { this.repeatable = value; }

    public Object getLastAchieved() { return lastAchieved; }
    public void setLastAchieved(Object value) { this.lastAchieved = value; }

    public long getTimesAchieved() { return timesAchieved; }
    public void setTimesAchieved(long value) { this.timesAchieved = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public long getSale() { return sale; }
    public void setSale(long value) { this.sale = value; }
}