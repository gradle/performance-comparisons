package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_99 {
    private final Production40_99 production = new Production40_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}