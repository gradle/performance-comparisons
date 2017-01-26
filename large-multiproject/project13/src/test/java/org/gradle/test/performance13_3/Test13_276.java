package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_276 {
    private final Production13_276 production = new Production13_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}