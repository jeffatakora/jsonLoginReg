package com.example.jeff.jsonloginreg;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Headmaster {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("school_name")
    @Expose
    private String schoolName;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("school_password")
    @Expose
    private String schoolPassword;
    @SerializedName("school_password_hash")
    @Expose
    private Object schoolPasswordHash;
    @SerializedName("ghana_post_gps")
    @Expose
    private Object ghanaPostGps;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("school_phone")
    @Expose
    private Object schoolPhone;
    @SerializedName("school_email")
    @Expose
    private Object schoolEmail;
    @SerializedName("head_name")
    @Expose
    private String headName;
    @SerializedName("head_phone")
    @Expose
    private Object headPhone;
    @SerializedName("head_email")
    @Expose
    private Object headEmail;
    @SerializedName("ict_officer_name")
    @Expose
    private Object ictOfficerName;
    @SerializedName("ict_officer_phone")
    @Expose
    private Object ictOfficerPhone;
    @SerializedName("ict_officer_email")
    @Expose
    private Object ictOfficerEmail;
    @SerializedName("school_digital_address")
    @Expose
    private Object schoolDigitalAddress;
    @SerializedName("is_double_track")
    @Expose
    private String isDoubleTrack;
    @SerializedName("has_changed_password")
    @Expose
    private String hasChangedPassword;
    @SerializedName("project")
    @Expose
    private Object project;
    @SerializedName("options")
    @Expose
    private String options;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public Headmaster withID(String iD) {
        this.iD = iD;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Headmaster withRegion(String region) {
        this.region = region;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Headmaster withDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Headmaster withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Headmaster withSchoolName(String schoolName) {
        this.schoolName = schoolName;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Headmaster withType(String type) {
        this.type = type;
        return this;
    }

    public String getSchoolPassword() {
        return schoolPassword;
    }

    public void setSchoolPassword(String schoolPassword) {
        this.schoolPassword = schoolPassword;
    }

    public Headmaster withSchoolPassword(String schoolPassword) {
        this.schoolPassword = schoolPassword;
        return this;
    }

    public Object getSchoolPasswordHash() {
        return schoolPasswordHash;
    }

    public void setSchoolPasswordHash(Object schoolPasswordHash) {
        this.schoolPasswordHash = schoolPasswordHash;
    }

    public Headmaster withSchoolPasswordHash(Object schoolPasswordHash) {
        this.schoolPasswordHash = schoolPasswordHash;
        return this;
    }

    public Object getGhanaPostGps() {
        return ghanaPostGps;
    }

    public void setGhanaPostGps(Object ghanaPostGps) {
        this.ghanaPostGps = ghanaPostGps;
    }

    public Headmaster withGhanaPostGps(Object ghanaPostGps) {
        this.ghanaPostGps = ghanaPostGps;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Headmaster withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Headmaster withStatus(String status) {
        this.status = status;
        return this;
    }

    public Object getSchoolPhone() {
        return schoolPhone;
    }

    public void setSchoolPhone(Object schoolPhone) {
        this.schoolPhone = schoolPhone;
    }

    public Headmaster withSchoolPhone(Object schoolPhone) {
        this.schoolPhone = schoolPhone;
        return this;
    }

    public Object getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(Object schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public Headmaster withSchoolEmail(Object schoolEmail) {
        this.schoolEmail = schoolEmail;
        return this;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public Headmaster withHeadName(String headName) {
        this.headName = headName;
        return this;
    }

    public Object getHeadPhone() {
        return headPhone;
    }

    public void setHeadPhone(Object headPhone) {
        this.headPhone = headPhone;
    }

    public Headmaster withHeadPhone(Object headPhone) {
        this.headPhone = headPhone;
        return this;
    }

    public Object getHeadEmail() {
        return headEmail;
    }

    public void setHeadEmail(Object headEmail) {
        this.headEmail = headEmail;
    }

    public Headmaster withHeadEmail(Object headEmail) {
        this.headEmail = headEmail;
        return this;
    }

    public Object getIctOfficerName() {
        return ictOfficerName;
    }

    public void setIctOfficerName(Object ictOfficerName) {
        this.ictOfficerName = ictOfficerName;
    }

    public Headmaster withIctOfficerName(Object ictOfficerName) {
        this.ictOfficerName = ictOfficerName;
        return this;
    }

    public Object getIctOfficerPhone() {
        return ictOfficerPhone;
    }

    public void setIctOfficerPhone(Object ictOfficerPhone) {
        this.ictOfficerPhone = ictOfficerPhone;
    }

    public Headmaster withIctOfficerPhone(Object ictOfficerPhone) {
        this.ictOfficerPhone = ictOfficerPhone;
        return this;
    }

    public Object getIctOfficerEmail() {
        return ictOfficerEmail;
    }

    public void setIctOfficerEmail(Object ictOfficerEmail) {
        this.ictOfficerEmail = ictOfficerEmail;
    }

    public Headmaster withIctOfficerEmail(Object ictOfficerEmail) {
        this.ictOfficerEmail = ictOfficerEmail;
        return this;
    }

    public Object getSchoolDigitalAddress() {
        return schoolDigitalAddress;
    }

    public void setSchoolDigitalAddress(Object schoolDigitalAddress) {
        this.schoolDigitalAddress = schoolDigitalAddress;
    }

    public Headmaster withSchoolDigitalAddress(Object schoolDigitalAddress) {
        this.schoolDigitalAddress = schoolDigitalAddress;
        return this;
    }

    public String getIsDoubleTrack() {
        return isDoubleTrack;
    }

    public void setIsDoubleTrack(String isDoubleTrack) {
        this.isDoubleTrack = isDoubleTrack;
    }

    public Headmaster withIsDoubleTrack(String isDoubleTrack) {
        this.isDoubleTrack = isDoubleTrack;
        return this;
    }

    public String getHasChangedPassword() {
        return hasChangedPassword;
    }

    public void setHasChangedPassword(String hasChangedPassword) {
        this.hasChangedPassword = hasChangedPassword;
    }

    public Headmaster withHasChangedPassword(String hasChangedPassword) {
        this.hasChangedPassword = hasChangedPassword;
        return this;
    }

    public Object getProject() {
        return project;
    }

    public void setProject(Object project) {
        this.project = project;
    }

    public Headmaster withProject(Object project) {
        this.project = project;
        return this;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public Headmaster withOptions(String options) {
        this.options = options;
        return this;
    }


    public Headmaster(String iD, String region, String district, String username, String schoolName, String type, String schoolPassword, Object schoolPasswordHash, Object ghanaPostGps, String gender, String status, Object schoolPhone, Object schoolEmail, String headName, Object headPhone, Object headEmail, Object ictOfficerName, Object ictOfficerPhone, Object ictOfficerEmail, Object schoolDigitalAddress, String isDoubleTrack, String hasChangedPassword, Object project, String options) {
        super();
        this.iD = iD;
        this.region = region;
        this.district = district;
        this.username = username;
        this.schoolName = schoolName;
        this.type = type;
        this.schoolPassword = schoolPassword;
        this.schoolPasswordHash = schoolPasswordHash;
        this.ghanaPostGps = ghanaPostGps;
        this.gender = gender;
        this.status = status;
        this.schoolPhone = schoolPhone;
        this.schoolEmail = schoolEmail;
        this.headName = headName;
        this.headPhone = headPhone;
        this.headEmail = headEmail;
        this.ictOfficerName = ictOfficerName;
        this.ictOfficerPhone = ictOfficerPhone;
        this.ictOfficerEmail = ictOfficerEmail;
        this.schoolDigitalAddress = schoolDigitalAddress;
        this.isDoubleTrack = isDoubleTrack;
        this.hasChangedPassword = hasChangedPassword;
        this.project = project;
        this.options = options;
    }


}
