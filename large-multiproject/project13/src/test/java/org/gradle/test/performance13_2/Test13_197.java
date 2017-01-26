package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_197 {
    private final Production13_197 production = new Production13_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}