package com.example.cis350_final_project;

public class Class extends Group{

    protected String class_description;
    protected String class_instructor;

    public Class (int id, String name,String class_description, String class_instructor)
    {
        this.group_id=id;
        this.group_name=name;
        this.class_description = class_description;
        this.class_instructor = class_description;

    }


}
