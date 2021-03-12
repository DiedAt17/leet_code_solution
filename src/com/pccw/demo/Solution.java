package com.pccw.demo;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

    /*
        给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

        示例:
        给定 nums = [2, 7, 11, 15], target = 9
        因为 nums[0] + nums[1] = 2 + 7 = 9
        所以返回 [0, 1]
    */

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int a = i+1; a < nums.length; a++) {
                if (nums[i] + nums[a] == target){
                    return new int[]{i,a};
                }
            }
        }
        return nums;

    }

    /*
    给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

    如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

    您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

    示例：
    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807
    */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        return null;
    }

    /*
    给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

    示例 1:
    输入: 123
    输出: 321

    示例 2:
    输入: -123
    输出: -321

    示例 3:
    输入: 120
    输出: 21
    */
    public int reverse(double x) {
        if (x < 0) {
            x = x * -1;
            StringBuilder s = new StringBuilder( String.valueOf( x ) );
            s.reverse();
            s.insert( 0,"-" );
            int s1 = Integer.parseInt(s.toString());
            return s1;
        } else{
            StringBuilder s = new StringBuilder( String.valueOf( x ) );
            int s1 = Integer.parseInt( s.reverse().toString() );
            return s1;
        }
    }


    /**
     *判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * 示例 1:
     *
     * 输入: 121
     * 输出: true
     * 示例 2:
     *
     * 输入: -121
     * 输出: false
     * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     * 示例 3:
     *
     * 输入: 10
     * 输出: false
     * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
     * 进阶:
     *
     * 你能不将整数转为字符串来解决这个问题吗？
     *
     * Related Topics
     * 数学
     */
    public boolean isPalindrome(int x) {

        try {
            String s = String.valueOf( x );
            StringBuilder sb = new StringBuilder(s);
            Integer i = Integer.parseInt( sb.reverse().toString() );
            return x == i;
        } catch (NumberFormatException e) {
            return false;
        }
//        if(x<0)
//            return false;
//        int rem=0,y=0;
//        int quo=x;
//        while(quo!=0){
//            rem=quo%10;
//            y=y*10+rem;
//            quo=quo/10;
//        }
//        return y==x;
    }


    /**
     * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
     *
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
     *
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
     *
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
     *
     * 示例 1:
     *
     * 输入: "III"
     * 输出: 3
     * 示例 2:
     *
     * 输入: "IV"
     * 输出: 4
     * 示例 3:
     *
     * 输入: "IX"
     * 输出: 9
     * 示例 4:
     *
     * 输入: "LVIII"
     * 输出: 58
     * 解释: L = 50, V= 5, III = 3.
     * 示例 5:
     *
     * 输入: "MCMXCIV"
     * 输出: 1994
     * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
     * Related Topics
     * 数学
     * 字符串
     */
    public int romanToInt(String s) {

        int roman = 0;

        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt( i );
            String ts = String.valueOf( c );
            roman -= c == 'I' && i+1 < s.length() && (s.charAt( i+1 ) == 'V' || s.charAt(i+1) == 'X') ? 2 : 0;
            roman += ts.equals( "I" ) ? 1 : 0;
            roman += ts.equals( "V" ) ? 5 : 0;
            roman -= c == 'X' && i+1 < s.length() && (s.charAt( i+1 ) == 'L' || s.charAt(i+1) == 'C') ? 20 : 0;
            roman += ts.equals( "X" ) ? 10 : 0;
            roman += ts.equals( "L" ) ? 50 : 0;
            roman -= c == 'C' && i+1 < s.length() && (s.charAt( i+1 ) == 'D' || s.charAt(i+1) == 'M') ? 200 : 0;
            roman += ts.equals( "C" ) ? 100 : 0;
            roman += ts.equals( "D" ) ? 500 : 0;
            roman += ts.equals( "M" ) ? 1000 : 0;
        }

        return roman;
    }


    /**
     *
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     *
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     * 示例 1:
     *
     * 输入: ["flow","flow","flight"]
     * 输出: "fl"
     * 示例 2:
     *
     * 输入: ["dog","racecar","car"]
     * 输出: ""
     * 解释: 输入不存在公共前缀。
     * 说明:
     *
     * 所有输入只包含小写字母 a-z 。
     */
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) return "";
        String res = strs[0];
        for (String str : strs) {
            //表示必须从0开始包含
            while (str.indexOf(res) != 0) {
                //开始滑动
                res = res.substring(0, res.length()-1);
            }
        }
        return res;
    }

    /**
     *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * 示例 1:
     *
     * 输入: "()"
     * 输出: true
     * 示例 2:
     *
     * 输入: "()[]{}"
     * 输出: true
     * 示例 3:
     *
     * 输入: "(]"
     * 输出: false
     * 示例 4:
     *
     * 输入: "([)]"
     * 输出: false
     * 示例 5:
     *
     * 输入: "{[]}"
     * 输出: true
     * Related Topics
     * 栈
     * 字符串
     */
    public boolean isValid(String s) {
        int[] a = new int[126];
        a[41] = 40;
        a[93] = 91;
        a[125] = 123;

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int valid = s.charAt( i );
            if (valid == 40 || valid == 91 || valid == 123){
                integers.add( valid );
            }else {
                if (integers.size() == 0){
                    return false;
                }
                int tem = integers.remove(integers.size()-1);
                if (a[valid]!=tem){
                    return false;
                }
            }
        }
        return integers.size() == 0;
    }

    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     * 实列1：
     * 给定数组 nums = [1,1,2],
     * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
     * 你不需要考虑数组中超出新长度后面的元素。
     *
     * 实列2：
     * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     * 你不需要考虑数组中超出新长度后面的元素。
     *
     * 说明:
     * 为什么返回数值是整数，但输出的答案是数组呢?
     * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     * 你可以想象内部操作如下:
     * nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
     * int len = removeDuplicates(nums);
     * 在函数里修改输入数组对于调用者是可见的。
     * 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
     * for (int i = 0; i < len; i++) {
     *  print(nums[i]);
     * }
     *
     * 双指针算法
     */
    public int removeDuplicates(int[] nums){
        if (nums.length<2)return nums.length;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }

    /**
     *   给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     *  不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     *  元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     *
     * 示例 1:
     * 给定 nums = [3,2,2,3], val = 3,
     * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
     * 你不需要考虑数组中超出新长度后面的元素。
     *
     *  示例 2:
     *  给定 nums = [0,1,2,2,3,0,4,2], val = 2,
     * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
     * 注意这五个元素可为任意顺序。
     * 你不需要考虑数组中超出新长度后面的元素。
     *
     * 说明:
     * 为什么返回数值是整数，但输出的答案是数组呢?
     * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     * 你可以想象内部操作如下:
     * nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
     * int len = removeElement(nums, val);
     * 在函数里修改输入数组对于调用者是可见的。
     * 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
     * for (int i = 0; i < len; i++) {
     *      print(nums[i]);
     * }
     */
    public int removeElement(int[] nums, int val){
        if(nums == null)return 0;

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    /**
     * 实现 strStr() 函数。
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
     *
     * 示例 1:
     * 输入: haystack = "hello", needle = "ll"
     * 输出: 2
     *
     * 示例 2:
     * 输入: haystack = "aaaaa", needle = "bba"
     * 输出: -1
     *
     * 说明:
     * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
     * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
     */
    public static int strStr(String haystack, String needle){

        if (needle.equals( "" ))return 0;
        if (haystack.length()==1) return haystack.equals( needle ) ? 0:-1;
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt( i ) == needle.charAt( j )){
                j++;
                if (j == needle.length() )return i - j + 1;
            }else {
                i = i - j;
                j = 0;
            }
        }
        return -1;
    }


    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     * 示例：
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

