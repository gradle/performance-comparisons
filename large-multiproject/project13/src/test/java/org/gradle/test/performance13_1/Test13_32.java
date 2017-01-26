package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_32 {
    private final Production13_32 production = new Production13_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}