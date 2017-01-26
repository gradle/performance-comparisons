package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_467 {
    private final Production25_467 production = new Production25_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}