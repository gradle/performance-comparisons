package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_319 {
    private final Production35_319 production = new Production35_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}