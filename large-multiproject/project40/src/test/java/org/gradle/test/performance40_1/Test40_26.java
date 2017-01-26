package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_26 {
    private final Production40_26 production = new Production40_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}