package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_113 {
    private final Production35_113 production = new Production35_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}