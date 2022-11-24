public class Customer{
    public String firstname,lastname,number_person;
public Customer(){
    firstname=" ";
    lastname=" ";
    number_person=" 0000000000000";
}
public void setCustomer(String f_name,String l_name, String number_person){
    firstname=f_name;
    lastname=l_name;
    this.number_person=number_person;
}
public void setnumber_person(String number_person){
    this.number_person=number_person;
}
public void  setFirstname(String f_name){
    firstname=f_name;
}
public void setLastname(String l_name){
    lastname=l_name;
}
public String getFirstname(){
    return firstname;
}
public String getLastname(){
    return lastname;
}
public String getNumber_person(){
    return number_person;
}
public void showCustomer(){
    System.out.println("Fastname:: "+getFirstname()+":::::"+"Lastname:: "+getLastname());
    System.out.println("Person-number: "+getNumber_person());
}
}