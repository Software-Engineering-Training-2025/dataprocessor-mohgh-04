package org.example.dataprocessor.strategies.cleaning;

import java.util.ArrayList;
import java.util.List;

public class ReplaceNegativesWithZeroCleaning implements CleaningStrategy {
    @Override
    public List<Integer> clean(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> cleaned = new ArrayList<>();
        for (int n : data) {
            if (n < 0) {
                cleaned.add(0);
            } else {
                cleaned.add(n);
            }
        }

        return cleaned;
    }
}
