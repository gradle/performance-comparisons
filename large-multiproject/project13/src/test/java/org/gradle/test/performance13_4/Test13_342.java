package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_342 {
    private final Production13_342 production = new Production13_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}