package Third;

public class Runner {
    public static int run() {
        String[] data = {
                "aa", "abc" , "aaa", "aa", "bbc",
                "abc", "aa", "aaa", "bbb", "aa",
                "bb", "ccc", "cc", "a", "bb", ""
        };
        return Counter.countStr(data, "bb");
    }

    public static void main(String[] args) {
        System.out.println(run());
    }
}