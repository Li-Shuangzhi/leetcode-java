package lishuangzhi.leetcode.y2023.jan.ascending_in_a_sentence;

/**
 * @author lsz
 * @version 1.0
 * @since 2023/1/3 9:56
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean r = solution.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles");
        System.out.format("r : %b\n", r);
    }
}

/**
 * https://leetcode.cn/problems/check-if-numbers-are-ascending-in-a-sentence/
 * 2023年1月3日
 * 思路：迭代遍历
 */
class Solution {
    public boolean areNumbersAscending(String s) {
        int i = 0;
        int t = -1;
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int r = 0;
                while (i < s.length() && s.charAt(i) != ' ') {
                    int p = s.charAt(i) - '0';
                    r = r * 10 + p;
                    i++;
                }
                if ( r <= t) {
                    return false;
                }
                t = r;
            }
            i++;
        }
        return true;
    }
}
