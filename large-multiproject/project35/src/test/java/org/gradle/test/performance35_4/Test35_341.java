package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_341 {
    private final Production35_341 production = new Production35_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}