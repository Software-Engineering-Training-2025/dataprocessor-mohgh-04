package org.example.dataprocessor.strategies.analysis;

import java.util.Collections;
import java.util.List;

public class MedianAnalysis implements AnalysisStrategy {
    @Override
    public double analyze(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return Double.NaN;
        }

        Collections.sort(data);

        int n = data.size();
        if (n % 2 == 1) {
            return data.get(n / 2);
        } else {
            int left = data.get(n / 2 - 1);
            int right = data.get(n / 2);
            return (left + right) / 2.0;
        }
    }
}
