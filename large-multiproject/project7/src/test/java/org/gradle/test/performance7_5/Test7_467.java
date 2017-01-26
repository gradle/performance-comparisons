package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_467 {
    private final Production7_467 production = new Production7_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}