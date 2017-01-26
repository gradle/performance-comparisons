package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_467 {
    private final Production14_467 production = new Production14_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}