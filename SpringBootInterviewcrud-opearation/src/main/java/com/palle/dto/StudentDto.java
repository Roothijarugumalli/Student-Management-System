package com.palle.dto;


import jakarta.validation.constraints.*;

public class StudentDto {

    @NotBlank(message = "Name cannot be empty")
    private String sName;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email cannot be empty")
    private String eMail;

    @Pattern(regexp = "^\\d{10}$", message = "Mobile must be 10 digits")
    private String mobile;

    @NotNull(message = "Age is required")
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 60, message = "Age must be at most 60")
    private Integer age;
 
    @NotBlank(message = "Gender cannot be empty")
    private String gender;
   

    // Default Constructor
    public StudentDto() {
    }

    // Parameterized Constructor
    public StudentDto(String sName, String eMail, String mobile, Integer age, String gender) {
        this.sName = sName;
        this.eMail = eMail;
        this.mobile = mobile;
        this.age = age;
        this.gender = gender;
    }

    // Getters and Setters
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
