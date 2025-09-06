package org.example.dataprocessor.strategies.analysis;

import java.util.Collections;
import java.util.List;

public class P90NearestRankAnalysis implements AnalysisStrategy {
    @Override
    public double analyze(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return Double.NaN;
        }

        Collections.sort(data);

        int n = data.size();
        int rank = (int) Math.ceil(0.9 * n);

        return data.get(rank - 1);
    }
}
