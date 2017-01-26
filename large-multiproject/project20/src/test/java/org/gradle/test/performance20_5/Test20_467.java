package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_467 {
    private final Production20_467 production = new Production20_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}