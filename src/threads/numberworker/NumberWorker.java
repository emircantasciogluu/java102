package threads.numberworker;

import java.util.List;

public class NumberWorker implements Runnable{
    private final List<Integer> sourceList;
    private final List<Integer> evenList;
    private final List<Integer> oddList;

    public NumberWorker(List<Integer> sourceList, List<Integer> evenList, List<Integer> oddList) {
        this.sourceList = sourceList;
        this.evenList = evenList;
        this.oddList = oddList;
    }

    @Override
    public void run() {
        for (Integer number: sourceList){
            if (number % 2 == 0){
                evenList.add(number);
            }else {
                oddList.add(number);
            }
        }
    }
}
