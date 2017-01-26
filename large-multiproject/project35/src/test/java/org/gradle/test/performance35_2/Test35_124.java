package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_124 {
    private final Production35_124 production = new Production35_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}