package org.example.dataprocessor.strategies.analysis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Top3FrequentCountSumAnalysis implements AnalysisStrategy {
    @Override
    public double analyze(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return 0.0;
        }

        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : data) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        ArrayList<Integer> counts = new ArrayList<>(freq.values());
        Collections.sort(counts, Collections.reverseOrder());

        double sum = 0;
        for (int i = 0; i < counts.size() && i < 3; i++) {
            sum += counts.get(i);
        }

        return sum;
    }
}
