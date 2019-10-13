package difficulty.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author huzhpm
 * @Date 2019/10/12 23:35
 * @Version 1.0
 * @Content 杨辉三角
 */
public class Test118 {

    public static void main(String[] args) {
        Test118 t = new Test118();
        int numRows = 5;
        System.out.println(t.generate(numRows));
    }

    /**
     * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> resultList = new ArrayList<List<Integer>>(numRows);
        if(numRows < 1){
            return resultList;
        }
        resultList.add(new ArrayList<Integer>(1));
        resultList.get(0).add(1);
        for(int i = 1; i < numRows; i++){
            List<Integer> tempList = new ArrayList<Integer>();
            List<Integer> preList = resultList.get(i - 1);
            tempList.add(1);
            for(int j = 1; j < i; j++){
                tempList.add(preList.get(j - 1) + preList.get(j));
            }
            tempList.add(1);
            resultList.add(tempList);
        }
        return resultList;
    }
}
