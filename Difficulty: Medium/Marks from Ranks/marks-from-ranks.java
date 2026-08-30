class Solution {
    public ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int k : rank) {
            int remainingRank = k;

            for (int i = 0; i < l.length; i++) {

                // Number of marks in this interval
                int count = r[i] - l[i] + 1;

                if (remainingRank <= count) {
                    // Mark lies inside this interval
                    int mark = l[i] + remainingRank - 1;
                    ans.add(mark);
                    break;
                }

                // Skip this entire interval
                remainingRank -= count;
            }
        }

        return ans;
    }
}