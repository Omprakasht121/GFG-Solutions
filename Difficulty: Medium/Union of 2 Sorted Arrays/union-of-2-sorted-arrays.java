class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = 0;

        while (left < a.length && right < b.length) {
            if (a[left] < b[right]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[left]) {
                    list.add(a[left]);
                }
                left++;
            } else if (a[left] > b[right]) {
                if (list.isEmpty() || list.get(list.size() - 1) != b[right]) {
                    list.add(b[right]);
                }
                right++;
            } else { // equal
                if (list.isEmpty() || list.get(list.size() - 1) != a[left]) {
                    list.add(a[left]);
                }
                left++;
                right++;
            }
        }

        // Remaining elements
        while (left < a.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[left]) {
                list.add(a[left]);
            }
            left++;
        }

        while (right < b.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != b[right]) {
                list.add(b[right]);
            }
            right++;
        }

        return list;
    }
}
