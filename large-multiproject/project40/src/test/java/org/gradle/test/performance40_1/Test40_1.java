package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_1 {
    private final Production40_1 production = new Production40_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}