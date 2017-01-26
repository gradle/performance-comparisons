package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_184 {
    private final Production35_184 production = new Production35_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}