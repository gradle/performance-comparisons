package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_410 {
    private final Production13_410 production = new Production13_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}