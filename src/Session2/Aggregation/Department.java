package Session2.Aggregation;

public class Department {

    private String deptCode;

    public Department(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptCode='" + deptCode + '\'' +
                '}';
    }
}
