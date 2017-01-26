package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_470 {
    private final Production13_470 production = new Production13_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}