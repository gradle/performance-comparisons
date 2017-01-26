package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_131 {
    private final Production35_131 production = new Production35_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}