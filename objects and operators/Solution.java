class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0)
        {
            return 0;
        }

        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result = 0;
        int prev = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = values[s.charAt(i) - 'A'];
            result += current;
            if (current > prev) {
                result -= 2 * prev;
            }
            prev = current;
        }

        return result;
    }
}

    