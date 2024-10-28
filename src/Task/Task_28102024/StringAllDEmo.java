package Task.Task_28102024;

public class StringAllDEmo {

        public static void main(String[] args)
        {
            String str="ashishPatel";
            String str4="ashishPatel";

            String str1=new String("ashishPatel");  //new use to create string
            String str2=new String("ashishPatel");

            System.out.println(str==str1);// output is false
            System.out.println(str1==str2); // false
            System.out.println(str==str4); //True

            //1->toUpperCase(); , 2- tolowerCase();
            String name=str.toUpperCase();
            String name1=str.toLowerCase();
            System.out.println(name);   // o/p is ASHISHPATEL
            System.out.println(name1);  // 0/p is ashishpatel
            //3->lengh()
            System.out.println(name.length()); //o/p-11
            //4-> equal 5->content  6->equalsignore
            System.out.println(str.equals(str1));  // o/p true
            String str5="hello world";
            System.out.println(str5.contains("world")); //o/p true
            System.out.println(name.equals(name1));   //false   (ASHISHPATEL,ashishpatel)
            System.out.println(name.equalsIgnoreCase(name1));//true (ASHISHPATEL,ashishpatel)

            //7->Concatenation
            String s1="hello";
            String s2=" this is ashish";
            String s3=s1.concat(s2); // use concat
            System.out.println(s3);
            String s4=s1+s2;    //+
            System.out.println(s4);
            //8->Substring
            String s5="Hello How are you";
            String s6=s5.substring(6,9);
            System.out.println("subString-> "+s6); // o/p-subString-> How

            //9->Splitting
            String[] spl=s5.split(" ");
            for(int i=0;i<4;i++)
            {
                System.out.println(spl[i]);//s12[0]-Hello s12[1]-How s12[2]-are s12[3]-you

            }

            //ChatAt() , Trim(), Indexof() ,LastIndexOf(),Contains(),Startwith()
            System.out.println(s5.charAt(5));
            String s7=" Hey this java class ";
            System.out.println(s7.trim()); // o/p-Hey this java class
            System.out.println(s7.indexOf('j'));//o/p-10
            System.out.println(s7.lastIndexOf('a'));//o/p-17
            System.out.println(s7.lastIndexOf("this")); // o/p-5
            System.out.println(s7.contains("java")); // o/p-true
            System.out.println(s7.startsWith("hey")); // o/p-false
            System.out.println(s7.startsWith(" "));  // o/p-true

            //replace()
            String s8=s7.replace('a','o');
            System.out.println(s8); //o/p- Hey this jovo closs
            String s9=s7.replace("Hey","Hi");
            System.out.println(s9);//o/p- Hi this java class

            //relaseAll()
            String s10 = "hello123 friends456!";
            String s11 = s10.replaceAll("\\d+", "x");
            System.out.println(s11);  //o/p-hellox friendsx!


        }

    }


