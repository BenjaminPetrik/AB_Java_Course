package unit5;

public class EmployeeBuilderFactory {
    public static final EmployeeBuilderFactory INSTANCE = new EmployeeBuilderFactory();

    private EmployeeBuilderFactory() {}

    public AbstractEmployeeBuilder buildEmployeeBuilder() {
        return new Employee.Builder();
    }
  //  public AbstractEmployeeBuilder buildInternBuilder() {
  //      return new Intern.Builder();
  //  }
}
