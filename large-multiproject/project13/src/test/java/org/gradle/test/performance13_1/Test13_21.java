package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_21 {
    private final Production13_21 production = new Production13_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}