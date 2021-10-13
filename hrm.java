class Employee{
    private String name;
    private String email;
    private String address;
    private String birthday;
    private String behaviors;

    public void behaviors(){
        this.behaviors="work";
    }
    
    public void fun1(){
        System.out.println("hi");
    }
} 

class Programmer extends Employee{
    private String programming_languages;

    public void behaviors(){
        this.behaviors="code, fix bugs";
    }
}

class Tester extends Employee{
    private String testing_methodologies;

    public void behaviors(){
        behaviors="test, verify";
    }
} 

class Designer extends Employee{
    private String design_philosophy, design_tools_used;

    public void behaviors(){
        behaviors="design";
    }
} 

class Business_developer extends Employee{
    private String design_philosophy, design_tools_used;

    public void behaviors(){
        behaviors="collect requirements, analyze requirements, write documents";
    }
} 
class hrm extends main_operations{

    public static void main(String args[]) {
        main_operations t = new main_operations();
        t.fun1();
    }
}