package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_489 {
    private final Production35_489 production = new Production35_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}