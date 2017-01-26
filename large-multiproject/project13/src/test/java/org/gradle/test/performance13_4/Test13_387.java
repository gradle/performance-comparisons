package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_387 {
    private final Production13_387 production = new Production13_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}