package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_105 {
    private final Production13_105 production = new Production13_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}