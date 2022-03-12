package com.example.theexamapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_department_class_map_semester_mapping", schema = "exam_api_db", catalog = "")
public class TDepartmentClassMapSemesterMapping {
    @Basic
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jdepartment_class_map_semester_mapping_id")
    private int jdepartmentClassMapSemesterMappingId;

    @Id
    @Column(name = "uid_department_class_map_semester_mapping")
    private String uidDepartmentClassMapSemesterMapping;
//    @Basic
//    @Column(name = "uid_department_class_mapping_fk")
    @OneToOne
    @JoinColumn(name = "uid_department_class_mapping_fk", referencedColumnName = "uid_department_class_mapping")
    private TDepartmentClassMapping uidDepartmentClassMappingFk;
//    @Basic
//    @Column(name = "uid_semester_fk")
    @OneToOne
    @JoinColumn(name = "uid_semester_fk", referencedColumnName = "uid_semester")
    private TSemester uidSemesterFk;
    @Basic
    @Column(name = "jstatus")
    private int jstatus;
    @Basic
    @Column(name = "dtcreated_at")
    private Timestamp dtcreatedAt;
    @Basic
    @Column(name = "uid_created_by_fk")
    private Integer uidCreatedByFk;
    @Basic
    @Column(name = "uid_updated_by_fk")
    private Integer uidUpdatedByFk;
    @Basic
    @Column(name = "uid_previous")
    private Integer uidPrevious;

    public int getJdepartmentClassMapSemesterMappingId() {
        return jdepartmentClassMapSemesterMappingId;
    }

    public void setJdepartmentClassMapSemesterMappingId(int jdepartmentClassMapSemesterMappingId) {
        this.jdepartmentClassMapSemesterMappingId = jdepartmentClassMapSemesterMappingId;
    }

    public String getUidDepartmentClassMapSemesterMapping() {
        return uidDepartmentClassMapSemesterMapping;
    }

    public void setUidDepartmentClassMapSemesterMapping(String uidDepartmentClassMapSemesterMapping) {
        this.uidDepartmentClassMapSemesterMapping = uidDepartmentClassMapSemesterMapping;
    }

    public TDepartmentClassMapping getUidDepartmentClassMappingFk() {
        return uidDepartmentClassMappingFk;
    }

    public void setUidDepartmentClassMappingFk(TDepartmentClassMapping uidDepartmentClassMappingFk) {
        this.uidDepartmentClassMappingFk = uidDepartmentClassMappingFk;
    }

    public TSemester getUidSemesterFk() {
        return uidSemesterFk;
    }

    public void setUidSemesterFk(TSemester uidSemesterFk) {
        this.uidSemesterFk = uidSemesterFk;
    }

    public int getJstatus() {
        return jstatus;
    }

    public void setJstatus(int jstatus) {
        this.jstatus = jstatus;
    }

    public Timestamp getDtcreatedAt() {
        return dtcreatedAt;
    }

    public void setDtcreatedAt(Timestamp dtcreatedAt) {
        this.dtcreatedAt = dtcreatedAt;
    }

    public Integer getUidCreatedByFk() {
        return uidCreatedByFk;
    }

    public void setUidCreatedByFk(Integer uidCreatedByFk) {
        this.uidCreatedByFk = uidCreatedByFk;
    }

    public Integer getUidUpdatedByFk() {
        return uidUpdatedByFk;
    }

    public void setUidUpdatedByFk(Integer uidUpdatedByFk) {
        this.uidUpdatedByFk = uidUpdatedByFk;
    }

    public Integer getUidPrevious() {
        return uidPrevious;
    }

    public void setUidPrevious(Integer uidPrevious) {
        this.uidPrevious = uidPrevious;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TDepartmentClassMapSemesterMapping that = (TDepartmentClassMapSemesterMapping) o;
        return jdepartmentClassMapSemesterMappingId == that.jdepartmentClassMapSemesterMappingId && jstatus == that.jstatus && Objects.equals(uidDepartmentClassMapSemesterMapping, that.uidDepartmentClassMapSemesterMapping) && Objects.equals(uidDepartmentClassMappingFk, that.uidDepartmentClassMappingFk) && Objects.equals(uidSemesterFk, that.uidSemesterFk) && Objects.equals(dtcreatedAt, that.dtcreatedAt) && Objects.equals(uidCreatedByFk, that.uidCreatedByFk) && Objects.equals(uidUpdatedByFk, that.uidUpdatedByFk) && Objects.equals(uidPrevious, that.uidPrevious);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jdepartmentClassMapSemesterMappingId, uidDepartmentClassMapSemesterMapping, uidDepartmentClassMappingFk, uidSemesterFk, jstatus, dtcreatedAt, uidCreatedByFk, uidUpdatedByFk, uidPrevious);
    }
}
