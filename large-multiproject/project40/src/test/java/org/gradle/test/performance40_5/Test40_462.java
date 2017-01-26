package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_462 {
    private final Production40_462 production = new Production40_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}