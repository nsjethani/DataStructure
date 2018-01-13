import java.util.ArrayList;
import java.util.List;

public class MatchingParanthesis {

    static boolean isMatch(char c1,char c2)
    {
        if(c1=='(' && c2==')')
            return true;
        else if(c1=='{' && c2=='}')
            return true;
        else if(c1=='[' && c2==']')
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        String exp = "{[]}";
        List<Character> chars = new ArrayList<>();

        for(int i=0;i<exp.length();i++)
        {
            System.out.print(exp.charAt(i));
            char c;
            c=exp.charAt(i);

            if(c=='(' || c=='{' || c=='[')
            {
                chars.add(c);
            }

            if (c==')' || c=='}' || c==']')
            {
                if(chars.size()==0) {
                    System.out.print("false");
                    break;
                }
                else
                {
                    char ch=chars.get(chars.size()-1);
                    chars.remove(chars.size()-1);
                    if(!isMatch(ch,c))
                    {
                        System.out.print("false");
                        break;
                    }


                }
            }
        }

        if(chars.size()==0)
            System.out.print("true");
        else
            System.out.print("false");

    }
}
