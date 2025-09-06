package org.example.dataprocessor;

import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.strategies.analysis.AnalysisStrategy;
import org.example.dataprocessor.strategies.cleaning.CleaningStrategy;
import org.example.dataprocessor.strategies.output.OutputStrategy;

import java.util.ArrayList;
import java.util.List;

public class DataProcessorService {

    public DataProcessorService() {
    }

    public double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data) throws Exception {

        List<Integer> copy = new ArrayList<>(data);

        CleaningStrategy cleaning = cleaningType.getStrategy();
        List<Integer> cleaned = cleaning.clean(copy);

        AnalysisStrategy analysis = analysisType.getStrategy();
        double result = analysis.analyze(cleaned);

        OutputStrategy output = outputType.getStrategy();
        output.output(result);

        return result;
    }
}
