package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_470 {
    private final Production35_470 production = new Production35_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}