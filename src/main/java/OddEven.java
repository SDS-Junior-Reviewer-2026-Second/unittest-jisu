import java.util.ArrayList;
import java.util.List;

public class OddEven {
    public List<String> getResult(List<Integer> nums){
        if (nums.isEmpty() || isAllEvenOrOdd(nums)){
            return null;
        }

        List<String> result = new ArrayList<>();
        for (int num: nums){
            if (num % 2 == 0) result.add("O");
            else result.add("X");
        }
        return result;
    }

    private boolean isAllEvenOrOdd(List<Integer> nums){
        for (int num: nums){
            if ((num - nums.get(0)) % 2 != 0) return false;
        }
        return true;
    }
}
