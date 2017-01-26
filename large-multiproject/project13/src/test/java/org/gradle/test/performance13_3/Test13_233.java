package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_233 {
    private final Production13_233 production = new Production13_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}