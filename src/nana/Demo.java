package nana;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Dog[] arr1=new Dog[4];
    Dog s1=new Dog(10,"gg1","ÄÐ");
    Dog s2=new Dog(10,"gg2","ÄÐ");
    Dog s3=new Dog(10,"gg3","ÄÐ");
    Dog s4=new Dog(10,"gg4","ÄÐ");
    arr1[0]=s1;
    arr1[1]=s2;
    arr1[2]=s3;
    arr1[3]=s4;
    for(Dog ss:arr1){
    	System.out.println(ss.show());
    }
	}

}
