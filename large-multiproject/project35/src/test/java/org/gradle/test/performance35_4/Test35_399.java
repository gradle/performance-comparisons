package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_399 {
    private final Production35_399 production = new Production35_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}