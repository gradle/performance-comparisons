package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_129 {
    private final Production13_129 production = new Production13_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}