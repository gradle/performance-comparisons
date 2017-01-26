package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_311 {
    private final Production35_311 production = new Production35_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}