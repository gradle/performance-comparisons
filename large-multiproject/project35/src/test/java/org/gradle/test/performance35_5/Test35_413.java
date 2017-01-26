package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_413 {
    private final Production35_413 production = new Production35_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}