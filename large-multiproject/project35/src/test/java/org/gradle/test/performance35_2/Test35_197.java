package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_197 {
    private final Production35_197 production = new Production35_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}