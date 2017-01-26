package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_316 {
    private final Production13_316 production = new Production13_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}