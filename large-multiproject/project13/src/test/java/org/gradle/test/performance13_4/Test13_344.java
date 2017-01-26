package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_344 {
    private final Production13_344 production = new Production13_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}