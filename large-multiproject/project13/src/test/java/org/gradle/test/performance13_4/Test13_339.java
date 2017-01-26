package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_339 {
    private final Production13_339 production = new Production13_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}