//        ListNode listNode1 = new ListNode( 0 );
//        ListNode listNode2 = listNode1;
//        while (l1 != null && l2 != null){
//            if (l1.val < l2.val){
//                listNode2.next = l1;
//                l1 = l1.next;
//            }else {
//                listNode2.next = l2;
//                l2 = l2.next;
//            }
//            listNode2 = listNode2.next;
//        }
//        listNode2.setNext( l1 == null ? l2 : l1 );
//        return listNode1.next;

        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    /**
     *  给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     *  你可以假设数组中无重复元素。
     *
     * 示例 1:
     * 输入: [1,3,5,6], 5
     * 输出: 2
     *
     *
     * 示例 2:
     * 输入: [1,3,5,6], 2
     * 输出: 1
     *
     * 示例 3:
     * 输入: [1,3,5,6], 7
     * 输出: 4
     *
     * 示例 4:
     * 输入: [1,3,5,6], 0
     * 输出: 0
     */
    public int searchInsert(int[] nums, int target) {
//        int low = 0;
//        int high = nums.length-1;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] > target) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return low;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)return i;
        }
        return nums.length;
    }

    /**
     * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
     * 注意：整数序列中的每一项将表示为一个字符串。
     * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     *
     * 第一项是数字 1
     * 描述前一项，这个数是 1 即 “一个 1 ”，记作 11
     * 描述前一项，这个数是 11 即 “两个 1 ” ，记作 21
     * 描述前一项，这个数是 21 即 “一个 2 一个 1 ” ，记作 1211
     * 描述前一项，这个数是 1211 即 “一个 1 一个 2 两个 1 ” ，记作 111221
     *
     * 示例 1:
     * 输入: 1
     * 输出: "1"
     * 解释：这是一个基本样例。
     *
     * 示例 2:
     * 输入: 4
     * 输出: "1211"
     * 解释：当 n = 3 时，序列是 "21"，其中我们有 "2" 和 "1" 两组，"2" 可以读作 "12"，也就是出现频次 = 1 而 值 = 2；类似
     * "1" 可以读作 "11"。所以答案是 "12" 和 "11" 组合在一起，也就是 "1211"。
     */
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuffer res = new StringBuffer();
        String str = countAndSay(n - 1);
        int length = str.length();
        int a = 0;
        for (int i = 1; i < length + 1; i++) {
            if (i == length) {
                return res.append(i - a).append(str.charAt(a)).toString();
            } else if (str.charAt(i) != str.charAt(a) ) {
                res.append(i - a).append(str.charAt(a));
                a = i;
            }
        }
        return res.toString();
    }

    /**
     *     给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     *
     *  示例:
     *
     *  输入: [-2,1,-3,4,-1,2,1,-5,4]
     * 输出: 6
     * 解释:连续子数组  [4,-1,2,1] 的和最大，为6。
     *
     *
     *  进阶:
     *
     *  如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
     *  Related Topics 数组 分治算法 动态规划
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int max = nums[0],max2 = 0;
        for (int i = 0; i < nums.length; i++) {
            max2 += nums[i];
            if (max2>max)max=max2;
            if (max2<0)max2=0;
        }
        return max;
    }

    /**
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
     * 如果不存在最后一个单词，请返回 0 。
     * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
     *
     * 示例:
     * 输入: "Hello World"
     * 输出: 5
     */
    public int lengthOfLastWord(String s) {
        String[] split = s.split( "\\s+" );
        return split.length==0 ? 0 : split[split.length-1].length();
    }

    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     *
     * 示例 1:
     * 输入: [1,2,3]
     * 输出: [1,2,4]
     * 解释: 输入数组表示数字 123。
     *
     * 示例 2:
     * 输入: [4,3,2,1]
     * 输出: [4,3,2,2]
     * 解释: 输入数组表示数字 4321。
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * 注意：给定 n 是一个正整数。
     *
     * 示例 1：
     * 输入： 2
     * 输出： 2
     * 解释： 有两种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     *
     * 示例 2：
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     */
    public int climbStairs(int n) {
//        if (n == 1 || n == 2) return n;
//        int result = (int) Math.floor( 1 / Math.sqrt(5) * (Math.pow((1 + Math.sqrt(5)) / 2, n + 1) - Math.pow((1 - Math.sqrt(5)) / 2, n + 1)));
//        return result;
        if (n == 1 || n == 2) return n;
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    /**
     * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
     *
     * 示例 1:
     * 输入: 1->1->2
     * 输出: 1->2
     *
     *
     * 示例 2:
     * 输入: 1->1->2->3->3
     * 输出: 1->2->3
     * Related Topics 链表
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode node = head;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        while (node != null && node.next != null){
            if (hashSet.add( node.val )) {
                node = node.next;
            }else {
                node.next = node.next.next;
            }
        }
        return head;
    }

    /**
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     * 说明:
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     *
     * 示例:
     * 输入:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * 输出:[1,2,2,3,5,6]
     * Related Topics 数组 双指针
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length < m+n)return;
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0){
                nums1[i] = nums2[j];
                j++;
            }
        }
    }

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 说明：
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     *
     * 示例 1:
     * 输入: [2,2,1]
     * 输出: 1
     *
     * 示例 2:
     * 输入: [4,1,2,1,2]
     * 输出: 4
     */
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i: nums) {
            a ^= i;
        }
        return a;
    }
}
