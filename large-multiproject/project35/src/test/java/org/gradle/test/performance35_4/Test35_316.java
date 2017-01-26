package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_316 {
    private final Production35_316 production = new Production35_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}