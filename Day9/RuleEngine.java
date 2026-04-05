package Day9;

import java.util.*;

public class RuleEngine {
    private List<Rule> rules = new ArrayList<>();

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public void process(SensorData data) {
        for (Rule rule : rules) {
            if (rule.evaluate(data)) {
                rule.execute();
            }
        }
    }
}
