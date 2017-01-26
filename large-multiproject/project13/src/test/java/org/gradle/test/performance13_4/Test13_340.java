package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_340 {
    private final Production13_340 production = new Production13_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}