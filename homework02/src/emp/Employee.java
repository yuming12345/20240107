package emp;

public class Employee {
	public int EmpNo; // 員工編號
    public string EmpName; // 員工姓名
    public String Gender; // 性別
    public float Height; // 身高 (公分)
    public float Weight; // 體重 (公斤)
    public int EmpDirector; // 直屬主管員編
    public Employee(int empNo, String empName, String gender, float height, float weight, int empDirector) {
        EmpNo = empNo;
        EmpName = empName;
        Gender = gender;
        Height = height;
        Weight = weight;
        EmpDirector = empDirector;
    }
}
