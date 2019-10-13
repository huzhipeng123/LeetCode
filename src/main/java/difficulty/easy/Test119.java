package difficulty.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * @author: huzhpm
 * @create: 2019-10-13 12:35
 **/
public class Test119 {
    public static void main(String[] args) {
        Test119 t = new Test119();
        int numRows = 3;
        System.out.println(t.getRow(numRows));
    }

    /**
     * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> resultList = new ArrayList<Integer>(rowIndex);
        resultList.add(1);
        for(int i = 1; i <= rowIndex; i++){
            for(int j = i - 1; j > 0; j--){
                resultList.set(j, resultList.get(j - 1) + resultList.get(j));
            }
            resultList.add(1);
        }
        return resultList;
    }
}
