package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_328 {
    private final Production13_328 production = new Production13_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}