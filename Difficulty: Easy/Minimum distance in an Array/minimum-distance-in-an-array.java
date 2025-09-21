class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int minDist = Integer.MAX_VALUE;
        int lastX = -1;
        int lastY = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastX = i;
                if (lastY != -1) {
                    minDist = Math.min(minDist, Math.abs(lastX - lastY));
                }
            } else if (arr[i] == y) {
                lastY = i;
                if (lastX != -1) {
                    minDist = Math.min(minDist, Math.abs(lastX - lastY));
                }
            }
        }

        return (minDist == Integer.MAX_VALUE) ? -1 : minDist;
    }
}