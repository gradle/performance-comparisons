package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_349 {
    private final Production35_349 production = new Production35_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}