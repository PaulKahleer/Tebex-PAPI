package it.coralmc.tebexpapi.tebex.communitygoals;

import java.time.OffsetDateTime;

public class CommunityGoal {
    private Long id;
    //These fields cause lots of Gson issues for some reason.
    //Don't think they're necessary right now anyway
    /*
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    */
    private Long account;
    private String name;
    private String description;
    private String image;
    private String target;
    private String current;
    private Long repeatable;
    private Object lastAchieved;
    private Long timesAchieved;
    private String status;
    private Long sale;

    public Long getid() { return id; }
    public void setid(Long value) { this.id = value; }

    //Getters and setters for problematic fields
    /*
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime value) { this.createdAt = value; }

    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(OffsetDateTime value) { this.updatedAt = value; }
     */

    public Long getAccount() { return account; }
    public void setAccount(Long value) { this.account = value; }

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

    public Long getRepeatable() { return repeatable; }
    public void setRepeatable(Long value) { this.repeatable = value; }

    public Object getLastAchieved() { return lastAchieved; }
    public void setLastAchieved(Object value) { this.lastAchieved = value; }

    public Long getTimesAchieved() { return timesAchieved; }
    public void setTimesAchieved(Long value) { this.timesAchieved = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public Long getSale() { return sale; }
    public void setSale(Long value) { this.sale = value; }
}
