package patterns.task9;

import java.util.Date;

public abstract class AbstractEntity {
    public int id;
    public Date createdTime;
    public Date updatedTime;

    public AbstractEntity() {
    }

    public AbstractEntity(AbstractEntity entity) {
        this.id = entity.id;
        this.createdTime = entity.createdTime;
        this.updatedTime = entity.updatedTime;
    }

    public abstract AbstractEntity clone();
}
