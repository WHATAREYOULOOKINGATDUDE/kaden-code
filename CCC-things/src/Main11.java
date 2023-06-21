import java.util.*;

public class Main11 {
    static class Item implements Comparable<Item> {
        int type, cost;

        Item(int type, int cost) {
            this.type = type;
            this.cost = cost;
        }

        public int compareTo(Item other) {
            return Integer.compare(cost, other.cost);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            int type = input.nextInt();
            int cost = input.nextInt();
            items[i] = new Item(type, cost);
        }
        int[][] bounds = new int[m][2];
        for (int i = 0; i < m; i++) {
            bounds[i][0] = input.nextInt();
            bounds[i][1] = input.nextInt();
        }
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                return Integer.compare(a.type, b.type);
            }
        });
        PriorityQueue<Integer> costs = new PriorityQueue<>(k, Collections.reverseOrder());
        long costSum = 0;
        int[] counts = new int[m + 1];
        for (int left = 0, right = 0; left < n; left++) {
            while (right < n && !containsAll(counts, bounds)) {
                int type = items[right].type;
                counts[type]++;
                costSum += items[right].cost;
                right++;
            }
            if (containsAll(counts, bounds)) {
                costs.offer((int) costSum);
            }
            int type = items[left].type;
            counts[type]--;
            costSum -= items[left].cost;
        }
        List<Integer> uniqueCosts = new ArrayList<>(costs);
        Collections.sort(uniqueCosts);
        for (int i = 0; i < k; i++) {
            if (i < uniqueCosts.size()) {
                System.out.println(uniqueCosts.get(i));
            } else {
                System.out.println(-1);
            }
        }
    }

    static boolean containsAll(int[] counts, int[][] bounds) {
        for (int i = 0; i < bounds.length; i++) {
            int x = bounds[i][0];
            int y = bounds[i][1];
            if (counts[i + 1] < x || counts[i + 1] > y) {
                return false;
            }
        }
        return true;
    }
}
