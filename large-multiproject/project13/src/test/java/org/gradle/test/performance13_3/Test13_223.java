package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_223 {
    private final Production13_223 production = new Production13_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}