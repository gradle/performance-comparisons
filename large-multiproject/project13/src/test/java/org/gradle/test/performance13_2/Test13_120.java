package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_120 {
    private final Production13_120 production = new Production13_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}