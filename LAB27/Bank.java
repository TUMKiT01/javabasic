public class Bank 
{
        public static void main(String[] args){
            
           
            Customer person_data1 = new Customer();
            person_data1.setCustomer("kitchapon", "ditpin","1549900546168");

            Account person1 = new Account();
            person1.setPerson_account(person_data1,10001,1000);
            person1.showAccount();
            System.out.println("-----------------------/////////////////////////////////////////////////");

            
            person1.deposit(25000);
            person1.withdraw(5000);
            person1.person.setFirstname("TUM");
            person1.person.setLastname("KIT");
            person1.interest();
            person1.showAccount();

            System.out.println("======================================================================");

            Customer person_data2 = new Customer();
            person_data2.setCustomer("kitchapon", "ditpin","1549900546168");

            Account person2 = new Account();
            person2.setPerson_account(person_data2,10001,1000);
            person2.showAccount();
            System.out.println("-----------------------/////////////////////////////////////////////////");

            
            person2.deposit(25000);
            person2.withdraw(5000);
            person2.person.setFirstname("TUM");
            person2.person.setLastname("KIT");
            person2.interest();
            person2.showAccount();






        }

    }


