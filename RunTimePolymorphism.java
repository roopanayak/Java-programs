package MyProject;

class OperatingSytem{
void feature() {
System.out.println("This is Operating Sytem");
}
}
class DOS extends OperatingSytem{
void feature(){
System.out.println("This is DOS");
}
}
class Windows extends DOS{
void feature(){
System.out.println("This is Windows");
}
}
class WindowsMobile extends Windows{
void feature(){
System.out.println("This is Windows Mobile");
}
}
public class RunTimePolymorphism {
public static void main(String args[]){
OperatingSytem superObject=new OperatingSytem();
OperatingSytem subObject=new DOS();  
OperatingSytem sub2Object=new Windows();  
OperatingSytem sub3Object=new WindowsMobile();  
superObject.feature();
subObject.feature();  
sub2Object.feature(); 
sub3Object.feature(); 
}
}