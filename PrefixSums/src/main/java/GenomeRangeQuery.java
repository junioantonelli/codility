import java.util.Arrays;

class GenomeRangeQuery {
    public int[] solution(String[] S, int[] P, int[] Q) {
        int M = P.length;
        int[] result = new int[M];

        for(int i = 0;i<M;i++){
            int impact = 4;
            String[] sampled = Arrays.copyOfRange(S,P[i],Q[i]+1);
            Arrays.sort(sampled);
            if ("A".equals(sampled[0])) {
                impact = 1;
            } else if ("C".equals(sampled[0])) {
                impact = 2;
            } else if ("G".equals(sampled[0])) {
                impact = 3;
            } else if ("T".equals(sampled[0])) {
                impact = 4;
            }
            result[i] = impact;
        }
        return result;
    }
}