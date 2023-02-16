class project
{
    String member1="Arunraj.v ,";
}
class team extends project
{
    String member2="Aravind R ,";

}
class people extends team
{
    String member3="Riju Mathew ,";
}
class human extends people
{
    String member4="Aravind Kumar V ,";
}
class man extends human
{
    String member5="Joel Koshy John ,";

    public static void main(String[] args) {
        
        man obj=new man();

      String  Team_members=obj.member1+obj.member2+obj.member3+obj.member4+obj.member5;

      System.out.println("Team members are "+Team_members);
    }

}       
//fudhi ond appo
//write another code with some mistakes and let others correct it :)