package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_115 {
    private final Production13_115 production = new Production13_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}