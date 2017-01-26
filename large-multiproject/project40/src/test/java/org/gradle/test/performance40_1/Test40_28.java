package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_28 {
    private final Production40_28 production = new Production40_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}