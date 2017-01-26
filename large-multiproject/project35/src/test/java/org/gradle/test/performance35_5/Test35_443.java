package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_443 {
    private final Production35_443 production = new Production35_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}