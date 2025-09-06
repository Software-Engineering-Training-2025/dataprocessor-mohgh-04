package org.example.dataprocessor.enums;

import org.example.dataprocessor.strategies.analysis.*;

public enum AnalysisType {
    MEAN {
        @Override
        public AnalysisStrategy getStrategy() {
            return new MeanAnalysis();
        }
    },
    MEDIAN {
        @Override
        public AnalysisStrategy getStrategy() {
            return new MedianAnalysis();
        }
    },
    STD_DEV {
        @Override
        public AnalysisStrategy getStrategy() {
            return new StdDevAnalysis();
        }
    },
    P90_NEAREST_RANK {
        @Override
        public AnalysisStrategy getStrategy() {
            return new P90NearestRankAnalysis();
        }
    },
    TOP3_FREQUENT_COUNT_SUM {
        @Override
        public AnalysisStrategy getStrategy() {
            return new Top3FrequentCountSumAnalysis();
        }
    };

    public abstract AnalysisStrategy getStrategy();
}
