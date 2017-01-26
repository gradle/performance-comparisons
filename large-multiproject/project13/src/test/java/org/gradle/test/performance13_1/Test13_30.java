package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_30 {
    private final Production13_30 production = new Production13_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}