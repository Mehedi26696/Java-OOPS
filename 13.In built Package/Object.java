public class Object {
    int num;
    float gpa;
    
    public Object(int num) {
        this.num = num;
        
    }
    public Object(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }


    // we will go in details of how to create it in hashmap lecture
    @Override
    public int hashCode() {
        //return super.hashCode();

        return num; //modify hash value
    }

    
    public boolean equals(Object obj) {
        return this.num == ((Object) obj).num;
    }

 
    public static void main(String[] args) {

         
        // Object obj = new Object(34);
        // Object obj2 = new Object(34);

        // System.out.println(obj.hashCode());
        // System.out.println(obj2.hashCode());
        
        Object obj3 = new Object(12, 56.8f);
        Object obj4 = new Object(12,78.9f);
       

        if(obj3 == obj4){
            System.out.println("obj3 is eqaul to obj4");
        }

        if(obj3.equals(obj4)){
            System.out.println("obj3 is eqaul to obj4");
        }

        System.out.println(obj3 instanceof Object);

    

      
        

 

    }
}


//hascode means unique representation of object by a number