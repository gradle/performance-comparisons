package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_276 {
    private final Production35_276 production = new Production35_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}