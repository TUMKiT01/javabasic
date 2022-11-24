public class Account 
{
        public long account_number;
        public double total,interest;
        public Customer person ;
        public Account(){
            System.out.println("default constructor");
            account_number=0;
            total= 0.0;
            interest = 0.03;
            Customer person;
        }
        public void setPerson_account(Customer person_data ,long account_number_,double total_){
            if(total_ >=1000.0){
                person=person_data;
                total = total_;
                account_number = account_number_;
            }
            else{System.out.println("ยอดจำนวนเปิดบันชีเริ่มต้นต้อง 1000 บาท ");   }
        }
        public void deposit(double total_){
             total += total_;
        }
        public void withdraw(double total_){
            if(total - total_ < 1000.0){
            System.out.println("ไม่สามรถถอนได้ ");
            }
            else
                {
                    total -= total_;
                }
       }
       public void interest(){
        total += interest*total;
       }
       public double getTotal(){return total;}
       public long getAccount_number(){return account_number;}
       public void showTotal(){
        System.out.println("Total money:"+getTotal());
       }
       public void showAccount(){
        System.out.println("account_number:"+getAccount_number());
        //System.out.println("-------Person data--------:");
        person.showCustomer();
        System.out.println("Total money:"+getTotal());
       }
    }