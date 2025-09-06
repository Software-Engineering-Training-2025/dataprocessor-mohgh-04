package org.example.dataprocessor.enums;

import org.example.dataprocessor.strategies.output.*;

public enum OutputType {
    CONSOLE {
        @Override
        public OutputStrategy getStrategy() {
            return new ConsoleOutput();
        }
    },
    TEXT_FILE {
        @Override
        public OutputStrategy getStrategy() {
            return new TextFileOutput();
        }
    };

    public abstract OutputStrategy getStrategy();
}
