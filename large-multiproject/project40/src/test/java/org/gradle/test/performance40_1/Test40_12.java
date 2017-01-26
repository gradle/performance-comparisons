package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_12 {
    private final Production40_12 production = new Production40_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}