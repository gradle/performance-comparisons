package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_400 {
    private final Production35_400 production = new Production35_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}