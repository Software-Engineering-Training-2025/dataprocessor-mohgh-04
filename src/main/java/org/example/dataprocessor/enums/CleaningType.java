package org.example.dataprocessor.enums;

import org.example.dataprocessor.strategies.cleaning.*;

public enum CleaningType {
    REMOVE_NEGATIVES {
        @Override
        public CleaningStrategy getStrategy() {
            return new RemoveNegativesCleaning();
        }
    },
    REPLACE_NEGATIVES_WITH_ZERO {
        @Override
        public CleaningStrategy getStrategy() {
            return new ReplaceNegativesWithZeroCleaning();
        }
    };

    public abstract CleaningStrategy getStrategy();
}
