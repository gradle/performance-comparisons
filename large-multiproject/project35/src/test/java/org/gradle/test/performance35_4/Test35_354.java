package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_354 {
    private final Production35_354 production = new Production35_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}