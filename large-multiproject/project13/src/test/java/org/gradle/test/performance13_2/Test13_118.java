package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_118 {
    private final Production13_118 production = new Production13_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}