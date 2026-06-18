class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Set<Integer> num = new HashSet<>();
        int n =a.length;
        int m =b.length;
        for(int i =0;i<n;i++)
            num.add(a[i]);
        for(int j =0;j<m;j++)
            num.add(b[j]);
        ArrayList<Integer> al =new ArrayList<>(num);
        Collections.sort(al);
        return al;
    }
}
