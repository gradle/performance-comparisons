package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_279 {
    private final Production13_279 production = new Production13_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}