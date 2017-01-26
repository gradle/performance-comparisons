package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_53 {
    private final Production40_53 production = new Production40_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}