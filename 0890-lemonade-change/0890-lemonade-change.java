class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] > 5) {
            return false;
        }
        int five=0;
        int ten=0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;

            }
            if (bills[i] == 10) {
                ten++;
                if (five < 1) {
                    return false;
                } else {
                    five -= 1;
                }
            }
            if (bills[i] == 20) {
                if (five >= 1 && ten >= 1) {
                    five -= 1;
                    ten -= 1;
                } else if (five >= 3 && ten < 1) {
                    five -= 3;
                } else {
                    return false;
                }
            }

        }
        return true;

    }
}