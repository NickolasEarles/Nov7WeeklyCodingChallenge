public class Harshad {
    public Harshad(){}
    public boolean check(int inp){
        String input=""+inp;
        int sent=0;

        for (int i=0;i<input.length();i++){
            sent+=Integer.parseInt(input.charAt(i)+"");
        }
        if(inp%sent==0){return true;}
        else {return false;}
    }
}
