package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_5 {
    private final Production40_5 production = new Production40_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}