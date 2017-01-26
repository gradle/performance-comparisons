package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_133 {
    private final Production13_133 production = new Production13_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}