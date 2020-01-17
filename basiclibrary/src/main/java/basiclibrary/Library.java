package basiclibrary;

import java.util.*;


public class Library {

    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
    }

    public static int[] roll(int n) {
        Random randgen = new Random();
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = randgen.nextInt(6) + 1;
        }
        return newArr;
    }

    public static boolean containsDuplicates(String[] args) {
        boolean result = true;
        for (int i = 0; i < args.length; i++) {
            for (int j = args.length - 1; j >= 0; j--) {
                if (args[i] == args[j]) {
                    return result;
                } else {
                    return result = false;
                }
            }
        }
        return result;
    }

    public static int calculatingAverage(int[] num) {
        int result = 0;
        int len = num.length;
        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }
        return result / len;
    }

    public static int arrayAverage(int[][] multiArr) {
        int max = Integer.MAX_VALUE;
        int sum = 0;
        int average = 0;
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                sum += multiArr[i][j];
            }
            average = sum / multiArr[i].length;
            sum = 0;
            if (average < max) {
                max = average;
            }
        }
        return max;
    }


//    LAB 3

    public static String map(int[][] multiArr) {

        HashSet<Integer> weather = new HashSet<>();
        String tempInfo = "";

        for (int[] week : multiArr) {
            for (int day : week) {
                weather.add(day);
            }
        }

        int max = Collections.max(weather);
        tempInfo += String.format("High: %d%n", max);
        int min = Collections.min(weather);
        tempInfo += String.format("Low: %d%n", min);

        for (int i = min; i <= max; i++){
            if (!weather.contains(i)){
                tempInfo += String.format("Never saw temperature: %d%n", i);
            }
        }
        return tempInfo;
    }

    public static String tally(List<String> votes) {


        String winner = " ";

        HashMap<String, Integer> possibleVotes = new HashMap<>();
        for(String entry : votes){
            possibleVotes.put(entry, 0);
        }

        for( String vote : votes) {
            int voteCount = possibleVotes.get(vote);
            possibleVotes.put(vote, voteCount + 1);
        }

        int mostVotes = Integer.MIN_VALUE;

        for(HashMap.Entry<String, Integer> votePossiblity : possibleVotes.entrySet()) {
            if (votePossiblity.getValue() > mostVotes){
                mostVotes = votePossiblity.getValue();
                winner = votePossiblity.getKey();

            }
        }

        return winner;

    }

}