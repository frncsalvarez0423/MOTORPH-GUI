/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorPH_Application;

/**
 *
 * @author user
 */
public class EmployeeData {
    private int id;
    private String lastName;
    private String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String sss;
    private String philhealth;
    private String tin;
    private String pagibig;
    private String status;
    private String position;
    private String supervisor;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double semiMonthlyRate;
    private double hourlyRate;

    public EmployeeData(int id, String lastName, String firstName, String birthday, String address,
                        String phoneNumber, String sss, String philhealth, String tin, String pagibig,
                        String status, String position, String supervisor, double basicSalary,
                        double riceSubsidy, double phoneAllowance, double clothingAllowance,
                        double semiMonthlyRate, double hourlyRate) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sss = sss;
        this.philhealth = philhealth;
        this.tin = tin;
        this.pagibig = pagibig;
        this.status = status;
        this.position = position;
        this.supervisor = supervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.semiMonthlyRate = semiMonthlyRate;
        this.hourlyRate = hourlyRate;
    }

    // getters and setters for all fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
        public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNumber;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNumber = phoneNum;
    }

    public String getSssNum() {
        return sss;
    }

    public void setSssNum(String sssNum) {
        this.sss = sssNum;
    }

    public String getPhilhealthNum() {
        return philhealth;
    }

    public void setPhilhealthNum(String philhealthNum) {
        this.philhealth = philhealthNum;
    }

    public String getTinNum() {
        return tin;
    }

    public void setTinNum(String tinNum) {
        this.tin = tinNum;
    }

    public String getPagibigNum() {
        return pagibig;
    }

    public void setPagibigNum(String pagibigNum) {
        this.pagibig = pagibig;
    }
    
    public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

public String getPosition() {
    return position;
}

public void setPosition(String position) {
    this.position = position;
}

public String getImmediateSupervisor() {
    return supervisor;
}

public void setImmediateSupervisor(String immediateSupervisor) {
    this.supervisor = immediateSupervisor;
}

public double getBasicSalary() {
    return basicSalary;
}

public void setBasicSalary(double basicSalary) {
    this.basicSalary = basicSalary;
}

public double getRiceSubsidy() {
    return riceSubsidy;
}

public void setRiceSubsidy(double riceSubsidy) {
    this.riceSubsidy = riceSubsidy;
}

public double getPhoneAllowance() {
    return phoneAllowance;
}

public void setPhoneAllowance(double phoneAllowance) {
    this.phoneAllowance = phoneAllowance;
}

public double getClothingAllowance() {
    return clothingAllowance;
}

public void setClothingAllowance(double clothingAllowance) {
    this.clothingAllowance = clothingAllowance;
}

public double getGrossSemiMonthlyRate() {
    return semiMonthlyRate;
}

public void setGrossSemiMonthlyRate(double grossSemiMonthlyRate) {
    this.semiMonthlyRate = grossSemiMonthlyRate;
}

public double getHourlyRate() {
    return hourlyRate;
}

public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
}

    public Object getEmployeeNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
