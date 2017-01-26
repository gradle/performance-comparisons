package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_25 {
    private final Production40_25 production = new Production40_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}