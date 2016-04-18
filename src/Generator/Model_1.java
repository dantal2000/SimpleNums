package Generator;

import java.util.ArrayList;

class Model_1 implements Model {

    public int getSimpleInRange(int start, int end) throws Exception {
        if (!(start <= end && start >= 2)) throw new Exception("Что за ерунду вы ввели!!");
        int result = 0;
        for (int i = start; i <= end; i++)
            if (isSimple(i)) {
                result = i;
                break;
            }
        if (result == 0) throw new Exception("Простых нет");
        return 0;
    }

    public boolean isSimple(int num) {
        boolean decision = true;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i < sqrt; i++)
            if (num % sqrt == 0) {
                decision = false;
                break;
            }
        return decision;
    }

    public int[] getSimplesInRange(int start, int end) throws Exception {
        if (!(start <= end && start >= 2)) throw new Exception("Что за ерунду вы ввели!!");
        ArrayList<Integer> result = new ArrayList<>();
        int res_start = start;
        while (true) {
            try {
                int a = getSimpleInRange(res_start, end);
                res_start = a;
                result.add(a);
            } catch (Exception e) {
                break;
            }
        }
        int[] a = new int[result.size()];
        int i = 0;
        for (int b : result) {
            a[i] = b;
            i++;
        }
        return a;
    }
}
