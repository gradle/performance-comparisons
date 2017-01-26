package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_123 {
    private final Production26_123 production = new Production26_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}