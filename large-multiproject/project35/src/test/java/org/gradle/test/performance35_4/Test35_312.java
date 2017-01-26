package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_312 {
    private final Production35_312 production = new Production35_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}