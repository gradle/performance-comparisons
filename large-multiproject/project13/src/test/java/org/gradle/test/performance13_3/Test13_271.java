package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_271 {
    private final Production13_271 production = new Production13_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}