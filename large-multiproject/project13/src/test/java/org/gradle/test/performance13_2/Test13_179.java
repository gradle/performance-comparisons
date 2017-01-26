package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_179 {
    private final Production13_179 production = new Production13_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}