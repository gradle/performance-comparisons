package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_272 {
    private final Production13_272 production = new Production13_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}