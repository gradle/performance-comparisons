package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_32 {
    private final Production35_32 production = new Production35_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}