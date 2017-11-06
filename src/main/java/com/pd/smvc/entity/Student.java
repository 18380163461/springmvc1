package com.pd.smvc.entity;


//import javax.validation.constraints.NotNull;

//import javax.validation.constraints.Size;

public class Student {
//    @NotNull(message = "id不能为空！")
    private String id;
//    @NotNull(message = "姓名不能为空！")
//    @Size(min = 3, max = 6, message = "姓名应该为{min}-{max}个字符")
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
//        javax.validation.ValidatorFactory
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
