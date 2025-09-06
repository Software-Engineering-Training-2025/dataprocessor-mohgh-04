package org.example.dataprocessor.strategies.analysis;

import java.util.List;

public class StdDevAnalysis implements AnalysisStrategy {
    @Override
    public double analyze(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return Double.NaN;
        }

        double sum = 0;
        for (int n : data) {
            sum += n;
        }
        double mean = sum / data.size();

        double varianceSum = 0;
        for (int n : data) {
            varianceSum += Math.pow(n - mean, 2);
        }
        double variance = varianceSum / data.size();

        return Math.sqrt(variance);
    }
}
