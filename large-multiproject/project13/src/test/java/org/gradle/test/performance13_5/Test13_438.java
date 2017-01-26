package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_438 {
    private final Production13_438 production = new Production13_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}