package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_368 {
    private final Production13_368 production = new Production13_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}