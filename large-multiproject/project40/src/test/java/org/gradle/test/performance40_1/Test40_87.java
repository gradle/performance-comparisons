package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_87 {
    private final Production40_87 production = new Production40_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}