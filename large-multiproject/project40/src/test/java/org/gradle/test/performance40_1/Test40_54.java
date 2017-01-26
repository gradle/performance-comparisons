package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_54 {
    private final Production40_54 production = new Production40_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}