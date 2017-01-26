package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_9 {
    private final Production40_9 production = new Production40_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}