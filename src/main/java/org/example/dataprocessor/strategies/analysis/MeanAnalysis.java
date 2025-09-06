package org.example.dataprocessor.strategies.analysis;

import java.util.List;

public class MeanAnalysis implements AnalysisStrategy {
    @Override
    public double analyze(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return Double.NaN;
        }

        double sum = 0;
        for (int n : data) {
            sum += n;
        }

        return sum / data.size();
    }
}
