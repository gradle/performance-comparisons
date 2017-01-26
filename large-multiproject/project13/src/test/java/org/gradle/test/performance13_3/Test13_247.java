package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_247 {
    private final Production13_247 production = new Production13_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}