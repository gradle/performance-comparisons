package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_236 {
    private final Production13_236 production = new Production13_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}