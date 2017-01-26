package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_410 {
    private final Production35_410 production = new Production35_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}