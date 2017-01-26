package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_273 {
    private final Production35_273 production = new Production35_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}