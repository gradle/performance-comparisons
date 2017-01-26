package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_467 {
    private final Production75_467 production = new Production75_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}