package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_453 {
    private final Production35_453 production = new Production35_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}