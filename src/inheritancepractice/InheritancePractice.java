
package inheritancepractice;

/**
 *
 * @Jessica Kramer
 */
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        my.concrete.SalaryPlusCommissionEmployee jessica = new my.concrete.SalaryPlusCommissionEmployee("Jessica Kramer", 123, 'f', 23, 40000, .15, 20000);
        
        System.out.println(jessica.getEmployeeSalary());
        System.out.println(jessica.getAge());
        System.out.println(jessica.getEmployeeID());
        System.out.println(jessica.getName());
        System.out.println(jessica.getGender());
        System.out.println(jessica.getCommissionRate());
        System.out.println(jessica.getTotalSales());
        System.out.println(jessica.getCommissionPay());
                
    }
    
}
