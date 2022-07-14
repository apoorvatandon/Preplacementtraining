class TUF {
    static boolean isCompatible(int inp[], int dist, int cows) {
        int n = inp.length;
        int k = inp[0];
        cows--;
        for (int i = 1; i < n; i++) {
            if (inp[i] - k >= dist) {
                cows--;
                if (cows == 0) {
                    return true;
                }
                k = inp[i];
            }
        }
        return false;
    }
  public static void main(String args[]) {
        int n = sc.nextInt(), m = 3;
        int inp[] = newint[n];
        for(int i=0;i<n;i++)
          inp[i] = s.nextInt();
        Arrays.sort(inp);
        int maxD = inp[n - 1] - inp[0];
        int ans = Integer.MIN_VALUE;
        for (int d = 1; d <= maxD; d++) {
            boolean possible = isCompatible(inp, d, m);
            if (possible) {
                ans = Math.max(ans, d);
            }
        }
        System.out.println("The largest minimum distance is " + ans);
    }
}
