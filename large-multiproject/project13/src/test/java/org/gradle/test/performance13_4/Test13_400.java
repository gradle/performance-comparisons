package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_400 {
    private final Production13_400 production = new Production13_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}