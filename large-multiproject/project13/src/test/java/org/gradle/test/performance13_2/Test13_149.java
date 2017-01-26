package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_149 {
    private final Production13_149 production = new Production13_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}