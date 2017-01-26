package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_301 {
    private final Production35_301 production = new Production35_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}