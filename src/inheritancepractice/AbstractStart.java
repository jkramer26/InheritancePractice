

package inheritancepractice;

public class AbstractStart {
    public static void main(String[] args) {
        myabstract.SalaryPlusCommissionEmployee jessica = new myabstract.SalaryPlusCommissionEmployee("Jessica Kramer", 123, 'f', 23, 40000, .10, 20000);
        
        
        System.out.println(jessica.getCommissionRate());
        System.out.println(jessica.getCommssionPay());
        System.out.println(jessica.getEmployeePay());
        
        
    }
}
