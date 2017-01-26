package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_59 {
    private final Production40_59 production = new Production40_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}