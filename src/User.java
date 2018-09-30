public class User {

    String name;
    int password;
    double sold;

    public User(String name, int password, double sold) {
        this.name = name;
        this.password = password;
        this.sold = sold;
    }

    public double getSold() {
        return sold;
    }

    public int getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void addSum(double sum){
       sold = sold + sum;
    }
    public  void  withdrawSum (double sum){
        if (sold < sum ){
            System.out.println( "sorry, insufficient funds");
        }
        sold = sold - sum;
    }
}
