package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_308 {
    private final Production13_308 production = new Production13_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}