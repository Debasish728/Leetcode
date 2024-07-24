class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n2 = nums.length;
        Pair[] pairs = new Pair[n2];
        int res[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            int num = nums[i];
            int newNum = 0;
            int power = 0;

            if (num == 0) {
                newNum = mapping[0];
            } else {
                while (num != 0) {
                    int rem = num % 10;
                    newNum = newNum + (mapping[rem] * (int) Math.pow(10, power));
                    power++;
                    num = num / 10;
                }
            }

            pairs[i] = new Pair(nums[i], newNum);
        }

        Arrays.sort(pairs, Comparator.comparingInt(p -> p.second));

        for (int i = 0; i < n2; i++) {
            res[i] = pairs[i].first;
        }

        return res;
    }
}