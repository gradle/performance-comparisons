package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_359 {
    private final Production13_359 production = new Production13_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}