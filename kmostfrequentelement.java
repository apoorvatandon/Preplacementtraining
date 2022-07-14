lass MostFreq {

    int num; 
    int freq;
    MostFreq () {
    }

    MostFreq (int arg_num, int arg_freq) {
        num = arg_num;
        freq = arg_freq;
    }

   
    public int[] K_TopMost_Frequent (int[] nums, int k) {

       
        PriorityQueue<MostFreq> pq_mostfreq = new PriorityQueue<>((obj_x, obj_y) -> Integer.compare(obj_y.freq, obj_x.freq));

        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        int[] result = new int[k];

        for (int n : nums) {
            if (freq.get(n) != null) {
                int count = freq.get(n);
                freq.put(n, count+1);
            } else {
                freq.put(n, 1);
            }
        }

        freq.forEach ((key, value) -> pq_mostfreq.add(new MostFreq(key, value)));

        int count = 0;
        while (count < k && !pq_mostfreq.isEmpty()) {
            MostFreq obj = pq_mostfreq.remove();
            result[count] = obj.num;
            count++;
        }

        return result;
    }

  
}
