package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_355 {
    private final Production35_355 production = new Production35_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}