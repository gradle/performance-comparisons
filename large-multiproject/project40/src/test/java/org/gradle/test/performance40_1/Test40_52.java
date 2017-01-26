package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_52 {
    private final Production40_52 production = new Production40_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}