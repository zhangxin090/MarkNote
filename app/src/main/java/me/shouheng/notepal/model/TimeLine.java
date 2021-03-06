package me.shouheng.notepal.model;


import me.shouheng.notepal.model.enums.ModelType;
import me.shouheng.notepal.model.enums.Operation;
import me.shouheng.notepal.provider.annotation.Column;
import me.shouheng.notepal.provider.annotation.Table;
import me.shouheng.notepal.provider.schema.TimelineSchema;

/**
 * Created by wangshouheng on 2017/8/13. */
@Table(name = TimelineSchema.TABLE_NAME)
public class TimeLine extends Model {

    @Column(name = TimelineSchema.OPERATION)
    private Operation operation;

    @Column(name = TimelineSchema.MODEL_CODE)
    private long modelCode;

    @Column(name = TimelineSchema.MODEL_NAME)
    private String modelName;

    @Column(name = TimelineSchema.MODEL_TYPE)
    private ModelType modelType;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public long getModelCode() {
        return modelCode;
    }

    public void setModelCode(long modelCode) {
        this.modelCode = modelCode;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ModelType getModelType() {
        return modelType;
    }

    public void setModelType(ModelType modelType) {
        this.modelType = modelType;
    }

    @Override
    public String toString() {
        return "TimeLine{" +
                "operation=" + (operation == null ? null : operation.name()) +
                ", modelCode=" + modelCode +
                ", modelName='" + modelName + '\'' +
                ", modelType=" + (modelType == null ? null : modelType.name()) +
                "} " + super.toString();
    }
}
