package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_208 {
    private final Production13_208 production = new Production13_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}