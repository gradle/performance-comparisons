package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_467 {
    private final Production87_467 production = new Production87_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}