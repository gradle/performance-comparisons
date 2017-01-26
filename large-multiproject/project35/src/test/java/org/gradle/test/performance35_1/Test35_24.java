package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_24 {
    private final Production35_24 production = new Production35_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}