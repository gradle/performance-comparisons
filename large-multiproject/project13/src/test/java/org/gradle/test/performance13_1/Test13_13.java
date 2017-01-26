package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_13 {
    private final Production13_13 production = new Production13_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}