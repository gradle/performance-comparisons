package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_57 {
    private final Production40_57 production = new Production40_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}