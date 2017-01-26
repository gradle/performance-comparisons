package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_341 {
    private final Production13_341 production = new Production13_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}