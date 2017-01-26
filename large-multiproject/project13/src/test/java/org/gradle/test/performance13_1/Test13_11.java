package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_11 {
    private final Production13_11 production = new Production13_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}