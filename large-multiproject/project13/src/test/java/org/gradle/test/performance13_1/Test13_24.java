package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_24 {
    private final Production13_24 production = new Production13_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}