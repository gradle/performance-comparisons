package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_301 {
    private final Production13_301 production = new Production13_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}